package array;

// 4번 :

public class ArrayTest04 {
	public static void main(String[] args) {
		// 1부터 10까지의 값을 변수에 넣고 출력하기
		// 1) 배열 선언 및 생성 => 값을 알 때
		int[] number1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] number2 = { 1, 2, 3, 4, 5 };

		// 배열명.length : 배열의 길이, 배열의 길이에서 -1이 인덱스 끝 번호

		// 2) 배열의 출력
//		for(int i=0; i<number1.length; i++) {
//			System.out.println("number1[] : " + number1[i]);
//		}
//		
//		for(int i=0; i<number2.length; i++) {
//			System.out.println("number2[] : " + number2[i]);
//		}

		// 1. 1부터 10까지의 값을 배열에 넣고 출력
		// 1) 배열 선언 및 생성(값을 모를 때)
		int[] number3 = new int[10]; // 10칸짜리 배열을 생성하면 인덱스 번호는 0 ~ 9까지
		// 2) for문(초기식 int i=0(인덱스 번호는 0부터 시작);
		// 조건식 i < 배열명.length; (배열의 길이보다 작을 동안 반복)
		// 증감식 i++){
		// 3) 값 대입 배열명[i] = i + 1;
		// 4) 출력 배열명[i] }

		for (int i = 0; i < number3.length; i++) {
			number3[i] = i + 1;
		}

//		for (int i = 0; i < number3.length; i++) {
//			System.out.println("number3[] : " + number3[i]);
//		}

		// 5부터 1까지의 값을 배열에 담고 출력하기
		// 조건1) 칸 수를 알 때로 선언한다
		// 조건2) 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다

		// 로직 구성
		// 1) 배열 선언
		// 2) 값을 대입하는 반복문(for문)
		// 초기식 => int i = 0;
		// 조건식 => i < 배열명.length;
		// 증감식 => i++ {

		int[] number4 = new int[5];

		// 방법1
		for (int i = 0; i < number4.length; i++) {
			number4[4 - i] = i + 1;
		}

		for (int i = 0; i < number4.length; i++) {
			System.out.println("number4[" + i + "] : " + number4[i]);
		}
		System.out.println("프로그램 종료");

		// 방법2
		// 초기식 i = 5;
		// 조건식 i > (5 - number4.length);
		// 증감식 i--
		// 출력
		for (int i = 5; i > (5 - number4.length); i--) {
			number4[5 - i] = i;
		}

//		for (int i = 5; i > (5 - number4.length); i--) {
//			System.out.println("number4[" + (5 - i) + "] : " + number4[5 - i]);
//		}

		// 빠른 for문
		for(int data : number4) {
			System.out.println("number4[] : " + data);
		}
	}
}
