package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.unit.MovementType;

public class MovementTypeCost {
	private MovementType movementType;
	private Integer cost;

	public MovementTypeCost() {
	}

	public MovementTypeCost(MovementType movementType, Integer cost) {
		this.movementType = movementType;
		this.cost = cost;
	}

	public MovementType getMovementType() {
		return movementType;
	}

	public void setMovementType(MovementType movementType) {
		this.movementType = movementType;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}
}
