package exceptionTask;

public class AccountException extends Exception{
//    사용자 예외 정의 클래스
//    AccountException extends Exception
	public AccountException(int balance, int num) {
		super("현재 잔고는 " + balance + "원입니다. 출금금액의 " + num + "원이 부족하여 출금이 불가능합니다");
	}
}
