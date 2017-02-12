import java.util.Scanner;
import java.util.Random;

public class RPS {
	static Scanner in = new Scanner(System.in);
	static Random r = new Random();
	
	public static void main(String[] args){
		int play = getPlay();
		int compPlay = getCompPlay();
		String playerString = "You are " + convertPlay(play) + ". ";
		String compString = "Computer is " + convertPlay(compPlay) + ". ";
		String result;
		if(play == compPlay){
			result = "It is a draw\n";
		}else if ((play + 1) % 3 == compPlay){
			result = "You lose\n";
		}else {
			result = "You win\n";
		}
		System.out.println(playerString + compString + result);
	}
	
	public static String convertPlay(int n){
		String play;
		switch (n){
		case 0:
			play = "scissor";
			break;
		case 1:
			play = "rock";
			break;
		case 2:
			play = "paper";
			break;
		default:
			play = "NONE";	
		}
		return play;
	}
	
	public static int getCompPlay(){
		int play = r.nextInt(3);
		return play;
	}
	
	public static int getPlay(){
		int play;
		do{
			System.out.printf("scissor (0), rock (1), paper(2): ");
			play = in.nextInt();			
		}while(validatePlay(play));
		return play;
	}
	
	public static boolean validatePlay(int play){
		if(play > 2 || play < 0){
			return true;
		}
		return false;
	}
}
