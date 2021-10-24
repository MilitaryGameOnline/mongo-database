package online.militarygame.mongodatabase.models.coordinate;

import online.militarygame.mongodatabase.models.Unit;

public class UnitCoordinate {
	private Coordinate coordinate;
	private Unit unit;

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
}
