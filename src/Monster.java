
public class Monster extends Character {

	public Monster(int x, int y) {
		super("Faggit", x, y);
		this.HP = RandIntGen.randInt(100, 500);
	}

	@Override
	public void Move(MonsterGame game) {
		
	}

	@Override
	public void Attack(MonsterGame game) {
		// damage
		int dmg = RandIntGen.randInt(5, 25);
		// attack if character is adjacent
		int[] temp = new int[2];
		temp[0] = 1;
		temp[1] = -1;
		for (int num : temp) {
			for (int numb : temp) {
				int i = Pos[0] - num;
				int j = Pos[1] - numb;
				if (game.gameState[i][j] == "P") {
					game.player.HP -= dmg;
				}
			}
		}
	}
}
