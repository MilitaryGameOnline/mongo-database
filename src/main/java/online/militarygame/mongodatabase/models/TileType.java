package online.militarygame.mongodatabase.models;

import online.militarygame.mongodatabase.enums.unit.MovementType;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class TileType {
	private int id;
	private String name = "Tile";
	private String description = "Description";
	private String graphicsPath = "/tiles/tile.svg";

	private boolean capturable = false;
	private boolean providesFunds = false;
	private boolean providesTech = false;
	private boolean presidentOffice = false;

	private double defenseRating = 0;

	private Map<MovementType, Integer> movementTypeCosts = new HashMap<>();
	private LinkedHashSet<Integer> unitsCapableOfProducing = new LinkedHashSet<>();

	private boolean canProduce(int unitId){
		return unitsCapableOfProducing.contains(unitId);
	}
}
