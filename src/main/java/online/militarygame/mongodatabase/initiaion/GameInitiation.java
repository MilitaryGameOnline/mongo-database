package online.militarygame.mongodatabase.initiaion;

import online.militarygame.mongodatabase.models.Game;

public class GameInitiation {
	public static int DEFAULT_GAME_1_ID = 1;

	public static Game makeDefaultGame1(){
		Game game = new Game();
		game.setId(DEFAULT_GAME_1_ID);
		game.setRuleSet(RulesetIniation.makeDefaultRuleSet());
		game.setMap(MapInitiation.makeExampleMap1());
		return game;
	}
}
