package online.militarygame.mongodatabase.models.coordinate;

public class TileTypeCoordinate {
	private Coordinate coordinate;
	private int tileType;

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public int getTileType() {
		return tileType;
	}

	public void setTileType(int tileType) {
		this.tileType = tileType;
	}
}
