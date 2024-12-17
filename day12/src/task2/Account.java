package task2;

public class Account {
//	Account 클래스
//	필드
//	   balance
//	메소드
//	   deposit(double amount) : 금액을 추가
//	   withdraw(double amount) : 금액을 차감
	
	// 정수형 balance 필드 선언
	// 메소드 선언
	// deposit 실수형 매개변수 정수형 반환
	// withdraw 실수형 매개변수 정수형 반환
	
	int balance;
	
	void deposit(double amount) {
		this.balance += amount;
		
		System.out.println("입금 후 잔액 : " + this.balance);
	}
	
	void withdraw(double amount) {
		this.balance -= amount;
		
		System.out.println("출금 후 잔액 : " + this.balance);
	}
}
