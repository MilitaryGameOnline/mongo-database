package online.militarygame.mongodatabase.initiaion;

import online.militarygame.mongodatabase.models.Commander;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommanderInitiation {
	public static final Integer GENERAL = 0;

	public static ArrayList<Commander> makeCommanderMap1()
	{
		ArrayList<Commander> commanderMap = new ArrayList<>();

		Commander general = new Commander();
		general.setId(GENERAL);
		general.setName("General");
		general.setDescription("Does literally nothing");
		general.setGraphicsPath("/commanders/general.svg");
		general.setAbilities(new ArrayList<>());
		putToMap(general, commanderMap);

		return commanderMap;
	}

	private static void putToMap(Commander commander, ArrayList<Commander> commanderMap) {
		commanderMap.add(commander);
	}
}
