package online.militarygame.mongodatabase.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {
	private long id = 0L;
	private boolean isPrivate = false;
	private String password;
	private boolean isLadder = false;

	private Date turnStarted;
	private Date started;
	private Date ended;

	private GameMap map;
	private RuleSet ruleSet;
	private List<Player> players = new ArrayList<>();

	private int turn = 0; //How many turns have passed
	private int playerTurn = 0; //Represent whos turn it is.
	private List<Move> moveHistory = new ArrayList<>();
}
