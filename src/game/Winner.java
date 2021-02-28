package game;

public class Winner {

	/*
	 * This method checks who is the winner PlayerOne or PlayerComputer
	 */
	public String getWinner(PlayerOne pO, PlayerComputer pC) {
		 String win = " Venceu-----------";
		 String aTie = " Empate-----------";
		 
		if(pO.getMove() == "Pedra") {
			if(pC.getMove() == "Pedra") {
				return aTie;
			}else if(pC.getMove() == "Papel") {
				return pC.getName() + win;
			}else if(pC.getMove() == "Tesoura") {
				return pO.getName() + win;
			}
		}
		if(pO.getMove() == "Papel") {
			if(pC.getMove() == "Papel") {
				return aTie;
			}else if(pC.getMove() == "Pedra") {
				return pO.getName() + win;
			}else if(pC.getMove() == "Tesoura") {
				return pC.getName() + win;
			}
		}
		if(pO.getMove() == "Tesoura") {
			if(pC.getMove() == "Tesoura") {
				return aTie;
			}else if(pC.getMove() == "Papel") {
				return pO.getName() + win;
			}else if(pC.getMove() == "Pedra") {
				return pC.getName() + win;
			}
		}
		return null;
	}
}
