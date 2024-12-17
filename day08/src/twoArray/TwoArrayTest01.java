package twoArray;

// 1번 : 2차월 배열
//	 행과 열로 구성된 데이터를 저장하는 배열의 형태

public class TwoArrayTest01 {
	public static void main(String[] args) {
		int[][] ar1;  // 2차워 배일 선언
		ar1 = new int[3][2];  // 3행 2열 크기의 배열 생성
		
		System.out.println(ar1);  // 2차원 배열의 전체 주소값
//		[[I@b3d7190 : 2차원 배열 전체의 참조값(JVM에 의해 제공)
//		[[0, 0]. [0, 0], [0, 0]]
		System.out.println(ar1[0]);  // 0행의 참조값
//		[I@5fdba6f9 : 0행의 참조값(1차원 배열)
		System.out.println(ar1[0][0]);  // 0행 0열의 값 출력
//		0 : 0행 0열의 값(초기화 된 기본값)
		
		int[] ar2 = new int[3];
		System.out.println(ar2);
//		[I@10d59286 : 1차원 배열의 참조값
//		[0, 0, 0]
		System.out.println(ar2[0]);
//		1차원 배열의 첫 번쨰 값(초기화 된 기본값)
	}
}
