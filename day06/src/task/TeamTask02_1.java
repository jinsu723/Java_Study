package task;

import java.util.Scanner;

public class TeamTask02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("정수입력");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j < num - i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
