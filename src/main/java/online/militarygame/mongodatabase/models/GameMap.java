package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.models.coordinate.Coordinate;
import online.militarygame.mongodatabase.models.coordinate.EffectCoordinate;
import online.militarygame.mongodatabase.models.coordinate.TileTypeCoordinate;
import online.militarygame.mongodatabase.models.coordinate.UnitCoordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameMap {
	private long id = 0L;
	private String name = "Map";

	private List<UnitCoordinate> units = new ArrayList<>();
	private List<TileTypeCoordinate> tileTypeCoordinates = new ArrayList<>();
	private List<EffectCoordinate> effects = new ArrayList<>();
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

	public List<UnitCoordinate> getUnits() {
		return units;
	}

	public void setUnits(List<UnitCoordinate> units) {
		this.units = units;
	}

	public List<TileTypeCoordinate> getTileTypeCoordinates() {
		return tileTypeCoordinates;
	}

	public void setTileTypeCoordinates(List<TileTypeCoordinate> tileTypeCoordinates) {
		this.tileTypeCoordinates = tileTypeCoordinates;
	}

	public List<EffectCoordinate> getEffects() {
		return effects;
	}

	public void setEffects(List<EffectCoordinate> effects) {
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
