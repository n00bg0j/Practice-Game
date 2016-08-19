
public class Monster extends Character {

	public Monster(int x, int y) {
		super("Faggit");
		this.HP = RandIntGen.randInt(100, 500);
		this.Pos[0] = x;
		this.Pos[1] = y;
	}

	public void Move(MonsterGame game) {
		try {
			for (int x = -1; x < 1; x++) {
				for (int y = -1; y < 1; x++) {
					int i = Pos[0] - x;
					int j = Pos[1] - y;
					if (game.gameState[i][j] == " ") {
						this.Pos[0] = i;
						this.Pos[1] = j;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
	}

	public void Attack(MonsterGame game) {
		try {
			// damage
			int dmg = RandIntGen.randInt(5, 25);
			// attack if character is adjacent
			for (int x = -1; x < 1; x++) {
				for (int y = -1; y < 1; x++) {
					int i = Pos[0] - x;
					int j = Pos[1] - y;
					if (game.gameState[i][j] == "P") {
						game.player.HP -= dmg;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
	}
}
