package task;

import java.util.Scanner;

public class Task_03 {
//	3. BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//	   프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
//
//	   BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//	   프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//
//	=== TV 컨트롤 메뉴 ===
//	1. 전원 On/Off
//	2. 채널 올리기
//	3. 채널 내리기
//	4. 종료
//	메뉴 번호 입력 : 
//
//	사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//	1 : powerOnOff() 메서드 호출
//	   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//	2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//	   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
	public static void main(String[] args) {
		// 객체 생성
		// 입력메소드 import
		// 입력값을 받을 변수 선언
		// 색생과 크기 가격을 초기화
		// 프로그램을 제어할 boolean 변수 선언
		// 메뉴 보여주고 입력값 요구
		// 입력값 저장
		// while 반복문 실행
		// swith 사용
		// 사용자가 번호를 입력하면 해당 케이스 안의 코드 실행
		// 1, 2, 3번을 입력하면 코드 실행하고 초기 매뉴 다시 보여주기
		// 4를 입력하면 프로그램 종료
		// 그 외의 것들을 알려주면 잘못됨 알려주고 다시 메뉴 보여주기

		Task_02 control = new Task_02();  // 객체 선언
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import

		control.color = "Black";  // 색상 초기화
		control.size = "32인치";  // 크기 초기화
		control.price = 500000;  // 가격 초기화

		int menuNum = 0;  // 메뉴 번호 입력받을 변수 선언 및 초기화
		boolean power = true;  // while문 제어할 변수 선언

		String msg = "=== TV 컨트롤 메뉴 ===\n1. 전원 On/Off\n2. 체널 올리기\n3. 체널 내리기\n4. 종료\n메뉴 번호 입력 : ";  // 메뉴로 띄울 메시지 저장
		System.out.print(msg);  // 최초 매뉴 띄우기

		menuNum = sc.nextInt();  // 메뉴 입력받아 저장

		while (power) {  // 프로그램 시작
			if (menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 4) {  // 메뉴에 있는 입력번호라면
				switch (menuNum) {  // 입력받은 숫자 판단
				case 1:  // 1번 선택
					control.powerOnOff();  // 전원버튼 켜져있다면 끄고 꺼져있다면 킨다 그 후 상태를 알려준다
					System.out.println();  // 줄 하나 띄우기
					System.out.print(msg);  // 메뉴 출력
					menuNum = sc.nextInt();  // 입력을 다시 받는다
					break;  // switch문 탈출
				case 2:  // 2번 선책
					control.channelUp();
					// 채널을 올려주는 메소드 채널을 올리고 바뀐 체널의 번호를 알려준다 더이상 올라갈 수 없으면 올릴 수 없다고 알려준다
					System.out.println();  // 줄 하나 띄우기
					System.out.print(msg);  // 메뉴 출력
					menuNum = sc.nextInt();  // 입력 받기
					break;  // switch문 탈출
				case 3:
					control.channelDown();
					// 체널을 내려주는 메소드 체널을 내리고 바뀐 체널의 번호를 알려준다 더 이상 내려갈 수 없으면 내려갈 수 없다고 알려준다
					System.out.println();  // 줄 하나 띄우기
					System.out.print(msg);  // 매뉴 출력
					menuNum = sc.nextInt();  // 입력 받기
					break;  // switch문 탈출
				case 4:  // 4번 선택
					System.out.println("프로그램을 종료합니다.");  // 종료 메시지 출력
					power = false;  // while문 탈출
				}
			} else {  // 메뉴에 없는 번호를 입력받음
				System.out.println("프로그램을 종료합니다.");  // 종료메시지 출력
				power = false;  // while문 탈출
			}

		}
		
		System.out.println("프로그램 정상 종료");
	}
}
