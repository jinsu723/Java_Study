package task2;

public class SavingAccount extends Account{

//	SavingsAccount 클래스
//	메소드 
//	   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
	
	@Override
	void withdraw(double amount) {
		if(amount < this.balance) {
			System.out.println("잔액이 부족합니다");
		} else {
			this.balance -= amount;
			System.out.println("출금 후 잔액 : " + balance);
		}
	}

}
