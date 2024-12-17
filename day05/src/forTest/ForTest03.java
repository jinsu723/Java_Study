package forTest;

// 12번 : for문 연습

public class ForTest03 {
	public static void main(String[] args) {

		// 이름 5번을 출력
//		for(초기식; 조건식; 증감식) {
//			System.out.pirntln(번, 이름);
//		}

		// 1) for( 초기식 int = 0; 조건식 i <= 6; i++)
		// 2) { 출력(i + "번 이름"); }

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번 길진수");
		}

		for (int i = 5; i > 0; i--) {
			System.out.println((6 - i) + "번 길진수");
		}

		// 1부터 100까지의 합 출력
		// 1) 총합 저장할 변수
		// 2) for문(초기식 int i=1; 조건식 i<101; i++)
		// 3) { 총합저장할변수 += i; }
		// 4) 합 출력

		int sum = 0;

		for (int i = 1; i < 101; i++) {
			sum += i;
		}

		System.out.println("총 합 : " + sum);

		// 1부터 100까지 짝수의 합
		// 변수 선언(int)
		// for문 i=0; i<101; i++
		// 짝수 구하기 if i%2==0
		// 결과 출력

		int sum1 = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}

		System.out.println("1부터 100까지 짝수들의 총 합 : " + sum1);

//      2번방법 : for문에서 짝수만 반복
		// 1) 총합구할 변수
		// 2) for(초기식 i = 2; i <= 100; i += 2){
		// 3) 총합 += i }
		// 4)출력
		int total1 = 0;
		for (int i = 2; i <= 100; i += 2) {
			total1 += i;
		}
		System.out.println("2번방법 총합 : " + total1);

//      3번방법 : i를 1부터 50까지, 짝수 생성하는 방법
		// 1) 총합구할 변수
		// 2) for(초기식 i = 1; i <= 50; i++){ //1부터 50까지 반복
		// 3) 총합 += i * 2; }
		// 4) 출력

		int total2 = 0;
		for (int i = 1; i <= 50; i++) {
			total2 += i * 2;
		}
		System.out.println("3번방법 총합 : " + total2);

	}
}
