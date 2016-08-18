
public class Run {

	public static void main(String[] args) {
		MonsterGame newGame = new MonsterGame();
		newGame.GenerateBoard();
		newGame.DisplayGame();
		// while there are monsters left
		newGame.CreatePlayer("GoJ", "Mage");
		// each turn, make the monsters move and attack
		for (Monster monster : newGame.monstersLeft) {
			monster.Move(newGame);
			monster.Attack(newGame);
		}
		
	}

}
