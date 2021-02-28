package game;

import java.util.InputMismatchException;

public class PlayerOne extends Player {
	 
	private String move;
	 
	public PlayerOne(String name) {
		super(name);
	}
	
	public String getMove() {
		return this.move;
	}
	
	public void setMove(int move) {
		
		if(move == 1) {
			this.move = "Pedra";
		}else if(move == 2) {
			this.move = "Papel";
		}else if (move == 3) {
			this.move = "Tesoura";
		}else {
			throw new InputMismatchException();			
		}
		
	}
}
