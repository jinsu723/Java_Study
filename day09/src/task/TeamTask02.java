package task;

import java.util.Scanner;

public class TeamTask02 {
	public static void main(String[] args) {
		// 사칙연산 실행
		// 조건
		// 1차원 2칸짜리 배열 생성
		// 사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
		// 메소드4개(더하기, 빼기, 곱하기, 나누기)
		// 리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
		// -> 더하기 메소드(for-each문 사용)
		// -> 빼기 메소드(큰값 - 작은값)
		// -> 곱하기 메소드(원하시는 대로)
		// -> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스.
		// 0으론 나눌 수 없음. 출력하고 종료.)
		
		int[] ar = new int[2];
		
		TeamTask02 tt = new TeamTask02();
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 띄어쓰기로 구분하여 입력하세요.");
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("두 수의 합은 : " + tt.sum(ar));
		System.out.println("두 수의 뺴기는 : " + tt.sub(ar));
		System.out.println("두 수의 곱하기는 : " + tt.mul(ar));
		if(ar[1] == 0) {
			System.out.println("0으론 나눌 수 없음.");
		} else {
			System.out.println("두 수의 나누기는 : " + tt.div(ar));
		}
	}
	
	int sum(int[] ar) {
		int result = 0;
		for(int data : ar) {
			result += data;
		}
		return result;
	}
	
	int sub(int[] ar) {
		int result = 0;
		if(ar[0] > ar[1]) {
			result = ar[0] - ar[1];
		} else {
			result = ar[1] - ar[0];
		}
		return result;
	}
	
	int mul(int[] ar) {
		return ar[0] * ar[1];
	}
	
	double div(int[] ar) {
		double result = (double)ar[0] / ar[1];
		return result;
	}
}
