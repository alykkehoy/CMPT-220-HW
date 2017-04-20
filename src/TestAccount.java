
public class TestAccount {

	public static void main(String[] args){
		Account acc1 = new Account(1122, 20000);
		acc1.setInterestRate(4.5);
		acc1.withdraw(2500);
		acc1.deposit(3000);
		
		System.out.printf("Balance: %f\n", acc1.getBalace());
		System.out.printf("Monthly Rate: %f\n", acc1.getMonthlyInterest());
	}
}
