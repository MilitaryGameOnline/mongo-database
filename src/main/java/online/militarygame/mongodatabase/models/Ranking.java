package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.GameType;

public class Ranking {
	private GameType gameType;
	private Double score;

	public GameType getGameType() {
		return gameType;
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
}
