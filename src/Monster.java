
public class Monster extends Character {

	public Monster(int x, int y) {
		super("Faggit", x, y);
		this.HP = RandIntGen.randInt(100, 500);
	}

	@Override
	public void Move() {
		
	}

	@Override
	public void Attack() {
		String[][] tempBoard = getGameBoard();
		// dmg
		int dmg = RandIntGen.randInt(5, 25);
		// attack if character is adjacent
		int[] temp = new int[2];
		temp[0] = 1;
		temp[1] = -1;
		for (int num : temp) {
			for (int numb : temp) {
				if (tempBoard[Pos[0] - num][Pos[1] - num] == "P") {
					player.HP - 
				}
		
	}

}
