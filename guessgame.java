package scratch;

import java.util.Scanner;

public class guessgame{
	public static void main(String [] args ) {
		
		try (Scanner KeyBoardInput = new Scanner(System.in)) {
			String secretWord = "sudalai";
			String guess = " ";
			int guessCount = 0;
			int guessLimit = 3;
			boolean outOfGuess = false;
			
			while(!guess.equals(secretWord) & !outOfGuess) {
				
				if(guessCount < guessLimit) {
					System.out.print("enter the guess:");
					guess = KeyBoardInput.nextLine();
					guessCount++;
			}else
					outOfGuess = true;
				if(outOfGuess) {
					System.out.println("wrong & out of guesses");
					
				}else if (!outOfGuess && !guess.equals(secretWord) && guessCount <= guessLimit) {
					System.out.println("try again");	
				}else if(guess.equals(secretWord)) {
					System.out.println("crt guess!;) ");
				}
					
						
				
			}
		}
			
		
	}
		
	
	
}
