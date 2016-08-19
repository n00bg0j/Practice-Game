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

}
