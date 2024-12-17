package oper;

// 11번 : 관계연산자와 논리연산자

public class OperTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 입력한 값 2개를 서로 비교하기
		// 입력 클래스 import
		// 변수 선언
		// 출력 메시지
		// 입력 메소드
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = 0, num2 = 0;
		
		int num1 = 10, num2 = 15;
		
		System.out.println("정수 2개를 입력하세요");
		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
		
		System.out.println("num1 > num2 : num1이 num2보다 크니? " + (num1 > num2));
		System.out.println("num1 < num2 : num1이 num2보다 작니? " + (num1 < num2));
		System.out.println("num1 >= num2 : num1이 num2보다 크거나 같니? " + (num1 >= num2));
		System.out.println("num1 <= num2 : num1이 num2보다 작거나 크니? " + (num1 <= num2));
		System.out.println("num1 == num2 : num1이 num2보다 같니? " + (num1 == num2));
		System.out.println("num1 != num2 : num1이 num2보다 다르니? " + (num1 != num2));
		
		System.out.println("--------논리연산자--------");
		System.out.println("===and 둘 다 참이면 참(&&)====");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("====or 둘 중 하나라도 참이면 참(||)====");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("====not 참이면 거짓, 거짓이면 참(!)====");
		System.out.println(!true);
		System.out.println(!false);
	}

}
