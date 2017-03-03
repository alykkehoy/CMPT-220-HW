import java.util.Random;
import java.util.Scanner;

public class HW6_17 {
	public static void printMatrix(int n){
		Random r = new Random();
		for(int i = 0; i < n; i++){
			for (int j = 0; j < n - 1; j++){
				System.out.printf("%d ",r.nextInt(2));
			}
			System.out.printf("%d\n", r.nextInt(2));
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter n: ");
		int n = in.nextInt();
		
		printMatrix(n);
		
		in.close();
	}
}
