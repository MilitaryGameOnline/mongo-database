package online.militarygame.mongodatabase.models;

import java.util.ArrayList;
import java.util.List;

//TODO
public class Commander {
	private String id = "0";
	private String name = "General";
	private String description = "Description";
	private String graphicsPath = "/commanders/general.svg";

	private List<Ability> abilities = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}
}
