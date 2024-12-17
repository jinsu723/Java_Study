package ex02;

import java.util.Scanner;

public class Main_t {
	public static void main(String[] args) {
		// 학생수와 점수 저장할 배열 선언
		// 입력클래스 import
		Scanner sc = new Scanner(System.in);
		int stu = sc.nextInt();
		int[] studentCount = new int[stu];
		
		// 점수입력
		System.out.println("학생 수 입력 : ");
		for(int i=0; i<stu; i++) {
			System.out.println((i+1) + "학생의 점수 : ");
			studentCount[i] = sc.nextInt();
		}
		
		// 총합 계싼
		int total = 0;
		for(int score : studentCount) {
			total += score;
		}
		
		// 평균 계산
		double avg = (double) total / stu;
		
		// 최고점수와 해당 인덱스 계산
		int maxScore = studentCount[0];
		int maxIndex = 0;
		for(int i=1; i<studentCount.length; i++) {
			if(studentCount[i] > maxScore) {
				maxScore = studentCount[i];
				maxIndex = i;
			}
		}
		
		System.out.println("결과");
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("최고점수 : " + maxScore + ", 인덱스 번호 : " + maxIndex);
		
		sc.nextLine();
		sc.close();
	}
}
