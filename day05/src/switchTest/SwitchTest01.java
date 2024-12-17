package switchTest;

import java.util.Scanner;

// 9번 : 조건문
public class SwitchTest01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = "";

		System.out.println("1부터 4까지의 정수 입력 : ");
		choice = sc.nextInt();

//		switch (choice) {
//		case 1:
//			System.out.println("입력한 값은 " + choice + "입니다.");
//			break;
//		case 2:
//			System.out.println("입력한 값은 " + choice + "입니다.");
//			break;
//		case 3:
//			System.out.println("입력한 값은 " + choice + "입니다.");
//			break;
//		case 4:
//			System.out.println("입력한 값은 " + choice + "입니다.");
//			break;
//		default:
//			System.out.println("1부터 4까지 중의 숫자만 입력하세요");
//		}
		
		// 입력한 값이 짝수인지 홀수인지 출력하기
		
		switch(choice) {
		case 1: case 3:
			System.out.println("홀수입니다.");
			break;
		case 2: case 4:
			System.out.println("짝수입니다.");
			break;
//		case 3:
//			System.out.println("홀수입니다.");
//			break;
//		case 4:
//			System.out.println("짝수입니다.");
//			break;
		default:
			System.out.println("1부터 4까지의 숫자만 입력하세요.");
			break;
		}
		
		System.out.println("출력 끝");
		
	}
}
