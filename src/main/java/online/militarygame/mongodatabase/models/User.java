package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.GameType;

import java.util.HashMap;
import java.util.Map;

public class User {
	private long id = 0L;
	String name = "Default";
	String password = "password";
	String email = "email";

	private Map<GameType, Double> rankings = new HashMap<>();
}
