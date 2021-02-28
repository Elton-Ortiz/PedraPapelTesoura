package game;

import java.util.Random;

public class PlayerComputer extends Player {
		
	public PlayerComputer(String name) {
			super(name);
		}
		
		public void setMove() {
			Random random = new Random();
			int ir = random.nextInt(3) + 1;
			super.setMove(ir);
		}
	

}
