package task;

import java.util.Scanner;

// 15번 :

public class Task01 {
	public static void main(String[] args) {
		// 로직 구성 필수!!
		// 다양한 로직을 생각해 보는 연습하기

//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다

		// 입력 메소드 import
		// 변수 선언(정수 저장, 나머지를 구한 값 저장)
		// 출력메시지 '입력 : '
		// 변수 저장
		// 홀짝 구분하기
		// 결과 출력
		// 버퍼 비우기

		Scanner sc = new Scanner(System.in); // 입력 메소드 import

		int num1 = 0;  // 입력받을 변수
		int num2 = 0;  // 나머지를 저장할 변수
		
		System.out.println("***한 개의 정수를 입력받아 홀짝 구분하는 프로그램***");  // 프로그램 이름
		System.out.print("입력 : ");  // 사용자에게 입력값 요구
		
		num1 = sc.nextInt();  // 입력값 저장
		
		num2 = num1 % 2;  // 나머지를 구해서 저장
		if(num2 == 0) {  // 짝수
			System.out.println("짝수입니다.");  // 결과 출력
		} else {  // 홇수
			System.out.println("홀수입니다.");  // 결과 출력
		}
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기

//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다

		// 변수 선언(정수입력)
		// 출력메시지'하나의 정수를 입력하세요'
		// 변수 저장
		// 양수, 음수, 0 구분
		// 결과출력
		// 버퍼 비우기

		int num3 = 0;  // 변수 선언
		
		System.out.println("***양수, 음수, 0을 구분하는 프로그램***");  // 프로그램 이름
		System.out.println("하나의 정수를 입력하세요");  // 사용자에게 입력값 요구
		System.out.print("입력 : ");  // 입력
		
		num3 = sc.nextInt();  // 변수 저장
		
		if(num3 > 0) {  // 양수
			System.out.println("양수입니다.");  // 결과 출력
		} else if(num3 < 0) {  // 음수
			System.out.println("음수입니다.");  // 결과 출력
		} else {  // 0
			System.out.println("0입니다.");  // 결과 출력
		}
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기

//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다

		// 변수 선언(나이저장)
		// 출력메시지'나이를 입력하하세요'
		// 변수 저장
		// 어린이 청소년 성인 구분
		// 결과 출력
		// 버퍼 비우기

		System.out.println("***몇살이세요***");
		
		int num4 = 0;
		
		System.out.print("나이를 입력하세요 : ");
		
		num4 = sc.nextInt();
		
		if(num4 > 0) {
			if(num4 <=12) {
				System.out.println("어린이입니다.");
			} else if(num4 <= 19) {
				System.out.println("청소년입니다.");
			} else {
				System.out.println("성인입니다.");
			}
		}
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기

//
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9

		// 변수 선언(변수1, 변수2, 변수3, 크기비교할변수)
		// 출력 메시지 '3개의 정수를 입력하세요'
		// 변수 저장
		// 크기 비교하기
		// 결과 출력
		// 버퍼 비우기

		System.out.println("***큰 수부터 정렬해드려요***");  // 프로그램 이름
		
		int num5 = 0, num6 = 0, num7 = 0, fir = 0, scd = 0, tir = 0;  // 변수 선언
		
		System.out.println("3개의 정수를 띄어쓰기로 입력하세요");  // 사용자에게 입력값 요구
		
		num5 = sc.nextInt();  // 변수1 저장
		num6 = sc.nextInt();  // 변수2 저장
		num7 = sc.nextInt();  // 변수3 저장
		
		fir = num5 > num6 ? num5 : num6;  // 큰 수 구하기
		fir = fir > num7 ? fir : num7;  // 큰 수 구하기
		tir = num5 < num6 ? num5 : num6;  // 작은 수 구하기
		tir = tir < num7 ? tir : num7;  // 작은 수 구하기
		scd = (fir != num5 && tir != num5)? num5 : (fir != num6 && tir != num6)? num6 : num7;  // 중간 수 구하기
		
		System.out.println("결과 : " + fir + " " + scd + " " + tir);  // 결과 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기

//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기

		// 변수 선언(문자열)
		// 출력메시지'텍스트를 입력하세요(X입력시 종료)'
		// 문자열 저장
		// X를 입력했는지 판단
		// X를 입력 받을 때 까지 반복
		// 결과 출력
		// 버퍼 비우기

		System.out.println("***사랑의 메시지 보내기***");  // 프로그램 이름
		
		String text1 = "";  // 입력받을변수
		String x = "X";  // 종료할변수
		
		System.out.println("텍스트틑 입력하세요(X 입력시 종료)");  // 사용자에게 입력값 요구
		
		text1 = sc.next();  // 변수 저장
		
		while(!(x.equals(text1))) {  // 조건문
			System.out.println(text1);  // 입력받은 변수 출력
			System.out.println("텍스트를 입력하세요(X 입력시 종료)");  // 사용자에게 입력값 요구
			text1 = sc.next();  // 입력값 저장
		}
		
		System.out.println("프로그램 종료.");  // 종료메시지 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기

//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27

		// 변수 선언(정수입력)
		// 출력메시지'숫자를 입력하세요'
		// 변수 저장
		// 구구단 진행
		// 결과 출력
		// 버퍼 비우기

		System.out.println("***구구단 검색기***");  // 프로그램 이름
		
		int num8 = 0;  // 변수 선언
		
		System.out.println("숫자를 입력하세요");  // 사용자에게 입력값 요구
		num8 = sc.nextInt();  // 변수 저장
		
		for(int i=1; i<10; i++) {  // 조건문
			System.out.println(num8 + " X " + i + " = " + (num8 * i));  // 구구단 및 결과 출력
		}
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기

//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
//
//      String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//                  + "1. 잔액 조회"
//                  + "2. 입금"
//                  + "3. 출금"
//                  + "4. 종료"
//                  + "선택 : ");

		// 변수 선언(msg, 입금, 출금, 잔액, 선택)
		// 출력메시지'메뉴를 고르세요'
		// 선택을 저장
		// 선택에 따른 결과 출력
		// 버퍼 비우기

		System.out.println("***ATM***");  // 프로그램 이름

		int money = 10000, in = 0, out = 0, choice = 0;  // 변수 선언
		String msg = "ATM 서비스의 번호를 선택하세요 \n" + "1. 잔액 조회\n" + "2. 입금\n" + "3. 출금\n" + "4. 종료\n" + "선택 : ";  // 스트링 메시지 저장

		System.out.println(msg);  // 메시지 출력

		choice = sc.nextInt();  // 변수 저장

		while (choice != 4) {  // 4를 입력할 때까지 진행
			switch (choice) {  // 변수 확인
			case 1:
				System.out.println("당신의 잔액 : " + money);  // 잔액 보여주기
				System.out.println();
				System.out.println(msg);  // 매뉴화면 다시 보여주기
				choice =  sc.nextInt();  // 변수 저장
				break;
			case 2:
				System.out.println("입금할 금액을 입력하세요");  // 입금할 금액 받기
				in = sc.nextInt();  // 변수 저장
				money = money + in;  // 잔액 업데이트
				System.out.println("입금 후 잔액 : " + money);  // 잔액 보여주기
				System.out.println();
				System.out.println(msg);  // 매뉴화면 다시 보여주기
				choice =  sc.nextInt();  // 변수 저장
				break;
			case 3:
				System.out.println("출금할 금액을 입력하세요");  // 출금할 금액 받기
				out = sc.nextInt();  // 변수 저장
				if (out > money) {  // 출금할 금액이 잔액보다 많으면
					System.out.println("!!!!잔액부족!!!!!");  // 잔액부족은 출금할 수 없음
					System.out.println();
				} else {  // 출금할 금액보다 잔액이 많으면
					money = money - out;  // 잔액 업데이트
					System.out.println("출금 후 잔액 : " + money);  // 잔액 보여주기
					System.out.println();
				}
				System.out.println(msg);  // 메뉴화면 다시 보여주기
				choice =  sc.nextInt();  // 변수 저장
				break;
			}
		}
		System.out.println("프로그램 정상 종료.");  // 프로그램 종료
		
		sc.nextLine();  // 버퍼 비우기
		sc.close();  // 자원 닫기

	}
}
