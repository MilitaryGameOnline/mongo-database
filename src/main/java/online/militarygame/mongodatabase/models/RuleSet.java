package online.militarygame.mongodatabase.models;


import online.militarygame.mongodatabase.enums.GameType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleSet {
	private int id;
	private String name = "New rule set";
	private boolean customRuleSet = false;

	//Unit id, unit type map
	private Map<Integer, UnitType> unitTypes = new HashMap<>();
	//Tile id, tile type map;
	private Map<Integer, TileType> tileTypes = new HashMap<>();

	private Map<Integer, Commander> availableCommanders = new HashMap<>();

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
}
