package review3;

public class Account {
	// 필드
	double balance;

	
	// 생성자
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	// 메소드
	void deposit(double amount){
		balance += amount;
		System.out.println("입금 : " + amount + ", 잔액 : " + balance);
	}
	
	void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("출금된 금액 : " + amount + ", 현제 잔액 : " + balance);
		} else {
			System.out.println("잔액부족");
		}
	}
}
