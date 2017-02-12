import java.util.Scanner;

public class Date {
	public static String getDayString(int n){
		String day;
		switch(n % 7){
		case 0: 
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesady";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		default:
			day = "never";
		}
		return day;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter today's day: ");
		int todayInt = in.nextInt();
		System.out.printf("Enter number of days elapsed since today: ");
		int futureInt = in.nextInt();
		
		String todayStr = getDayString(todayInt);
		String futureStr = getDayString(todayInt + futureInt);
		System.out.printf("Today is %s and the future day is %s.", todayStr, futureStr);
		in.close();
	}
}
