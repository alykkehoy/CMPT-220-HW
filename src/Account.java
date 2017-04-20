
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalace(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getInterestRate(){
		return annualInterestRate;
	}
	
	public void setInterestRate(double interestRate){
		this.annualInterestRate = interestRate;
	}
	
	public Date getDate(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	public void withdraw(double withdraw){
		balance -= withdraw;
	}
	
	public void deposit(double deposit){
		balance += deposit;
	}
}