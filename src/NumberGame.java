import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	final static int MAX = 100;
	final static int MIN = 0;
	
	static Random r = new Random();
	static Scanner in = new Scanner(System.in);
	
	static int number;
	static int numGuess;
	static Boolean contGame;
	
	public static void main(String[] args){
		initGame();
		
		while(contGame){
			int guess = getGuess();
			if (guess == number){
				System.out.printf("Congratulations! Correct in %d guesses!\n", numGuess);
				initGame();
				contGame = playAgainPrompt();
			} else if(guess < number){
				System.out.printf("Too low\n");
			} else {
				System.out.printf("Too high\n");
			}
		}
		in.close();
	}

	private static void initGame() {
		number = createNewNumber();
		numGuess = 0;
		contGame = true;
		return;
	}

	private static int getGuess() {
		System.out.printf("Guess a number between %d and %d: ", MIN, MAX);
		int guess;
		do {
			guess = in.nextInt();
		} while (validateGuess(guess));
		numGuess++;
		return guess;
	}

	private static boolean validateGuess(int guess) {
		if(guess < MIN || guess > MAX){
			System.out.printf("Guess a number between %d and %d: ", MIN, MAX);
			return true;
		}
		return false;
	}
	
	private static int createNewNumber() {
		return r.nextInt((MAX - MIN) + 1) + MIN;
	}

	private static Boolean playAgainPrompt() {
		System.out.printf("Would you like to play again?[y|n] ");
		
		String reply;
		do{
			reply = in.next();
		}while(validateInput(reply));
		
		if(reply.equals("n")){
			System.out.printf("Good Bye!\n");
			return false;
		} 
		return true;
	}
	
	private static Boolean validateInput(String reply) {
		if(reply.equals("y") || reply.equals("n")){
			return false;
		}else {
			System.out.printf("Please input y or n: ");
			return true;
		}
	}
}