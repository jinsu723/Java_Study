package Oper;

import java.util.Scanner;

// 1번 : 삼항연산자

public class OperTask01 {
	public static void main(String[] args) {
		// 정수 2개를 입력받아서 큰 수 출력하기(삼항 연산자 이용)
		// 1) 입력 클래스 import
		// 2) 변수 선언 int 2개, boolean 1개
		// 3) 입력 메시지 출력
		// 4) 변수 nextInt()
		// 5) 변수 삼항 연산자를 결과 대입(true, false)
		// 6) 출력

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = "";
		System.out.println("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		num2 = sc.nextInt();
//		      result = 조건식 ? 참일 때의 값 : 거짓일 때의 값
		result = num1 > num2 ? "큰 수 : " + num1 : num1 == num2 ? "두 수는 같습니다" : "큰 수 : " + num2;
		System.out.println(result);

	}

}
