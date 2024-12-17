package twoArray;

import java.util.Arrays;

// 7 번 : Arrays.sort()를 이용한 정렬

public class ArraysTest {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("정렬 전 : " + Arrays.toString(number));
		
		Arrays.sort(number, 0, 4);  // 부분정렬 0~3인덱스
		
		System.out.println("정렬 후 : " + Arrays.toString(number));
	}
}
