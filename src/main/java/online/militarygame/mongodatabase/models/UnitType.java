package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.unit.MovementType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnitType {
	private String id;
	private String name = "New unit";
	private String graphicsName = "/units/default.svg";

	private String movementType = MovementType.FOOT;
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
	private int minRange = 1;
	private int maxRange = 1;
	private boolean canAttackStealthed = false;

	private boolean canCapture = false;

	private Map<String, Double> damageValues = new HashMap<>();
	private Map<String, Double> secondaryDamageValues = new HashMap<>();

	private int loadCapacity = 0;
	private boolean unloadedCanMove = false;
	private boolean refuelsLoaded = true;
	private double loadedHealRate = 0;
	private Set<String> loadableUnits = new HashSet<>();

	private int nearbyRefuelRange = 0;
	private double nearbyRefuelRepair = 0;
	private boolean refuelAbility = false;
	private boolean refuelTurnStart = false;
	private boolean refuelAll = false;

	private int selfDestructAbilityRange = 0;
	private double selfDestructAbilityDamage = 0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getMovementType() {
		return movementType;
	}

	public void setMovementType(String movementType) {
		this.movementType = movementType;
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

	public Map<String, Double> getDamageValues() {
		return damageValues;
	}

	public void setDamageValues(Map<String, Double> damageValues) {
		this.damageValues = damageValues;
	}

	public Map<String, Double> getSecondaryDamageValues() {
		return secondaryDamageValues;
	}

	public void setSecondaryDamageValues(Map<String, Double> secondaryDamageValues) {
		this.secondaryDamageValues = secondaryDamageValues;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public Set<String> getLoadableUnits() {
		return loadableUnits;
	}

	public void setLoadableUnits(Set<String> loadableUnits) {
		this.loadableUnits = loadableUnits;
	}

	public boolean isUnloadedCanMove() {
		return unloadedCanMove;
	}

	public void setUnloadedCanMove(boolean unloadedCanMove) {
		this.unloadedCanMove = unloadedCanMove;
	}

	public boolean isRefuelsLoaded() {
		return refuelsLoaded;
	}

	public void setRefuelsLoaded(boolean refuelsLoaded) {
		this.refuelsLoaded = refuelsLoaded;
	}

	public double getLoadedHealRate() {
		return loadedHealRate;
	}

	public void setLoadedHealRate(double loadedHealRate) {
		this.loadedHealRate = loadedHealRate;
	}

	public int getNearbyRefuelRange() {
		return nearbyRefuelRange;
	}

	public void setNearbyRefuelRange(int nearbyRefuelRange) {
		this.nearbyRefuelRange = nearbyRefuelRange;
	}

	public double getNearbyRefuelRepair() {
		return nearbyRefuelRepair;
	}

	public void setNearbyRefuelRepair(double nearbyRefuelRepair) {
		this.nearbyRefuelRepair = nearbyRefuelRepair;
	}

	public boolean isRefuelAbility() {
		return refuelAbility;
	}

	public void setRefuelAbility(boolean refuelAbility) {
		this.refuelAbility = refuelAbility;
	}

	public boolean isRefuelTurnStart() {
		return refuelTurnStart;
	}

	public void setRefuelTurnStart(boolean refuelTurnStart) {
		this.refuelTurnStart = refuelTurnStart;
	}

	public boolean isRefuelAll() {
		return refuelAll;
	}

	public void setRefuelAll(boolean refuelAll) {
		this.refuelAll = refuelAll;
	}

	public boolean isCanAttackStealthed() {
		return canAttackStealthed;
	}

	public void setCanAttackStealthed(boolean canAttackStealthed) {
		this.canAttackStealthed = canAttackStealthed;
	}

	public int getSelfDestructAbilityRange() {
		return selfDestructAbilityRange;
	}

	public void setSelfDestructAbilityRange(int selfDestructAbilityRange) {
		this.selfDestructAbilityRange = selfDestructAbilityRange;
	}

	public double getSelfDestructAbilityDamage() {
		return selfDestructAbilityDamage;
	}

	public void setSelfDestructAbilityDamage(double selfDestructAbilityDamage) {
		this.selfDestructAbilityDamage = selfDestructAbilityDamage;
	}
}
