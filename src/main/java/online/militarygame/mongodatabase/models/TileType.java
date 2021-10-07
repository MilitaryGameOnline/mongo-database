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
	private double defenseRating = 0;

	private boolean capturable = false;
	private boolean providesFunds = false;
	private boolean providesTech = false;
	private boolean presidentOffice = false;

	private Map<MovementType, Integer> movementTypeCosts = new HashMap<>();
	private LinkedHashSet<Integer> unitsCapableOfProducing = new LinkedHashSet<>();

	private boolean canProduce(int unitId){
		return unitsCapableOfProducing.contains(unitId);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGraphicsPath() {
		return graphicsPath;
	}

	public void setGraphicsPath(String graphicsPath) {
		this.graphicsPath = graphicsPath;
	}

	public boolean isCapturable() {
		return capturable;
	}

	public void setCapturable(boolean capturable) {
		this.capturable = capturable;
	}

	public boolean isProvidesFunds() {
		return providesFunds;
	}

	public void setProvidesFunds(boolean providesFunds) {
		this.providesFunds = providesFunds;
	}

	public boolean isProvidesTech() {
		return providesTech;
	}

	public void setProvidesTech(boolean providesTech) {
		this.providesTech = providesTech;
	}

	public boolean isPresidentOffice() {
		return presidentOffice;
	}

	public void setPresidentOffice(boolean presidentOffice) {
		this.presidentOffice = presidentOffice;
	}

	public double getDefenseRating() {
		return defenseRating;
	}

	public void setDefenseRating(double defenseRating) {
		this.defenseRating = defenseRating;
	}

	public Map<MovementType, Integer> getMovementTypeCosts() {
		return movementTypeCosts;
	}

	public void setMovementTypeCosts(Map<MovementType, Integer> movementTypeCosts) {
		this.movementTypeCosts = movementTypeCosts;
	}

	public LinkedHashSet<Integer> getUnitsCapableOfProducing() {
		return unitsCapableOfProducing;
	}

	public void setUnitsCapableOfProducing(LinkedHashSet<Integer> unitsCapableOfProducing) {
		this.unitsCapableOfProducing = unitsCapableOfProducing;
	}
}
