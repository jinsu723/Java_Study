package scanner;
// 7번 : 입력 메소드 연습

import java.util.Scanner;

public class ScannerTask01_1 {
	public static void main(String[] args) {
		// 0) 입력클래스 import
		Scanner sc = new Scanner(System.in);

		// 1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		// - 세개의 숫자를 각각 입력받기
		// - 세 숫자의 합을 계산하여 출력
		// - 세 숫자의 합은 00입니다 형식으로 출력하기

		// 1) 변수 선언 4개(int)
		// 2) 출력 메시지(세개의 숫자를 띄어쓰기로 구분해서 입력하세요)
		// 3) 변수1 = sc.nextInt(); 변수2 = sc.nextInt(); 변수3 = sc.nextInt()
		// 4) 총합 저장할 변수 = 변수1 + 변수2 + 변수3
		// 5) 출력

	      int num1 = 0, num2 = 0, num3 = 0, result = 0;
	      System.out.println("세 정수를 띄어쓰기로 구분해서 입력하세요 : ");
	      num1 = sc.nextInt();
	      num2 = sc.nextInt();
	      num3 = sc.nextInt();
	      result = num1 + num2 + num3;
	      System.out.println("세 숫자의 총 합은 " + result + "입니다");
	      sc.nextLine();

		// 2. 사용자로부터 일어난 시간(정수), 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
		// - 일어날 시간과 아침, 점심, 저녁에 할 일, 잠들 시간을 각각 입력받기
		// - 순서대로 입력받고 출력할것
		// - 출력 형식
		// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기

		// 1) 변수 선언(int 2개, String 3개)
		// 2) 출력 메시지(일어난시간, 아침, 점심, 저녁에 할일, 잠들 시간 띄어쓰기로 구분해서 입력 : )
		// 3) int 변수1 = sc.nextInt(), 변수2 = sc.nextInt;
		// String 아침 = sc.next(), 점심 = sc.next(), 저녁 = sc.next();
		// 4) 출력
		// 5) 버퍼 비우기

	      int data1 = 0, data2 = 0;
	      String data3 = "", data4 = "", data5 = "";
	      System.out.println("일어난 시간, 아침/점심/저녁에 할일, 잠들 시간을 띄어쓰기로 구분해서 입력 : ");
	      data1 = sc.nextInt(); 
	      data3 = sc.next();
	      data4 = sc.next();
	      data5 = sc.next();
	      data2 = sc.nextInt();
	      System.out.printf("오늘 일어난 시간은 %d시이고 잠들 시간은 %d시 입니다\n", data1, data2);
	      System.out.printf("아침에 할일 : %s\n점심에 할일 : %s\n저녁에 할 일 : %s\n", data3, data4, data5);
	      sc.nextLine();

		// 3. 물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
		// 출력형식 예시
		// 물건 가격은 10000원입니다
		// 지불가격을 입력하세요 : 00
		// 거스름돈은 3000원입니다

		// 1) 물건가격 저장할 상수, 변수 선언(int 2개)
		// 2) 물건 가격은 00원입니다 지불가격입력하세요 : 출력 printf
		// 3) 변수 = sc.nextInt()
		// 4) 거스름돈 = 상수 - 변수
		// 5) 결과 출력
		// 6) sc.close()

		final int ITEM_PRICE = 3000;
		int payment = 0, change = 0;
		System.out.printf("물건 가격은 %d입니다.\n지불가격을 입력하세요 : ", ITEM_PRICE);
		payment = sc.nextInt();
		change = payment - ITEM_PRICE;
		System.out.println("거스름돈은 " + change + "원 입니다.");
		sc.close();

	}
}
