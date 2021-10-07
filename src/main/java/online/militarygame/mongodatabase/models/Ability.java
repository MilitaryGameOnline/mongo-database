package online.militarygame.mongodatabase.models;

public class Ability {
	private double buildup = 1000;
	private String name = "Ability";
	private String Description = "Description";

	public double getBuildup() {
		return buildup;
	}

	public void setBuildup(double buildup) {
		this.buildup = buildup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
