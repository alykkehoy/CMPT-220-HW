import java.util.Scanner;

public class HW7_9 {
	public static double min(double[] array){
		double min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter ten numbers: ");
		double[] nums = new double[10];
		
		for(int i = 0; i < 10; i++){
			nums[i] = in.nextDouble();
		}
		
		System.out.printf("The minimum number is: %f", min(nums));
		in.close();
	}
}
