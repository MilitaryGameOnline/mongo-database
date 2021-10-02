package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.unit.UnitStatus;

public class Unit {
	private int typeId;
	private double health = 100D;
	private int fuelRemaining = 99;
	private int ammoRemaining = 0;
	private int player = 0;
	private UnitStatus unitStatus = UnitStatus.MOVED;
	private boolean hidden = false;
}
