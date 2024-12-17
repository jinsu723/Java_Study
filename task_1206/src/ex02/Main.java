package ex02;

import java.util.Scanner;

// 길진수
public class Main {
	public static void main(String[] argrs) {
		// 5명의 학생의 점수(1과목씩)를 입력받아 아래를 수행하는 프로그램
		// 총합 계산
		// 평균 계산
		// 최고점수와 해당 인덱스를 출력
		// 최저 점수와 해당 인덱스 출력
		
		// 점수는 배열에 저장하여 출력
		// 나중에 학생 수를 사용자가 입력할 수 있도록 변경할 예정이다
		
		//입력메소드
		// for문을 이용하여 점수 받아 저장
		// 총합 구하기
		// 평균 구하기
		// 최고점수 찾기
		// 최고점수와 해당 인덱스 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i++) {
			System.out.println("점수를 차례대로 입력하세요.");
			score[i] = sc.nextInt();
		}
		int sum = 0;
		for(int data : score) {
			sum += data;
		}
		int avg = sum / 5;
		int index = 0;
		
		int max = 0;
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
				index = i;
			}
		}
		
		sc.nextLine();
		sc.close();
	}
}
