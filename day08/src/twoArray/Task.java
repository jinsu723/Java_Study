package twoArray;

import java.util.Arrays;
import java.util.Scanner;

// 12번 : 실습

public class Task {
	public static void main(String[] args) {
		// 1. 3x3 크기의 2차원 배열을 생성하고 사용자가 입력한 값을 대입
		// 1) 각 행의 합계와 평균 출력
		// 2) 전체 배열의 합계와 평균 출력

		// 입력 메소드 import
		// 배열 생성
		// 변수 선언(합계, 평균)
		// 사용자에게 입력 받은 값 배열에 저장
		// 저장받는 값들을 합계 변수에 더해서 저장
		// 평균 계산
		// 출력

		Scanner sc = new Scanner(System.in);
		int[][] ar1 = new int[3][3];
		int[] sum = new int[3];
		double[] avg = new double[3];
		int totalSum = 0;
		double totalAvg = 0.0;

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				System.out.println("정수를 입력하세요");
				ar1[i][j] = sc.nextInt();
				totalSum += ar1[i][j];
			}
			for (int j = 0; j < ar1[i].length; j++) {
				sum[i] += ar1[i][j];
			}
			for (int j = 0; j < ar1[i].length; j++) {
				avg[j] = (double) sum[j] / ar1[i].length;
			}
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.println((i + 1) + "행 합계 : " + sum[i] + ", 평균 : " + avg[i]);
		}
		totalAvg = (double) totalSum / (ar1[1].length * 3);
		System.out.println("총 합 : " + totalSum + ", 평균 : " + totalAvg);

		// 강사님 코드
		int[][] ar2 = new int[3][3];

		double rowAvg = 0.0;

		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[i].length; j++) {
				System.out.println("ar2[" + i + "][" + j + "] 배열의 값 입력 : ");
				ar2[i][j] = sc.nextInt();
			}
		}
		System.out.println("각 행의 합계와 평균 : ");
		for (int i = 0; i < ar2.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < ar2[i].length; j++) {
				rowSum += ar2[i][j];
			}
			rowAvg = (double) rowSum / ar2[i].length;
			System.out.printf("행 : %d, 합계 : %d, 평균 : %.2f\n", i + 1, rowSum, rowAvg);
		}

		int total1 = 0;
		double totalAvg1 = 0.0;
		for (int[] row : ar2) {
			for (int value : row) {
				total1 += value;
			}
		}
		totalAvg1 = (double) total1 / (ar2.length * ar2[0].length);
		System.out.printf("배열의 총 합 : %d, 평균 : %.2f\n", total1, totalAvg1);
		// 2. 2x2 크기의 2차월 배열을 생성하고 초기값을 아래와 같이 설정한다
		// 1 2
		// 3 4
		// 1)얕은 복사로 복사하고 1행1열의 값을 40으로 변경한 뒤 원본배열과 변경된 배열 출력
		// 2) 깊은 복사로 복사하고 0행 1열의 값을 20으로 변경한 뒤 원본 배열과 변경된 배열 출력하기

		int[][] ar3 = { { 1, 2 }, { 3, 4 } };

		// 1) 얕은 복사 => 값 변경
		int[][] ar3Copy = ar3;
		System.out.println("원본 배열 복사한 배열 : " + Arrays.deepToString(ar3));
		ar3Copy[1][1] = 40;

		System.out.println("원본 배열 : " + Arrays.deepToString(ar3));
		System.out.println("수정된 배열 : " + Arrays.deepToString(ar3));

		// 2) 깊은 복사 => 값 변경X
//		int[][] ar3Copy2 = new int[ar3.length][];
//		for(int i=0; i<ar3.length; i++) {
//			ar3Copy2[i] = Arrays.copyOf(ar3[i],ar3[i].length);
//			// Arrays.copyOf : 배열의 내용을 갚은 복사하는 메소드
//			// ar3[i] : 배열의 내용을 깊은복사
//			// ar3[i].length : 복사할 배열의 길이
//			
//			// 원본 열 ar3[i]와 독립된 새로운 메모리 공간에 저장
//			System.out.println(ar3Copy2[i]);
//		}

		int[][] ar3Copy2 = new int[ar3.length][];

		for (int i = 0; i < ar3.length; i++) {
			ar3Copy[i] = new int[ar3[i].length];
			for (int j = 0; j < ar3[i].length; j++) {
				ar3Copy[i][j] = ar3[i][j]; // 값 복사
			}
		}

		ar3Copy2[0][1] = 20;

		System.out.println("원본 배열 : " + Arrays.deepToString(ar3));
		System.out.println("원본 배열 : " + Arrays.deepToString(ar3Copy2));

		int[][] arr = { { 1 }, { 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		for (int[] ar : arr) {
			for (int ar4 : ar) {
				System.out.print(ar4);
			}
			System.out.println();
		}
	}
}
