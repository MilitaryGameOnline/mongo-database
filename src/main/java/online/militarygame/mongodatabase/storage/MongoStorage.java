package online.militarygame.mongodatabase.storage;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.UpdateOptions;
import online.militarygame.mongodatabase.initiaion.RulesetIniation;
import online.militarygame.mongodatabase.models.*;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

public class MongoStorage {

	private final MongoCollection<User> userCollection;
	private final MongoCollection<Game> gameCollection;
	private final MongoCollection<GameMap> savedMapsCollection;
	private final MongoCollection<RuleSet> officialRuleSetCollection;

	public MongoStorage(String host, Integer port) {
		CodecRegistry codec = CodecRegistries.fromRegistries(MongoClient.getDefaultCodecRegistry(),
				CodecRegistries.fromProviders(PojoCodecProvider.builder()
						.register("online.militarygame.mongodatabase.models")
						.build()));
		MongoClientOptions options = MongoClientOptions.builder()
				.codecRegistry(codec)
				.maxConnectionIdleTime(60000)
				.build();

		ServerAddress serverAddress = new ServerAddress(host, port);
		MongoClient mongoClient = new MongoClient(serverAddress, options);
		MongoDatabase militaryGame = mongoClient.getDatabase("militaryGame");
		userCollection = militaryGame.getCollection("user", User.class);
		gameCollection = militaryGame.getCollection("game", Game.class);
		savedMapsCollection = militaryGame.getCollection("savedMap", GameMap.class);
		officialRuleSetCollection = militaryGame.getCollection("officialRuleSet", RuleSet.class);

		userCollection.createIndex(Indexes.descending("name"));
		userCollection.createIndex(Indexes.descending("email"));

		gameCollection.createIndex(Indexes.descending("started"));
		gameCollection.createIndex(Indexes.descending("ended"));
		gameCollection.createIndex(Indexes.descending("players.userId"));

		savedMapsCollection.createIndex(Indexes.descending("name"));
		officialRuleSetCollection.createIndex(Indexes.descending("name"));

		addRuleSet(RulesetIniation.makeDefaultRuleSet());
	}

	public void addRuleSet(RuleSet ruleSet){
		Bson filter = Filters.eq("_id", ruleSet.getId());
		officialRuleSetCollection.replaceOne(filter, ruleSet, new UpdateOptions().upsert(true));
	}

	public RuleSet getDefaultRules(){
		Bson filter = Filters.eq("_id", RulesetIniation.DEFAULT_1_ID);
		return officialRuleSetCollection.find().filter(filter).first();
	}
}
