package exceptionTest;

// 1번 : Exception basic

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
//		java.lang.ArithmeticException
//		 / by zero
		int result = 10 / 0;
		System.out.println(result);
		
		System.out.println("프로그램 종료");
	}
}
