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

}
