package task;

import java.util.Scanner;

public class TeamTask04 {
	public static void main(String[] args) {
//		JAVA요
//		문제 2 : 문자의 아스키코드 값 확인
//		   사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
//		   사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
//		   'A'를 입력하면 종료하고 종료 메시지를 출력한다

		Scanner sc = new Scanner(System.in);

		final char finish = 'A';
		while (true) {
			System.out.print("문자를 입력하세요 : ");

			char input = sc.next().charAt(0);

			if (input == finish) {
				System.out.println("프로그램 종료");
				break;
			}

			System.out.println(input + " " + (int) input);
		}
	}
}
