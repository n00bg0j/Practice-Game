
public class Monster extends Character {

	public Monster(MonsterGame game, int x, int y) {
		super(game, "Faggit", x, y);
		this.HP = RandIntGen.randInt(100, 500);
	}

	public void Move(MonsterGame game) {
		int[] temp = new int[2];
		temp[0] = 1;
		temp[1] = -1;
		for (int num : temp) {
			for (int numb : temp) {
				int i = Pos[0] - num;
				int j = Pos[1] - numb;
				if (game.gameState[i][j] == " ") {
					this.Pos[0] = i;
					this.Pos[1] = j;
				}
			}
		}
	}

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
