package task2;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		// 일반 for문, for-each문 상관없음(소수점 3자리까지)
		
		
		// 4칸짜리 배열 선언하기
		// 합계를 저장할 변수선언
		// for문 사용하여 4차레 값 입력받아 배열에 저장
		// for-each문 사용하여 합계 구하기
		// 평균 구하기
		
//		int[] arr = new int[4];
//		double sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			System.out.println((i+1) + "번째 수를 입력하세요");
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int data : arr) {
//			sum += data;
//		}
//		
//		System.out.println("합계 : " + sum + ", 평균 : " + ((double)sum/arr.length));
		
		// 4. 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 출력 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		//    최종적으로 5의 배수 또는 5의 배수 숫자들의 합을 구하기
		
		// 배열에 1부터 100까지의 숫자 차례대로 넣기
		// 3의 배수와 5의 배수라면 출력
		// 3의 배수와 5의 배수 각각 누적 더하기
		
		int[] ar = new int[100];
		int count = 0;
		int num1 = 0;
		int num2 = 0;
		
		for(int i=1; i<=ar.length; i++) {
			ar[i-1] = i;
		}
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%3==0 || ar[i]%5==0) {
				System.out.print(ar[i] + " ");
				count++;
				if(ar[i]%3==0) {
					num1 += ar[i];
				}
				if(ar[i]%5==0) {
					num2 += ar[i];
				}
				if(count%5==0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("3의 배수의 총 합 : " + num1);
		System.out.println("5의 배수의 총 합 : " + num2);
	}
	
	
}
