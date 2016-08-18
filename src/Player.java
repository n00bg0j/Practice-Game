
public class Player extends Character {
	
	int MP;

	public Player(String name, int x, int y) {
		super(name, x, y);
		this.HP = RandIntGen.randInt(1000, 1500);
		this.MP = RandIntGen.randInt(150, 200);
	}
	
	@Override
	public void Move(MonsterGame game) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void Attack(MonsterGame game) {
		// TODO Auto-generated method stub
	}
}
