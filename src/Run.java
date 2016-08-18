
public class Run {

	public static void main(String[] args) {
		MonsterGame newGame = new MonsterGame();
		newGame.GenerateBoard();
		// while there are monsters left
		Player player1 = newGame.CreatePlayer(newGame, "GoJ", "Mage");
		// start reading inputs
		// parse inputs, they will start with "move", "attack", or "[skill name]"
		// each turn, make the monsters move and attack
		newGame.DisplayGame();
		for (Monster monster : newGame.monstersLeft) {
			monster.Move(newGame);
			monster.Attack(newGame);
		}
		
	}

}
