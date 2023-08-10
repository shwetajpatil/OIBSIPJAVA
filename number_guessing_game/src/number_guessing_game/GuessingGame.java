package number_guessing_game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static final Random RANDOM = new Random();
	public static final int Max_Number = 100;
	
	public static void main(String[] args) {
		int numberToFind = RANDOM.nextInt(Max_Number)+ 1;
		Scanner userInput = new Scanner(System.in);
		int numberTries = 0;
		int userGuess = 0;
		
		while(userGuess != numberToFind) {
			System.out.println("Guess a number between 1 to" + Max_Number + ":" );
			userGuess = userInput.nextInt();
			numberTries++;
			
			if (userGuess < 1 || userGuess > Max_Number) {
				System.out.println("Make sure that the number you entered is between 1 to" + Max_Number);
			}else if (userGuess > numberToFind) {
				System.out.println("You have chosen a too high number!");
			}else if (userGuess < numberToFind) {
				System.out.println("You have chosen a too low number!");
			}
		}
		
		userInput.close();
		
		System.out.println("Congratulations you found the correct number " + numberToFind + " in " +numberTries + " tries" );
	}

}
