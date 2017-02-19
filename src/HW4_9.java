import java.util.Scanner;

public class HW4_9 {
	
	public static void convert(String letters){
		if(letters.length() == 1){
			char letter = letters.charAt(0);
			System.out.printf("The Unicode for the character %c is %d\n", letter, (int)letter);
		} else {
			System.out.printf("Only input a single character!\n");
		}		
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		String letters;

		while(true){
			System.out.printf("Enter a character: ");
			letters = in.next();
			
			if(letters.equalsIgnoreCase("end")){
				break;
			}else{
				convert(letters);
			}
		}
		in.close();
	}
}
