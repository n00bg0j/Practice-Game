import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MonsterGame newGame = new MonsterGame();
		newGame.GenerateBoard();
		String playerName = "";
		String playerClass = "";
		String move = "";
	    System.out.print("Enter your name:");
	    playerName = br.readLine();
	    System.out.print("Choose your Class (Warrior, Mage, or Thief):");
	    playerClass = br.readLine();
	    System.out.println(playerClass);
	    // create Player
		Player player1 = newGame.CreatePlayer(newGame, playerName, playerClass);
		// each turn, make the monsters move and attack
		newGame.DisplayGame();
		while (true) {
			System.out.print("Next move?");
			move = br.readLine();
			String[] input = move.split(" ");
			if (move.equalsIgnoreCase("q")) {
				System.out.println("Pussy");
				break;
			} else if (move == "HP") {
				player1.showHP();
			} else if (move == "Skills") {
				player1.showSkills();
			} else if (input[0] == "Move" && input.length == 2) {
				player1.Move(newGame, input[1]);
			} else if (input[0] == "Attack" && input.length == 2) {
				player1.Attack(newGame, input[1], "Attack");
			} else if (player1.skillSet.containsKey(input[0]) && input.length == 2) {
				player1.Attack(newGame, input[1], input[0]);
			} else {
				System.out.println("Invalid move!");
			}
			// remember to get rid of dead monsters
			for (Monster monster : newGame.monstersLeft) {
				if (monster.Alive.equals(false)) {
					newGame.gameState[monster.Pos[0]][monster.Pos[1]] = " ";
					newGame.monstersLeft.remove(monster);
				}
				monster.Move(newGame);
				monster.Attack(newGame);
			}
			newGame.DisplayGame();
		}
	}
}
