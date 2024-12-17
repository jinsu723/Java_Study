package exceptionTest2;

// 7번 : 사용자 정의 예외 클래스

public class MyException extends Exception{  // 일반예외
	public MyException() {
		super("음수 입력하면 안돼요");
	}
}
