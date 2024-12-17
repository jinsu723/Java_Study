package task;

import java.util.Scanner;

public class TeamTask02 {
	public static void main(String[] args) {
		// 3번 문제
		//   *
		//  * *
		// * * *
		//  * *
		//   *
		Scanner scan = new Scanner(System.in); // 1. 입력 받는 스캐너를 scan이라는 변수로 선언
		int num = 0; // 입력 받은 숫자를 저장 할 변수

		System.out.print("숫자 입력 : "); // 숫자를 입력하라고 메세지 표시
		num = scan.nextInt(); // 정수형으로 받아내기
		scan.nextLine();
		scan.close();

		// 색션1 시작 : 얘가 다이아 중심 기분 윗부분
		for (int i = 0; i < num; i++) { // 정수i생성 후 i가 num보다 클때까지 증감 후 반복(i:다이아 윗부분 중 몇개부터 시작할지)
			for (int j = 0; j < num - i; j++) { // i가 공백이므로 num에 공백을 빼면서 모양 잡기 →
				System.out.print(" "); // 모양 잡기 위해 공백으로 하기
			}
			for (int j = 0; j <= i; j++) { // 행 ↓ (즉 어떻게 *표시를 할 지)
				System.out.print("* "); // 띄워쓰기 후 *표시
			}

			System.out.println(); // 줄바꿈이지용~~
		}
		// 색션1 종료

		// 색션2 시작 : 얘가 다이아 중심 기분1 아랫부분
		for (int i = 1; i < num; i++) { // i : 다이아 중간 중 몇개부터 시작할지(색션1부분과 똑같이 시작하면 다이아가 뚱뚱하게 됨 그래서 1부터 시작) 즉 5개에서 1개를
										// 삭제해서 4개부터 시작
			for (int j = 0; j <= i; j++) { // 띄워쓰기로 해서 모양잡기 →
				System.out.print(" "); // 모양 잡기 위해 공백으로 하기
			}
			for (int j = 0; j <= num - i - 1; j++) { // 아래 몇개 표시할지 ↓
				System.out.print("* "); // 그 표시가 *로 해서 모양이 나옴
			}

			System.out.println();
		}
		// 색션2 종료

		System.out.println();
	}

}
