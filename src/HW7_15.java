import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW7_15 {
	public static int[] eliminateDuplicates(int[] list){
		List<Integer> nonDups = new ArrayList<>();
		for(int i = 0; i < list.length; i++){
			if(!nonDups.contains(list[i])){
				nonDups.add(list[i]);
			}
		}
		int[] nonDupList = new int[nonDups.size()];
		for(int i = 0; i < nonDups.size(); i++){
			nonDupList[i] = nonDups.get(i);
		}
		return nonDupList;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter ten numbers: ");
		
		int[] list = new int[10];
		for(int i = 0; i < 10; i++){
			list[i] = in.nextInt();
		}
		int[] distinctList = eliminateDuplicates(list);
		System.out.printf("The distinct numbers are: ");
		for(int i = 0; i < distinctList.length; i++){
			System.out.printf("%d ", distinctList[i]);
		}
		in.close();
	}
}
