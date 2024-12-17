package twoArray;

import java.util.Arrays;

// 5 번 : 선택 정렬

public class SelectionSort {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("초기 배열 : " + Arrays.toString(number));
		
		for(int i=0; i<number.length-1; i++) {
			// 최소값 저장할 변수
			int minIdx = i;
			
			// 최소값 찾기
			for(int j=i+1; j<number.length; j++) {
				if(number[j] < number[minIdx]) {
					minIdx = j;
				}
			}
			// 최소값과 현재 요소 교환
			int temp = number[minIdx];
			number[minIdx] = number[i];
			number[i] = temp;
			
			System.out.println((i + 1) + "단계 : " + Arrays.toString(number));
		}
		System.out.println("정렬 완료 : " + Arrays.toString(number));
	}
}
