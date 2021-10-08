package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.unit.AttackType;
import online.militarygame.mongodatabase.enums.unit.MovementType;
import online.militarygame.mongodatabase.enums.unit.BaseType;

import java.util.HashMap;
import java.util.Map;

public class UnitType {
	private int id;
	private String name = "New unit";
	private String graphicsName = "/units/default.svg";

	private MovementType movementType = MovementType.FOOT;
	private BaseType baseType = BaseType.GROUND;
	private int movement = 1;
	private boolean banned = false;

	private double value = 10;

	private boolean limitedAmmo = false;
	private int maxAmmo = 0;
	private int maxFuel = 99;
	private int fuelPerTurn = 0;
	private boolean destroyOnFuelOut = false;
	private boolean canStealth = false;

	private boolean attackAfterMove = true;
	private boolean counterAttackMelee = true;
	private boolean counterAttackRanged = false;
	private AttackType attackType = AttackType.MELEE;
	private int minRange = 1;
	private int maxRange = 1;

	private boolean canCapture = false;

	private Map<Integer, Double> damageValues = new HashMap<>();

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

	public String getGraphicsName() {
		return graphicsName;
	}

	public void setGraphicsName(String graphicsName) {
		this.graphicsName = graphicsName;
	}

	public MovementType getMovementType() {
		return movementType;
	}

	public void setMovementType(MovementType movementType) {
		this.movementType = movementType;
	}

	public BaseType getBaseType() {
		return baseType;
	}

	public void setBaseType(BaseType baseType) {
		this.baseType = baseType;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public boolean isBanned() {
		return banned;
	}

	public void setBanned(boolean banned) {
		this.banned = banned;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isLimitedAmmo() {
		return limitedAmmo;
	}

	public void setLimitedAmmo(boolean limitedAmmo) {
		this.limitedAmmo = limitedAmmo;
	}

	public int getMaxAmmo() {
		return maxAmmo;
	}

	public void setMaxAmmo(int maxAmmo) {
		this.maxAmmo = maxAmmo;
	}

	public int getMaxFuel() {
		return maxFuel;
	}

	public void setMaxFuel(int maxFuel) {
		this.maxFuel = maxFuel;
	}

	public int getFuelPerTurn() {
		return fuelPerTurn;
	}

	public void setFuelPerTurn(int fuelPerTurn) {
		this.fuelPerTurn = fuelPerTurn;
	}

	public boolean isDestroyOnFuelOut() {
		return destroyOnFuelOut;
	}

	public void setDestroyOnFuelOut(boolean destroyOnFuelOut) {
		this.destroyOnFuelOut = destroyOnFuelOut;
	}

	public boolean isCanStealth() {
		return canStealth;
	}

	public void setCanStealth(boolean canStealth) {
		this.canStealth = canStealth;
	}

	public boolean isAttackAfterMove() {
		return attackAfterMove;
	}

	public void setAttackAfterMove(boolean attackAfterMove) {
		this.attackAfterMove = attackAfterMove;
	}

	public boolean isCounterAttackMelee() {
		return counterAttackMelee;
	}

	public void setCounterAttackMelee(boolean counterAttackMelee) {
		this.counterAttackMelee = counterAttackMelee;
	}

	public boolean isCounterAttackRanged() {
		return counterAttackRanged;
	}

	public void setCounterAttackRanged(boolean counterAttackRanged) {
		this.counterAttackRanged = counterAttackRanged;
	}

	public AttackType getAttackType() {
		return attackType;
	}

	public void setAttackType(AttackType attackType) {
		this.attackType = attackType;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public boolean isCanCapture() {
		return canCapture;
	}

	public void setCanCapture(boolean canCapture) {
		this.canCapture = canCapture;
	}

	public Map<Integer, Double> getDamageValues() {
		return damageValues;
	}

	public void setDamageValues(Map<Integer, Double> damageValues) {
		this.damageValues = damageValues;
	}
}
