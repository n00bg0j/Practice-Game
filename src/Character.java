import java.util.HashMap;
import java.util.Map;

public abstract class Character {
	int HP;
	String Name;
	int[] Pos = new int[2];
	Boolean Alive = true;
	Map<String, int[]> directions = new HashMap<String, int[]>();
	
	public Character(String name) {
		this.Name = name;
	}

	public void Move(MonsterGame game, String direction) {
		int oldX = game.player.Pos[0];
		int oldY = game.player.Pos[1];
		int newX = game.player.Pos[0];
		int newY = game.player.Pos[1];
		if (direction.equalsIgnoreCase("Up")) {
			oldY += 1;
		} else if (direction.equalsIgnoreCase("Down")) {
			oldY += -1;	
		} else if (direction.equalsIgnoreCase("Left")) {
			oldX += -1;			
		} else if (direction.equalsIgnoreCase("Right")) {
			oldX += 1;			
		} else {
			System.out.println("Invalid Move");
		}
		game.gameState[oldX][oldY] = " ";
		game.gameState[newX][newY] = "P";
	}
}
