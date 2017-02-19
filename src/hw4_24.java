import java.util.Arrays;
import java.util.Scanner;

public class hw4_24 {
	static Scanner in = new Scanner(System.in);
	
	public static String[] getCities(int num){
		String[] cities = new String[num];
		
		for(int i = 0; i < num; i++){
			System.out.printf("Enter city: ");
			cities[i] = in.nextLine();
		}
		
		return cities;
	}
	
	public static void output(String[] cities){
		int numCities = cities.length;
		System.out.printf("The %d cities in alphabetical order are ", numCities);
		
		for(int i = 0; i < numCities - 1; i++){
			System.out.printf("%s, ", cities[i]);
		}
		System.out.printf("%s\n", cities[numCities - 1]);
	}
	
	public static void main(String[] args){
		System.out.printf("Number of cities: ");
		int numCities = in.nextInt();
		in.nextLine();
		String[] cities = getCities(numCities);
		
		Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);
		
		output(cities);
	}
}
