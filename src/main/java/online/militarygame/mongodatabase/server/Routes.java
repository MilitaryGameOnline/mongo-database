package online.militarygame.mongodatabase.server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import online.militarygame.mongodatabase.models.Game;
import online.militarygame.mongodatabase.models.RuleSet;
import online.militarygame.mongodatabase.storage.MongoStorage;
import spark.Request;
import spark.Response;
import spark.Spark;

public class Routes {
	public static final int DEFAULT_PORT = 4567;
	private final MongoStorage mongoStorage;
	private ObjectMapper objectMapper = new ObjectMapper();

	public Routes(MongoStorage mongoStorage) {
		this.mongoStorage = mongoStorage;
	}

	public void start(){
		start(DEFAULT_PORT);
	}

	public void start(int port){
		Spark.port(port);
		Spark.after((request, response) -> {
			response.header("Access-Control-Allow-Origin", "*");
		});
		Spark.get(" ", this::getDefaultRules);
		Spark.get("/default/game", this::getDefaultGame);
	}

	private Object getDefaultGame(Request request, Response response) throws JsonProcessingException {
		System.out.println("getDefaultGame");
		Game defaultGame = mongoStorage.getDefaultGame();
		String json = objectMapper.writeValueAsString(defaultGame);
		return json;
	}

	private Object getDefaultRules(Request request, Response response) throws JsonProcessingException {
		System.out.println("getDefaultRules");
		RuleSet defaultRules = mongoStorage.getDefaultRules();
		String json = objectMapper.writeValueAsString(defaultRules);
		return json;
	}

	public static void main(String[] args) {
		MongoStorage localhost = new MongoStorage("localhost", 27017);
		Routes routes = new Routes(localhost);
		routes.start();
		System.out.println("SERVER ON!");
	}
}
