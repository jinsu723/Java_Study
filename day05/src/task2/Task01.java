package task2;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기

		// 변수 선언(문자열)
		// 출력메시지'텍스트를 입력하세요(X입력시 종료)'
		// 문자열 저장
		// X를 입력했는지 판단
		// X를 입력 받을 때 까지 반복
		// 결과 출력
		// 버퍼 비우기
		
		String msg;
		
		while(true) {
			System.out.println("텍스트를 입력하세요");
			msg = sc.nextLine();
			if(msg.equals("X")) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(msg);
		}
	}
}

