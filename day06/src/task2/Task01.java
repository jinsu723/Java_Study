package task2;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
//		공백(0100)                                                           
//		문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
//		   구구단은 1단부터 9단까지다.
//		   사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
//		   (이중 for 문 사용, if 사용 X)
//
//		[입출력예시]
//		구구단을 어디까지 출력할까요? : 4
//		1 * 1 = 1   2 * 1 = 2   3 * 1 = 3   4 * 1 = 4   
//		1 * 2 = 2   2 * 2 = 4   3 * 2 = 6   4 * 2 = 8   
//		1 * 3 = 3   2 * 3 = 6   3 * 3 = 9   4 * 3 = 12   
//		1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16   
//		1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   
//		1 * 6 = 6   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   
//		1 * 7 = 7   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   
//		1 * 8 = 8   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   
//		1 * 9 = 9   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36
		
		Scanner sc = new Scanner(System.in);
		TaskMethod tm = new TaskMethod();
		System.out.println("*****원하는 단까지 출력해드립니다*****");
		System.out.println("몇 단을 입력해 드릴까요?");
		String dan = sc.nextLine();
		
		if(!tm.checkNum(dan)) {
			try {
				throw new TaskException("정수가 입력되지 않았습니다");
			} catch (TaskException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} else {
			tm.gugudan(Integer.parseInt(dan));
		}
	}
}
