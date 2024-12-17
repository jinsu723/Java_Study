package accountTask;

public class Account {  // 클래스 선언
	 static int balance;  // 잔액 필드 선언
	
	void deposit(double amount) {  // 실수를 매개변수로 하는 입금 메소드 선언
		balance += amount;  // 정적 변수에서 입금할 금액 더해서 저장
		System.out.println("입금 후 잔액 : " + balance);  // 입금 후 잔액 알려주기
	}
	
	void withdraw(double amount) {  // 실수형을 매개변수로 하는 출금 메소드 선언
		balance -= amount;  // 정적 변수에서 출금할 금액 빼고 저장
		System.out.println("출금 후 잔액 : " + balance);  // 출금 후 잔액 알려주기
	}
	public static void main(String[] args) {  // 메인메소드
//		3) 잔액확인 프로그램
//	SavingsAccount와 CheckingAccount 클래스는 Account 클래스 상속
//	Account 클래스
//	필드
//	   balance
//	메소드
//	   deposit(double amount) : 금액을 추가
//	   withdraw(double amount) : 금액을 차감
//
//	SavingsAccount 클래스
//	메소드 
//	   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
//
//	CheckingAccount 클래스
//	메소드
//	   withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
//
//	메인 메소드에서 두 클래스의 객체를 생성하고 입출금을 수행결과 출력

		// balance 필드 선언
		// deposit 메소드
		// 실수형 매개변수 잔액 += 금액
		// withdraw 메소드
		// 실수형 매개변수 잔액 -= 금액
		
		System.out.println("*****잔액확인 프로그램*****");  // 프로그램 이름
		
		Account a = new Account();  // 입출금이 가능한 클래스 객체 생성
		SavingAccount sa = new SavingAccount();  // 출금시 잔액이 -가 되지 않게 해주는 클래스 객체 생성
		CheckingAccount ca = new CheckingAccount();  // 수수료를 빼주는 클래스의 객체 생성
		
		a.deposit(10000);  // 입금을 해주는 메소드
		ca.withdraw(2000);  // 인수에 출금할 금액 넣고 메소드 호출 수수료 알려주고 1000원 빼기
		sa.withdraw(2000);  // 인수에 출금할 금액 넣고 메소드 호출
		
	}
}