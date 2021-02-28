package game;

import java.util.InputMismatchException;

public class Player  {
	private String name;
	private String move;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
	
	public String getMove() {
		return this.move;
	}
}