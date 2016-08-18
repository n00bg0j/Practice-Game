import java.util.HashMap;
import java.util.Map;

public abstract class Character {
	int HP;
	String Name;
	int[] Pos = new int[2];
	Boolean Alive = true;
	Map<String, int[]> directions = new HashMap<String, int[]>();
	
	public Character(MonsterGame game, String name, int x, int y) {
		this.Name = name;
		this.Pos[0] = x;
		this.Pos[1] = y;
	}

	public void Move(MonsterGame game, String direction) {
		if (direction == "up") {
			this.Pos[0] += 1;
		} else if (direction == "down") {
			this.Pos[0] += -1;	
		} else if (direction == "left") {
			this.Pos[1] += -1;			
		} else if (direction == "right") {
			this.Pos[1] += 1;			
		} else {
			System.out.println("Invalid Move");
		}
	}
}
