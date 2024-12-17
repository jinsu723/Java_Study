package ex03_길진수;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		
		System.out.print("출력하고 싶은 행 입력 : ");  // 사용자에게 입력값 요구
		int num = sc.nextInt();  // 변수를 선언해 사용자가 입력한 값을 저장
		
		for(int i=0; i<num; i++) {  // 사용자가 입력한 만큼 행을 만든다
			for(int j=0; j<=i; j++) {  // 행의 해당하는 수 만큼 *을 출력한다
				System.out.print("*");  // *을 출력하고 줄은 바꾸지 않는다
			}
			System.out.println();  // 줄 바꾸기
		}
	}
}
