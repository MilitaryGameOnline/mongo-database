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

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public int getFuelRemaining() {
		return fuelRemaining;
	}

	public void setFuelRemaining(int fuelRemaining) {
		this.fuelRemaining = fuelRemaining;
	}

	public int getAmmoRemaining() {
		return ammoRemaining;
	}

	public void setAmmoRemaining(int ammoRemaining) {
		this.ammoRemaining = ammoRemaining;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public UnitStatus getUnitStatus() {
		return unitStatus;
	}

	public void setUnitStatus(UnitStatus unitStatus) {
		this.unitStatus = unitStatus;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
}
