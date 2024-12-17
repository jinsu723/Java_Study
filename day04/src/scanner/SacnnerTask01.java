package scanner;

import java.util.Scanner;

// 5번 : 입력 메소드 실습

public class SacnnerTask01 {
	public static void main(String[] args) {

		// 두 장소를 입력받고 출력하기
		// next 메소드를 사용한다
		// [입력줄 결과]
		// 정수 1 입력 : 10
		// 정수 2 입력 : 20
		// 두 정수의 합은 30입니다.

		// 로직구성
		// Scanner import
		Scanner sc = new Scanner(System.in);

		// 출력 메시지 정수 1 입력
		System.out.print("정수 1 입력 : ");

		// 변수 1 저장
		String num1 = sc.next();

		// 메시지 출력 정수 2 입력
		System.out.print("정수 2 입력 : ");

		// 변수 2 저장
		String num2 = sc.next();

		// 입력받은 값을 int형태로 바꿔준다
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);

		// 두 정수의 합 구하기
		int sum = number1 + number2;

		// int형태로 받은 값의 합을 구해서 출력
		System.out.println("두 정수의 합 : " + sum + "입니다.");
	}
}
