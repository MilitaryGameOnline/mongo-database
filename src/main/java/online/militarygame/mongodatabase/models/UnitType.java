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
}
