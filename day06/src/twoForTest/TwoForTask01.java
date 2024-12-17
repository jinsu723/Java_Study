package twoForTest;

import java.util.Scanner;

// 5번 :

public class TwoForTask01 {
	public static void main(String[] args) {
		// 1번 : 역삼각형
		// *****
		// ****
		// ***
		// **
		// *

		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("수를 입력하세요");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) { // 행
			for (int j = num; j > i; j--) { // 열
				System.out.print("*");
			}
			System.out.println();
		}

		sc.nextLine();
		System.out.println();

		// 강사님 코드
		for (int i = 5; i >= 1; i--) { // i는 5부터 1까지 감소(행)
			for (int j = 1; j <= i; j++) { // j는 1부터 i까지 증가(열)
//				System.out.println("i : " + i + ", j : " + j);  // i, j 규칙성 확인
				System.out.print("*");
			}
			System.out.println();
		}

		// 2번 : 피라미드와 유사하지만 죄측 정렬
		// *
		// * * *
		// * * * * *
		// * * * * * * *

		int num2 = 0;
		System.out.println("정수를 입력");
		num2 = sc.nextInt();

		for (int i = 0; i < num2; i++) {
			for (int j = 0; j <= (2 * i); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.nextLine();
		System.out.println();

		// 강사님 코드
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 3번 : 피라미드 (for문이 총 3개 -> 어떻게 사용될지 먼저 생각하기)

		int num3 = 0;
		System.out.println("정수를 입력");
		num3 = sc.nextInt();

		for (int i = 0; i < num3; i++) {  // i는 행, 줄 번호
			for (int j = num3; j > i; j--) {  // 각 줄에 출력되는 별의 개수 결정
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.nextLine();
		
		// 강사님 코드
		for(int i = 1; i <= 3; i++) {  // 는 행, 1부터 3까지 증가
			for(int j = 1; j <= 3 - i; j++) {  // j 공백 출력
//				System.out.println("i : " + i + ", j : " + j);
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {  // k * 출력
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
