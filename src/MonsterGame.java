import java.util.ArrayList;

public class MonsterGame {
	// state of game board, make it static!
	String[][] gameState = new String[10][10];
	// player for this game
	Player player;
	// list of monsters
	ArrayList<Monster> monstersLeft = new ArrayList<Monster>(30);

	// use default constructor for MonsterGame

	// generate a new board
	public void GenerateBoard() {
		for (int i = 0; i < gameState.length; i++) {
			for (int j = 0; j < gameState[i].length; j++) {
				gameState[i][j] = " ";
			}
		}
		// randomly generate 50 - 70 walls
		int numWalls = RandIntGen.randInt(15, 30);
		// add the walls to the game state!
		GenerateWall(numWalls);
		// randomly generate 10 - 15 monsters
		int numMonsters = RandIntGen.randInt(6, 10);
		GenerateMonster(numMonsters);
	}
	// generate a new board, overloading - BAD DESIGN?
	public void GenerateBoard(int numWalls, int numMonsters) {
		for (int i = 0; i < gameState.length; i++) {
			for (int j = 0; j < gameState[i].length; j++)  {
				gameState[i][j] = " ";
			}
		}
		// generate numWalls number of walls
		GenerateWall(numWalls);
		// generate numMonsters number of monsters
		GenerateMonster(numMonsters);
	}
	
	// create character
	public Player CreatePlayer(MonsterGame game, String name, String Class) {
		// set the player as this games player!
		return player = new Player(game, name, Class);
	}
	
	// display game state to user
	public void DisplayGame() {
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
		// for each element in gameState, print it with dividers
		for (String[] row : gameState) {
			for (String element : row) {
				System.out.print("|" + element + "|");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}	
	}
	
	// helpers
	public void GenerateWall(int numWalls) {
		for (int i = 0; i < numWalls; i++) {
			int x = RandIntGen.randInt(0, 9);
			int y = RandIntGen.randInt(0, 9);
			while (gameState[x][y] == "X" || gameState[x][y] == "M") {
				x = RandIntGen.randInt(0, 9);
				y = RandIntGen.randInt(0, 9);
			}
			gameState[x][y] = "X";
		}
	}

	public void GenerateMonster(int numMonsters) {
		for (int i = 0; i < numMonsters; i++) {
			int x = RandIntGen.randInt(0, 9);
			int y = RandIntGen.randInt(0, 9);
			while (gameState[x][y] == "X" || gameState[x][y] == "M") {
				x = RandIntGen.randInt(0, 9);
				y = RandIntGen.randInt(0, 9);
			}
			Monster newMonster = new Monster(x, y);
			monstersLeft.add(newMonster);
			gameState[x][y] = "M";
		}
	}
	
	public String[][] getGameBoard() {
		String[][] temp =  this.gameState;
		return temp;
	}
}
