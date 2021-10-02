package online.militarygame.mongodatabase;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Indexes;
import online.militarygame.mongodatabase.models.*;
import org.bson.codecs.configuration.CodecRegistry;

public class MongoStorage {

	private MongoCollection<User> userCollection;
	private MongoCollection<Game> gameCollection;
	private MongoCollection<GameMap> savedMapsCollection;
	private MongoCollection<RuleSet> officialRuleSetCollection;

	public MongoStorage(String host, Integer port) {
		ServerAddress serverAddress = new ServerAddress(host, port);
		MongoClient mongoClient = new MongoClient(serverAddress);
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
	}
}
