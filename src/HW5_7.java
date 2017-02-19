
public class HW5_7 {
	public static double calcTuition(double currentTuition){
		return currentTuition * 1.05;
	}
	
	public static void main(String[] args){
		double currentTuition = 10000;
		System.out.printf("Base tuition: %.2f\n", currentTuition);
		
		for(int i = 0; i < 10; i++){
			currentTuition = calcTuition(currentTuition);
			System.out.printf("Tuition at year %d: %.2f\n", i + 1, currentTuition);
		}
		
		double sum = 0;
		for(int i = 0; i < 4; i++){
			currentTuition = calcTuition(currentTuition);
			sum += currentTuition;
		}
		System.out.printf("Total cost for 4 years: %.2f\n", sum);
	}
}
