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

	public User(long id, String name, String password, String email, Map<GameType, Double> rankings) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.rankings = rankings;
	}
}
