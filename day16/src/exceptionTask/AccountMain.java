package exceptionTask;

public class AccountMain {
	public static void main(String[] args) {

//	         모든 예외처리는 메소드를 사용하는 쪽으로 던지기

		// AccountMain클래스
//	         메인메소드
//	         입금메소드 호출
//	         출금메소드 호출

//	         사용자 예외 정의 클래스
//	         AccountException extends Exception

		Account a = new Account(10000);
		System.out.println(a.getBalance());
		a.deposit(1000);
		a.withdraw(20000);
	}
}
