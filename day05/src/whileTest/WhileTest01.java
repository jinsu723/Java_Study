package whileTest;

// 13번 : while문

public class WhileTest01 {
	public static void main(String[] args) {

//		int i = 1;
//		while(i<=5) {
//			System.out.println("나는 행복합니다!");
//			System.out.println("야호!");
//			i++;
//		}

		// 1부터 5까지 총합 구하기
		// 1) 총합 구할 변수, 비교대상이 될 변수 선언
		// 2) while(조건식 i<6)
		// 3) { 총합 += 비교대상변수;
		// 4) 비교대상변수++; }
		// 5) 출력
		int total = 0, num = 0;
		while (num < 6) {
			total += 1;
			num++;
		}
		System.out.println("총 합 : " + total);

		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
	}
}
