package online.militarygame.mongodatabase.models;

import java.util.HashMap;
import java.util.Map;

public class GameMap {
	private long id = 0L;
	private String name = "Map";

	private Map<Coordinate, Unit> units = new HashMap<>();
	private Map<Coordinate, Integer> tileTypeCoordinates = new HashMap<>();
	private Map<Coordinate, Effect> effects = new HashMap<>();
	private int boundsX = 1;
	private int boundsY = 1;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Coordinate, Unit> getUnits() {
		return units;
	}

	public void setUnits(Map<Coordinate, Unit> units) {
		this.units = units;
	}

	public Map<Coordinate, Integer> getTileTypeCoordinates() {
		return tileTypeCoordinates;
	}

	public void setTileTypeCoordinates(Map<Coordinate, Integer> tileTypeCoordinates) {
		this.tileTypeCoordinates = tileTypeCoordinates;
	}

	public Map<Coordinate, Effect> getEffects() {
		return effects;
	}

	public void setEffects(Map<Coordinate, Effect> effects) {
		this.effects = effects;
	}

	public int getBoundsX() {
		return boundsX;
	}

	public void setBoundsX(int boundsX) {
		this.boundsX = boundsX;
	}

	public int getBoundsY() {
		return boundsY;
	}

	public void setBoundsY(int boundsY) {
		this.boundsY = boundsY;
	}
}
