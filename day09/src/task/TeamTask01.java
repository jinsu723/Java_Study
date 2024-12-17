package task;

import java.util.Scanner;

public class TeamTask01 {
	public static void main(String[] args) {
		// 변수 선언(입력받은 돈을 저장할 변수, 나이를 저장할 변수)
		// 입력메소드 import
		// 객체 생성(버스카드, 연령대 판별)
		// 연령대 메소드에서 받은 값을 버스카드 메소드로 보낸다
		// 버스카드 메소드에서 연령대별로 버스카드 사용
		// 결과 출력

		Scanner sc = new Scanner(System.in); // 입력 메소드 import
		TeamTask01 tt = new TeamTask01(); // 객체를 생성

		int money = 0; // 금액 변수 선언
		int age = 0; // 나이 변수 선언

		System.out.print("나이를 입력하세요 : "); // 나이 입력
		age = sc.nextInt(); // 입력받은 나이 변수에 저장
		sc.nextLine(); // 버퍼 비우기

		System.out.print("충전할 금액을 입력하세요(원) : "); // 금액 입력
		money = sc.nextInt(); // 입력받은 금액 저장
		sc.nextLine(); // 버퍼 비우기
		sc.close(); // 자원 닫기

		tt.takeBus(money, tt.age(age)); // 결과 출력, 금액과 연령대를 메서드에서 처리
	}

	// 연령대를 판별해주는 메소드 만들기
	// 리턴값 : void
	// 매개변수 int
	// 연령대별로 어린이 청소년 성인 저장

	String age(int age) { // 나이를 정수로 입력받아 문자열로 return
		if (age <= 10) { // 10살이하
			return "어린이"; // 어린이
		} else if (age <= 19) { // 10살 초과 19살 이하
			return "청소년"; // 청소년
		} else { // 19살 초과
			return "성인"; // 성인
		}
	}

	// 버스카드 사용해주는 메소드 만들기
	// 리턴값 : void
	// 매개변수 int m, String a
	// 연령대별로 버스 요금 설정 => 변수 선언
	// while문을 제어할 초기 boolean값 선언
	// 연령대를 받아서 버스 요금을 저장
	// 버스카드를 계속 사용하게 해줄 반복분 while

	void takeBus(int m, String a) { // 정수로 금액 받고 문자열로 연령대 받아
									// 연령대별로 금액 사용하게 하기

		int busPrice = 0; // 버스 요금 선언
		final int A_PRICE = 1550; // 성인요금
		final int K_PRICE = 1250; // 청소년요금
		final int B_PRICE = 1000; // 어린이요금
		boolean take = true; // 일단 올라타

		if (a.equals("어린이")) { // a가 "어린이"라면
			busPrice = B_PRICE; // 버스요금에 어린이요금 저장
		} else if (a.equals("청소년")) { // a가 "청소년"이라면
			busPrice = K_PRICE; // 버스요금에 청소년요금 저장
		} else { // a가 "성인"이라면
			busPrice = A_PRICE; // 버스요금에 성인요금 저장
		}

		while (take) // 버스 탑승
			if (m < busPrice) { // 잔액부족
				System.out.println("잔액이 부족합니다."); // 결과 출력
				take = false; // 하차
			} else { // 탑승 완료
				m -= busPrice; // 잔액 차감
				System.out.println("버스 탑승 완료. 잔액 : " + m); // 결과 출력
			}
	}
}