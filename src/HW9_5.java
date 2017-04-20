import java.util.GregorianCalendar;

public class HW9_5 {
	public static void main(String[] args){
		GregorianCalendar Cal = new GregorianCalendar();
		System.out.printf("%d/%d/%d\n", Cal.get(Cal.YEAR), Cal.get(Cal.DAY_OF_MONTH), Cal.get(Cal.YEAR));
		Cal.setTimeInMillis(1234567898765L);
		System.out.printf("%d/%d/%d\n", Cal.get(Cal.YEAR), Cal.get(Cal.DAY_OF_MONTH), Cal.get(Cal.YEAR));
	}
}
