package task;

import java.util.Scanner;

public class TeamTask03 {
	public static void main(String[] args) {
//		JAVA요
//		문제 1 : 점심 선택 및 가격 확인
//		   사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
//		   - 점심 메뉴 4가지에서만 가능하다
//		      짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
//		   - 올바른 메뉴를 입력할 때까지 반복합니다.
//		   - 잘못된 메뉴를 입력하면 다시 입력받습니다.
		
		// 변수 선언 String 5개 boolean 1개
		// 매뉴판 출력
		// 입력 받기
		// 
		Scanner sc = new Scanner(System.in);
	      int numj = 5000, nump = 8000, numz = 25000, numh = 6000;
	      String jang = "짜장", pig = "돈까스", za = "피자", hem = "햄버거", input = "";
	      boolean cham = true;

	      while (cham) {
	         System.out.println("짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)");

	         System.out.print("선택하신 메뉴를 선택해 주세요 : ");
	         input = sc.nextLine();

	         if (input.equals(jang)) {
	            System.out.println("선택하신 메뉴는 : " + jang + " " + numj + "원 입니다");
	            cham = false;
	         } else if (input.equals(pig)) {
	            System.out.println("선택하신 메뉴는 : " + pig + " " + nump + "원 입니다");
	            cham = false;
	         } else if (input.equals(za)) {
	            System.out.println("선택하신 메뉴는 : " + za + " " + numz + "원 입니다");
	            cham = false;
	         } else if (input.equals(hem)) {
	            System.out.println("선택하신 메뉴는 : " + hem + " " + numh + "원 입니다");
	            cham = false;
	         } else {
	            System.out.println("재입력");
	         }

	      }
	}

}
