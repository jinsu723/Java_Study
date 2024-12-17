package review3;

public class Main {
	public static void main(String[] args) {
		
		SavingAccount sv = new SavingAccount(5000);
		CheckingAccount ca = new CheckingAccount(10000);
		
		sv.deposit(3000);
		sv.withdraw(7000);
		
		ca.deposit(10000);
		ca.withdraw(9000);
	}
}
