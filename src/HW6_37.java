import java.util.Scanner;

public class HW6_37 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n, width;
		System.out.printf("Number: ");
		n = in.nextInt();
		System.out.printf("Width: ");
		width = in.nextInt();
		
		System.out.printf("%s\n", format(n, width));
		
		in.close();
	}
	
	public static String format(int number, int width){
		String s = Integer.toString(number);
		int diff = width - s.length();
		for(int i = 0; i < diff; i++){
			s = "0" + s;
		}
		return s;
	}
}
