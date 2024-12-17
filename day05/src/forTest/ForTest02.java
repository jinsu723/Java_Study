package forTest;

// 11번 : 반복문(for문)

public class ForTest02 {
	public static void main(String[] args) {
		// p130 1부터 10까지의 총합 구하기
		// 1) 정수형 변수 (총함 구할 변수)
		// 2) for 반복문(초기식 1; 조건식 <= 10; 증감식++){
		// 3) 총합 구할 변수 += 변수;
		// 4) }
		// 5) 총합 출력 sum
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			sum += i;
			System.out.println("총 합 : " + sum);
		}
		
		System.out.println("총 합 : " + sum);
	}
}
