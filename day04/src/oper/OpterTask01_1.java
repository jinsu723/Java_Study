package oper;

import java.util.Scanner;

public class OpterTask01_1 {
	public static void main(String[] args) {
		// 로직구성 먼저 필수!!!

		// 1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기

		// 1) 입력클래스 import
		// 2) 변수 2개 선언(int)
		// 3) 출력 메시지
		// 4) 입력메소드 nextInt()
		// 5) 출력(합, 곱)
		// 6) nextLine() : 버퍼 비우기

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.print("두 개의 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		sc.nextLine();

		// 2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기
		// 평균 = 총합 / 개수
		// 1) num1 + num2 변수(int)
		// 2) double 변수 변수1 / 2
		// 3) 출력

//	      int sum = num1 + num2;
//	      double avg = sum / 2;
//	      System.out.println(avg);
//	      System.out.printf("평균은 %.2f", avg);
//	      
//	      System.out.println((double)(num1 + num2)/2);
//	      System.out.printf("%.2f", (double)(num1 + num2)/2);

		// 3. 두자리수 정수를 입력받고 십의자리와 일의자리를 출력하기

		// 입출력 결과
		// 두 자리수 정수를 입력하세요 :
		// 십의자리는 _입니다. 일의 자리는 _입니다

		// 1) 변수 선언 int 3개
		// 2) 입력메소드(nextInt)
		// 3) 십의자리 변수 / 10
		// 4) 일의자리 변수 % 10
		// 5) 출력
		// 6) nextLine()

		int number = 0, result1 = 0, result2 = 0;
		System.out.print("두자리수 정수를 입력하세요 : ");
		number = sc.nextInt();
		result1 = number / 10;
		result2 = number % 10;
		System.out.println("십의 자리는 " + result1 + "입니다. 일의 자리는 " + result2 + "입니다.");
		sc.nextLine();

		// 4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
		// 한 곡의 가격은 400원 입니다

		// 1) 메시지 출력(금액을 입력하세요 : )
		// 2) 변수(int) 입력메소드
		// 3) 변수(int) 곡을 계산할 수 있는 식
		// 4) 변수(int) 잔돈을 계산할 수 있는 식
		// 5) 출력

		System.out.println("금액을 입력하세요 : ");
		int money = sc.nextInt();
		int song = money / 400;
		int change = money % 400;
		System.out.printf("노래할 수 있는 곡은 %d곡 이고, 잔돈이 %d원 반환되었습니다", song, change);
	}

}
