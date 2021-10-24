package online.militarygame.mongodatabase.models;

import java.util.ArrayList;

public class User {
	private long id = 0L;
	String name = "Default";
	String password = "password";
	String email = "email";

	private ArrayList<Ranking> rankings = new ArrayList<>();

	public User() {
	}

	public User(long id, String name, String password, String email, ArrayList<Ranking> rankings) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.rankings = rankings;
	}
}
