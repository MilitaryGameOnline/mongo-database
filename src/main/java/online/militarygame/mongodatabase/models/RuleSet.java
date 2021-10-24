package online.militarygame.mongodatabase.models;


import online.militarygame.mongodatabase.enums.GameType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RuleSet {
	private int id;
	private String name = "New rule set";
	private boolean customRuleSet = false;

	//Unit id, unit type map
	private ArrayList<UnitType> unitTypes = new ArrayList<>();
	//Tile id, tile type map;
	private ArrayList<TileType> tileTypes = new ArrayList<>();

	private ArrayList<Commander> availableCommanders = new ArrayList<>();

	private GameType gameType = GameType.STANDARD;

	private double timePerTurn = 4;
	private double timePerProduction = 4;
	private double timePerUnit = 4;
	private double timePerValue = 4; //Time player gets for each valueForTime
	private double valueForTime = 50;
	private double initialReserveTime = 0;
	private double reserveTimeBuildupMultiplier = 0.5;
	private double reserveTimePerTurnMultiplier = 0.5;

	private double moneyPerCapture = 10;
	private int pointsToCapture = 20;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCustomRuleSet() {
		return customRuleSet;
	}

	public void setCustomRuleSet(boolean customRuleSet) {
		this.customRuleSet = customRuleSet;
	}

	public ArrayList<UnitType> getUnitTypes() {
		return unitTypes;
	}

	public void setUnitTypes(ArrayList<UnitType> unitTypes) {
		this.unitTypes = unitTypes;
	}

	public ArrayList<TileType> getTileTypes() {
		return tileTypes;
	}

	public void setTileTypes(ArrayList<TileType> tileTypes) {
		this.tileTypes = tileTypes;
	}

	public ArrayList<Commander> getAvailableCommanders() {
		return availableCommanders;
	}

	public void setAvailableCommanders(ArrayList<Commander> availableCommanders) {
		this.availableCommanders = availableCommanders;
	}

	public GameType getGameType() {
		return gameType;
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}

	public double getTimePerTurn() {
		return timePerTurn;
	}

	public void setTimePerTurn(double timePerTurn) {
		this.timePerTurn = timePerTurn;
	}

	public double getTimePerProduction() {
		return timePerProduction;
	}

	public void setTimePerProduction(double timePerProduction) {
		this.timePerProduction = timePerProduction;
	}

	public double getTimePerUnit() {
		return timePerUnit;
	}

	public void setTimePerUnit(double timePerUnit) {
		this.timePerUnit = timePerUnit;
	}

	public double getTimePerValue() {
		return timePerValue;
	}

	public void setTimePerValue(double timePerValue) {
		this.timePerValue = timePerValue;
	}

	public double getValueForTime() {
		return valueForTime;
	}

	public void setValueForTime(double valueForTime) {
		this.valueForTime = valueForTime;
	}

	public double getInitialReserveTime() {
		return initialReserveTime;
	}

	public void setInitialReserveTime(double initialReserveTime) {
		this.initialReserveTime = initialReserveTime;
	}

	public double getReserveTimeBuildupMultiplier() {
		return reserveTimeBuildupMultiplier;
	}

	public void setReserveTimeBuildupMultiplier(double reserveTimeBuildupMultiplier) {
		this.reserveTimeBuildupMultiplier = reserveTimeBuildupMultiplier;
	}

	public double getReserveTimePerTurnMultiplier() {
		return reserveTimePerTurnMultiplier;
	}

	public void setReserveTimePerTurnMultiplier(double reserveTimePerTurnMultiplier) {
		this.reserveTimePerTurnMultiplier = reserveTimePerTurnMultiplier;
	}

	public double getMoneyPerCapture() {
		return moneyPerCapture;
	}

	public void setMoneyPerCapture(double moneyPerCapture) {
		this.moneyPerCapture = moneyPerCapture;
	}

	public int getPointsToCapture() {
		return pointsToCapture;
	}

	public void setPointsToCapture(int pointsToCapture) {
		this.pointsToCapture = pointsToCapture;
	}
}
