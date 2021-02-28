package game;

public enum Played {

	pedra,papel,tesoura;
			
	public String winner (Integer one, Integer two) {
		if(one == two) {
			return "Empate";
		}else if(one > two) {
			return "One";
		}else if(one < two) {
			return "two";
		}
		return null;
		
	}
}
