package online.militarygame.mongodatabase.initiaion;

import online.militarygame.mongodatabase.models.Commander;
import online.militarygame.mongodatabase.models.RuleSet;
import online.militarygame.mongodatabase.models.TileType;
import online.militarygame.mongodatabase.models.UnitType;

import java.util.Map;

public class RulesetIniation {
	public static int DEFAULT_1_ID = 1;

	public static RuleSet makeDefaultRuleSet(){
		RuleSet ruleSet = new RuleSet();
		Map<String, TileType> tileTypeMap = TileInitiation.makeTileTypeMap1();
		Map<String, UnitType> unitTypes = UnitInitiation.makeUnitTypeMap1();
		Map<String, Commander> commanders = CommanderInitiation.makeCommanderMap1();
		ruleSet.setTileTypes(tileTypeMap);
		ruleSet.setUnitTypes(unitTypes);
		ruleSet.setAvailableCommanders(commanders);
		ruleSet.setId(DEFAULT_1_ID);
		return ruleSet;
	}
}
