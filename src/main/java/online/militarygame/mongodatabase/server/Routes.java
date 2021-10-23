package online.militarygame.mongodatabase.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import online.militarygame.mongodatabase.models.RuleSet;
import online.militarygame.mongodatabase.storage.MongoStorage;
import spark.Request;
import spark.Response;
import spark.Spark;

public class Routes {

	private final MongoStorage mongoStorage;
	private ObjectMapper objectMapper = new ObjectMapper();

	public Routes(MongoStorage mongoStorage) {
		this.mongoStorage = mongoStorage;
	}

	public void start(){
		Spark.get("/rules", this::getRules);
	}

	private Object getRules(Request request, Response response) throws JsonProcessingException {
		RuleSet defaultRules = mongoStorage.getDefaultRules();
		String json = objectMapper.writeValueAsString(defaultRules);
		return json;
	}

	public static void main(String[] args) {
		MongoStorage localhost = new MongoStorage("localhost", 27017);
		Routes routes = new Routes(localhost);
		routes.start();
	}
}
