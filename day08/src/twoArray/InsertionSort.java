package twoArray;

import java.util.Arrays;

// 4번 : 삽입 정렬

public class InsertionSort {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("초기 배열 : ");
		
		for(int num : number) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for(int i=1; i<number.length; i++) {
			int key = number[i];  // 임시저장
			int j = i - 1;  // 인덱스 번호
			
			// key보다 큰 값을 오른쪽으로 이동
			while(j>=0 && number[j]>key) {
				number[j+1] = number[j];  // 조건이 맞다면 자리 이동
				j--;
			}
			
			number[j+1] = key;
			
			System.out.println(i + "단계 : " + Arrays.toString(number));
		}
		System.out.println("정렬 완료 : " + Arrays.toString(number));
	}
}
