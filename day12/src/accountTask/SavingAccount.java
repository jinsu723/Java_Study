package accountTask;

public class SavingAccount  extends Account{  // Account 클래스를 상속받는 클래스 선언

//	SavingsAccount 클래스
//	메소드 
//	   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
	
	@Override
	void withdraw(double amount) {  // 메인클래스의 출금 메소드 오버라이딩
		if(balance < amount) {  // 잔액보다 인출할 금액이 많다면
			System.out.println("출금 실패!");  // 출금 실패 메시지 출력
		} else {  // 잔액이 충분하다면
			balance -= amount;  // 출금할 금액 잔액애서 빼서 저장
			System.out.println("출금 후 잔액 : " + balance);  // 출금 후 잔액 알려주기
		}
	}
	
}