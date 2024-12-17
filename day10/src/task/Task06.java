package task;

import java.util.Scanner;

// JAVA요 문제3

public class Task06 {
	public static void main(String[] args) {
//		3번 문제 
//		사용자에게 각 국어, 수학, 역사의 점수를 입력받는다
//		입력받은 3개의 과목의 총합점수와 소수점 2번째 자리 까지 평균을 구해라
		
		// 입력메소드 import
		// 객체 선언
		// 점수를 저장할 변수 선언
		// 총합과 평균을 구해주는 메소드
		
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		Task06 t = new Task06();  // 겍체 선언
		
		int korean = 0, math = 0, history = 0;  // 점수 저장할 변수 선언 및 초기화
		
		System.out.println("국어, 수학, 역사의 점수를 띄어쓰기를 통해 입력하세요.");  // 입력값 요구
		korean = sc.nextInt();  // 국어 성적 저장
		math = sc.nextInt();  // 수학 성적 저장
		history = sc.nextInt();  // 역사 성적 저장
		
		System.out.printf("%.2f", t.getAvg(korean, math, history));  // 메소드 호출하여 평균 구하고 소수점 2자리까지 출력
	}
	
	// 리턴 x 매개변수 정수
	// 총합 구하기
	// 평균 구하는 메소드 호출
	double getAvg(int num1, int num2, int num3) {  // 점수를 받아 평균을 구해주는 메소드
		int sum = num1 + num2 + num3;  // 점수를 더해 총합을 구한다
		return div(sum);  // 평균을 구해주는 메소드 호출
	}
	
	// 리턴x 매개변수 정수
	// 평균 구하기
	// 실수형으로 강제형변환 하고
	// 평균 구해서 소수점 2자리까지 출력하기
	
	double div(int num) {  // 평균 구해주는 메소드
		double avg = (double)num / 3;  // 입력받은 총합을 3으로 나누어주고 실수형으로 형변환
		return avg;  // 평균 return
	}
}
