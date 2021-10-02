package online.militarygame.mongodatabase.models;

import java.util.ArrayList;
import java.util.List;

//TODO
public class Commander {
	private int id = 0;
	private String name = "General";
	private String graphicsPath = "/commanders/general.svg";
	private boolean publicCommander = false;

	private List<Ability> abilities = new ArrayList<>();
}
