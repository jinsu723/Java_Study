package task2;

import java.util.Scanner;

import method.GetNum;

public class TaskMethod extends GetNum{

	@Override
	public boolean checkNum(String num) {
		// TODO Auto-generated method stub
		return super.checkNum(num);
	}
	
	// 입력받은 단까지 구구단을 출력
	void gugudan(int dan) {
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan; j++) {
				System.out.printf("%-3dX%3d = %1d\t", j, i, (j*i));
			}
			System.out.println();
		}
	}
	
	// 업엔다운게임
	void upAndDown() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****UP&DOWN GAME*****");
	}
}
