package online.militarygame.mongodatabase.initiaion;

import online.militarygame.mongodatabase.models.coordinate.Coordinate;
import online.militarygame.mongodatabase.models.GameMap;
import online.militarygame.mongodatabase.models.coordinate.TileTypeCoordinate;

import java.util.List;
import java.util.Map;

public class MapInitiation {
	public static final int EXAMPLE_MAP_1_ID = 1;

	public static GameMap makeExampleMap1(){
		GameMap gameMap = new GameMap();
		gameMap.setId(EXAMPLE_MAP_1_ID);
		gameMap.setName("EXAMPLE_MAP_1_ID");
		gameMap.setBoundsX(8);
		gameMap.setBoundsY(8);
		fillMap(gameMap, TileInitiation.GRASS);

		return gameMap;
	}

	private static void fillMap(GameMap gameMap, Integer tileType) {
		List<TileTypeCoordinate> tileTypeCoordinates = gameMap.getTileTypeCoordinates();
		for(int x = 0; x < gameMap.getBoundsX(); x++){
			for(int y = 0; y < gameMap.getBoundsY(); y++) {
				TileTypeCoordinate tileTypeCoordinate = new TileTypeCoordinate();
				Coordinate coordinate = new Coordinate();
				coordinate.setX(x);
				coordinate.setY(y);
				tileTypeCoordinate.setCoordinate(coordinate);
				tileTypeCoordinate.setTileType(tileType);
				tileTypeCoordinates.add(tileTypeCoordinate);
			}
		}
	}
}
