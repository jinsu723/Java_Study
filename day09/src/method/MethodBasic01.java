package method;

// 4번 : 메소드 사용이유1 : 중복된 코드의 제거

public class MethodBasic01 {
	public static void main(String[] args) {
		// 동일한 작업을 수행하는 코드를 여러번 작성하는 대신 메소드로 정의하면
		// 코드의 가독성과 효율성이 향상된다
		
		// 동일한 로직을 여러 번 작성
		System.out.println("총 합 : " + (5 + 10));
		System.out.println("총 합 : " + (100 + 200));
		System.out.println("총 합 : " + (20 + 30));
		
		printSum(5, 10);
		printSum(100, 200);
		printSum(20, 30);
	}
	
	// 메소드를 사용한 경우
	static void printSum(int num1, int num2) {
		System.out.println("총 합 : " + (num1 + num2));
	}
}

