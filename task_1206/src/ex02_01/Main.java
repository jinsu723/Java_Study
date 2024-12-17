package ex02_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 5명의 학생의 점수(1과목씩)를 입력받아 아래를 수행하는 프로그램
		// 총합 계산
		// 평균 계산
		// 최고점수와 해당 인덱스를 출력
		// 최저 점수와 해당 인덱스 출력

		// 점수는 배열에 저장하여 출력
		// 나중에 학생 수를 사용자가 입력할 수 있도록 변경할 예정이다
		
		// 입력 메소드 import
		// 학생 수 입력 받기
		// 입력받은 수 만큼의 길이를 갖는 배열 선언
		// for문을 통해 점수 1개씩 입력
		// 총합 계산
		// 평균 계산
		// for문에서 최고점수와 해당 인덱스 찾기
		// for문에서 최저점수와 해당 인덱스 찾기
		// 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		System.out.println("학생 수 입력");
		int[] stu = new int[sc.nextInt()];
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생 " + (i+1) + "의 점수 입력");
			stu[i] = sc.nextInt();
			sum += stu[i];
		}
		
		avg = (double)sum/stu.length;
		
		int maxIdx = 0;
		int	minIdx = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<stu.length; i++) {
			if(stu[i] > max) {
				max = stu[i];
				maxIdx = i;
			}
			if(stu[i] < min) {
				min = stu[i];
				minIdx = i;
			}
		}
		
		System.out.println("최고 점수 : " + max + ", 인덱스 : " + maxIdx);
		System.out.println("최저 점수 : " + min + ", 인덱스 : " + minIdx);
	}
}
