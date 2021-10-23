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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<Integer> getCommanders() {
		return commanders;
	}

	public void setCommanders(List<Integer> commanders) {
		this.commanders = commanders;
	}

	public double getAbilityBuildup() {
		return abilityBuildup;
	}

	public void setAbilityBuildup(double abilityBuildup) {
		this.abilityBuildup = abilityBuildup;
	}

	public int getAbilityStatus() {
		return abilityStatus;
	}

	public void setAbilityStatus(int abilityStatus) {
		this.abilityStatus = abilityStatus;
	}

	public PlayerStatus getPlayerStatus() {
		return playerStatus;
	}

	public void setPlayerStatus(PlayerStatus playerStatus) {
		this.playerStatus = playerStatus;
	}

	public double getMoneys() {
		return moneys;
	}

	public void setMoneys(double moneys) {
		this.moneys = moneys;
	}

	public double getReserveTime() {
		return reserveTime;
	}

	public void setReserveTime(double reserveTime) {
		this.reserveTime = reserveTime;
	}

	public double getTurnTimeRemaining() {
		return turnTimeRemaining;
	}

	public void setTurnTimeRemaining(double turnTimeRemaining) {
		this.turnTimeRemaining = turnTimeRemaining;
	}
}
