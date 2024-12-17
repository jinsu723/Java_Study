package task;

import java.util.Scanner;

// JAVA요 문제2
public class Task05 {
	public static void main(String[] args) {
//		2번 문제
//		사용자에게 행과 열의 수를 입력받아 그에 맞게 한칸당 []를 출력해 행과 열을 표시한다
//		그리고 사용자에게 입력 받은 행 과 열의 곱을 제일 맨 마지막 []안에 기입해준다
		
		// 입력메소드 import
		// 입력받은 두 수를 저장할 변수 선언
		// 차례로 입력받은 대로 행과 열을 가지고 있는 2차원 배열 생성
		// 이중for문 사용하여 i의 값과 j의 값을 []안에 넣어 출력
		// 마지막 값을 행과열의 곱으로 넣어준다
		
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		
		System.out.println("두 정수를 입력하세요.");  // 사용자에게 입력값 요구
		
		int num1 = sc.nextInt();  // 첫 번째 정수 저장
		int num2 = sc.nextInt();  // 두 번째 정수 저장
		
		sc.close();  // 자원 닫기
		
		int[][] ar = new int[num1][num2];  // 2차원 배열 생성
		
		for(int i=0; i<ar.length; i++) {  // 행
			for(int j=0; j<ar[i].length; j++) {  // 열
				
				if((i==(ar.length-1)) && (j==(ar[i].length-1))) {  // 행과 열의 맨 마지막이라면
					System.out.println("[" + (i*j) + "]");  // 행과 열의 곱을 출력
				} else {  // 아니면
					System.out.print("[" + i + " " + j + "]");  // [i j]를 출력
				}
			}
			System.out.println();  // 행이 바뀔 떄마다 줄바꿈
		}
	}
}
