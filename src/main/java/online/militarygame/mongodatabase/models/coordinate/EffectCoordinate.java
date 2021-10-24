package online.militarygame.mongodatabase.models.coordinate;

import online.militarygame.mongodatabase.models.Effect;

public class EffectCoordinate {
	private Coordinate coordinate;
	private Effect effect;

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
	}
}
