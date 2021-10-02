package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.PlayerStatus;

import java.util.List;

public class Player {
	private long userId;
	private int order;
	private List<Integer> commanders;

	private double abilityBuildup = 0D;
	private int abilityStatus = 0;
	private PlayerStatus playerStatus = PlayerStatus.NOT_ACTIVE;
	private double moneys = 0D;

	private double reserveTime = 0D;
	private double turnTimeRemaining = 0D;
}
