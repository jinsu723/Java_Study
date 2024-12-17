package scanner;

import java.util.Scanner;

// 7번 : 입력 메소드 실습

public class ScannerTask02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		// - 세 개의 숫자를 각각 입력받기
		// - 세 개의 숫자의 합을 계산하여 출력
		// - 세 숫자의 합은 00입니다. 형식으로 출력하기

		// 변수 선언
		// 출력 메시지 3개의 숫자를 입력하세요
		// 3개 숫자의 합 구하기
		// 결과 출력

		int num1 = 0, num2 = 0, num3 = 0, sum = 0;
		System.out.println("3개의 숫자를 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		sum = num1 + num2 + num3;

		System.out.println("세 숫자의 합 : " + sum);

		sc.nextLine();
		System.out.println();

		// 2. 사용자로부터 일어난 시간(정수), 아침, 점심, 저녁에 할 일과 시간(정수)을 입력받아 출력하기
		// - 아침, 점심, 저녁에 할 일과 잠들 시간을 각각 입력받기
		// - 순서대로 입력받고 출력할 것
		// - 출력 형식
		// - 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다.
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기

		// 변수 선언
		// 출력 메시지 '일어난 시간 : ', '아침에 할 일 : ', '정심에 할 일 : ', '저녁에 할 일 : ', '잠들 시간 : '
		// 할 일 : String으로 입력 받기, 시간 : int로 입력 받기
		// 결과 출력

		int timeMo = 0;
		int timeNi = 0;
		String morning = "";
		String day = "";
		String night = "";

		System.out.print("일어난 시간 : ");
		timeMo = sc.nextInt();
		System.out.print("아침에 할 일 : ");
		morning = sc.next();
		System.out.print("점심에 할 일 : ");
		day = sc.next();
		System.out.print("저녁에 할 일 : ");
		night = sc.next();
		System.out.print("잠들 시간 : ");
		timeNi = sc.nextInt();

		System.out.println("일어난 시간은 " + timeMo + "시 입니다.");
		System.out.println("아침 일과는 " + morning + "입니다.");
		System.out.println("점심 일과는 " + day + "입니다.");
		System.out.println("저녁 일과는 " + night + "입니다.");
		System.out.println("잠들 시간은 " + timeNi + "시 입니다.");

		sc.nextLine();
		System.out.println();

		// 3. 물건 가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
		// - 출력 형식
		// - 물건 가격은 10000원입니다.
		// - 지불 가격을 입력하세요 : 00
		// - 거스름돈은 3000원입니다.

		// 변수 선언
		// 물건 가격 초기화
		// 출력 메시지 '물건 가격은 10000입니다.', '지불 가격을 입력하세요 : '
		// 지불 가격 변수 저장
		// 거스름돈 계산
		// 결과 출력

		int price = 10000, mon = 0, change = 0;

		System.out.println("물건 가격은 10000원입니다.");
		System.out.print("지불할 금액을 입력하세요 : ");
		mon = sc.nextInt();

		change = mon - price;
		System.out.println("거스름돈은 " + change + "원 입니다.");

		sc.nextLine();
		sc.close();
	}
}
