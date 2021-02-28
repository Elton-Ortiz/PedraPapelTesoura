package game;

import java.util.Scanner;

/**
 * 
 * @author Elton Ortiz @
 */
public class GameMain {
	public static void main(String[] args) {
		/**
		 * Scanner to capture the player's move.
		 */
		Scanner scanner = new Scanner(System.in);

		/**
		 * Instance of two players,the first one (PlayerOne) is the real player, and the
		 * second one is the virtual player (ComputerPlayer).
		 */
		PlayerComputer playerComputer = new PlayerComputer("Computer");

		
		/*
		 * Player name to start the game
		 */
		System.out.println("Digite seu nome!");
		//Create the player one
		PlayerOne playerOne = new PlayerOne(scanner.next());
		/*
		 * The inicial text, to begin the game.
		 */
		System.out.println("Digite um número para jogar!");
		/*
		 * this boolean open it suits to maintain the game continuos.
		 * when it is false the game is closed!.
		 */
		boolean open = true;

		while (open) {
			/*
			 * The user game interface template.
			 */
			System.out.println("| 1 Pedra | 2 Papel | 3 Tesoura |----|4-Sair|");

			/*
			 * this try it's checks if the number move is valid on the setMove method.
			 */
			try {
				int digit =scanner.nextInt();
				if(digit == 4) {
					open = false;
					break;
				}else {
					playerOne.setMove(digit);
					playerComputer.setMove();
					
				}
			} catch (Exception e) {
				System.out.println("Valor Inválido");
			}

			/*
			 * output of the result of the game
			 */
			System.out.println(playerOne.getName() + "-----------------" + playerComputer.getName());
			System.out.println(playerOne.getMove() + "-----------------" + playerComputer.getMove());
								
			Winner winner = new Winner();
			System.out.println(winner.getWinner(playerOne, playerComputer));
			

		}
		scanner.close();
	}
}
