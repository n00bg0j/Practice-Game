
public abstract class Character {
	int HP;
	String Status;
	String Name;
	int[] Pos;
	
	public Character(String name, int x, int y) {
		this.Name = name;
		this.Pos[0] = x;
		this.Pos[1] = y;
	}
	// move
	public abstract void Move();
	// attack
	public abstract void Attack();
}
