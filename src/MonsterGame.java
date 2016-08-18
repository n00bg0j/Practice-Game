import java.util.Random;

public class MonsterGame {
	// state of game board
	char[][] gameState = new char[10][10];
	// coordinates of player
	int[] playerCoord;
	// coordinates of monsters
	int[][] monsterCoords;
	// random generator
	Random rand = new Random();
	
	// use default constructor for MonsterGame

	// generate a new board
	public void GenerateBoard() {
		// randomly generate 50 - 70 walls
		
		// randomly generate 10 - 15 monsters
	}
	
	public void GenerateBoard(int numWalls, int numMonsters) {
		// generate numWalls number of walls
		
		// generate numMonsters number of monsters
	}
	
	// create character
	public void CreatePlayer() {
		
	}
	
	// display game state to user
	public String DisplayGame() {
		for (int i = 0; i < 30; i++) {
			System.out.println("-");
		}
		// for each element in gameState, print it with dividers
		for (char[] row : gameState) {
			for (char element : row) {
				System.out.println("|" + element + "|");
			}
		}
		for (int i = 0; i < 30; i++) {
			System.out.println("-");
		}	
	}
}
