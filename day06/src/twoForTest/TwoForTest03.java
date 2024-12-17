package twoForTest;

import java.util.Scanner;

// 4번 : 
public class TwoForTest03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("수를 입력하세요");
		num = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0; i<num; i++) {  // 행
			for(int j=0; j<=i; j++) {  // 열
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
