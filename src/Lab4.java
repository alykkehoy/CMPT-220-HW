import java.util.Scanner;

public class Lab4 {
	final static String PASSWORD = "password";
	final static int NUMGUESSES = 3;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String word;
		
/*		for (int i = 0; i < NUMGUESSES; i++){
			System.out.printf("Password: ");
			word = in.nextLine();
			if (word.equals(PASSWORD)){
				System.out.println("Welcome back!");
				break;
			}else {
				System.out.printf("Incorrect. %d attempts left.\n", NUMGUESSES - i - 1);
			}
		}*/
		
/*		for(int i = 2; i <= 10 ; i += 2){
				System.out.println(i);
		}*/
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 26; j++){
				System.out.println((char)('a' + j));
			}
		}
		in.close();
	}
}