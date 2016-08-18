import java.util.HashMap;
import java.util.Map;

public class Player extends Character {
	
	int MP;
	Map<String, String[]> skillSet = new HashMap<String, String[]>();
	Map<String, Integer> dmgList = new HashMap<String, Integer>();
	int EXP = 0;
	int lvl = 0;
	String Class;
	
	public Player(String name, int x, int y, String Class) {
		super(name, x, y);
		this.HP = RandIntGen.randInt(1000, 1500);
		this.MP = RandIntGen.randInt(150, 200);
		this.Class = Class;
	}

	public void Attack(MonsterGame game, String direction, String Attack) {
		int i = 0;
		int j = 0;
		if (direction == "up") {
			i = this.Pos[0] + 1;
		} else if (direction == "down") {
			i = this.Pos[0] - 1;
		} else if (direction == "left") {
			j = this.Pos[0] - 1;			
		} else if (direction == "right") {
			j = this.Pos[0] + 1;			
		} else {
			System.out.println("Invalid Move");
		}
	}
	
	@SuppressWarnings("null")
	public void generateSkillSet() {
		String[] warriorSet = null;
		warriorSet[0] = "ShieldBang";
		warriorSet[1] = "Slam";
		warriorSet[2] = "Rage";
		skillSet.put("Warrior", warriorSet);
		String[] mageSet = null;
		mageSet[0] = "StaffBang";
		mageSet[1] = "Fireball";
		mageSet[2] = "Earthquake";
		skillSet.put("Warrior", mageSet);
		String[] thiefSet = null;
		thiefSet[0] = "Rob";
		thiefSet[1] = "BackStab";
		thiefSet[2] = "Assassinate";
		skillSet.put("Warrior", thiefSet);
		dmgList.put("ShieldBang", 20);
		dmgList.put("Slam", 60);
		dmgList.put("Rage", 150);
		dmgList.put("StaffBang", 20);
		dmgList.put("Fireball", 60);
		dmgList.put("Earthquake", 150);
		dmgList.put("Rob", 20);
		dmgList.put("BackStab", 60);
		dmgList.put("Assassinate", 150);
	}
	
	public void LevelUp() {
		this.lvl += 1;
		EXP = -30 * lvl;
	}

}
