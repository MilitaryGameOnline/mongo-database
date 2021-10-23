package online.militarygame.mongodatabase.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {
	private long id = 0L;
	private boolean isPrivate = false;
	private String password;
	private boolean isLadder = false;

	private Date turnStarted;
	private Date started;
	private Date ended;

	private GameMap map;
	private RuleSet ruleSet;
	private List<Player> players = new ArrayList<>();

	private int turn = 0; //How many turns have passed
	private int playerTurn = 0; //Represent whos turn it is.
	private List<Move> moveHistory = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean aPrivate) {
		isPrivate = aPrivate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLadder() {
		return isLadder;
	}

	public void setLadder(boolean ladder) {
		isLadder = ladder;
	}

	public Date getTurnStarted() {
		return turnStarted;
	}

	public void setTurnStarted(Date turnStarted) {
		this.turnStarted = turnStarted;
	}

	public Date getStarted() {
		return started;
	}

	public void setStarted(Date started) {
		this.started = started;
	}

	public Date getEnded() {
		return ended;
	}

	public void setEnded(Date ended) {
		this.ended = ended;
	}

	public GameMap getMap() {
		return map;
	}

	public void setMap(GameMap map) {
		this.map = map;
	}

	public RuleSet getRuleSet() {
		return ruleSet;
	}

	public void setRuleSet(RuleSet ruleSet) {
		this.ruleSet = ruleSet;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getPlayerTurn() {
		return playerTurn;
	}

	public void setPlayerTurn(int playerTurn) {
		this.playerTurn = playerTurn;
	}

	public List<Move> getMoveHistory() {
		return moveHistory;
	}

	public void setMoveHistory(List<Move> moveHistory) {
		this.moveHistory = moveHistory;
	}
}
