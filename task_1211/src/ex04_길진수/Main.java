package ex04_길진수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 입력메소드 import
		// 객체 생성
		// 입력받은 이름과 각 점수로 객체 생성
		// 입력은 0~100
		// 입력 범위 벗어나면 메시지 출력하고 프로그램 종료
		// 각 학생의 총점과 평균 출력
		
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		

		System.out.println("학생1의 이름과 java 점수, dbms점수, html점수를 띄어쓰기로 구분하여 입력하세요");
		// 1번 학생에게 입력값 요구
		Student st1 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		// 입력받은 이름과 점수들을 인수로 넣어서 객체 생성
		
		System.out.println("학생2의 이름과 java 점수, dbms점수, html점수를 띄어쓰기로 구분하여 입력하세요");
		// 2번 학생에게 입력값 요구
		Student st2 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		// 입력받은 이름과 점수들을 인수로 넣어서 객체 생성

		
		System.out.println(st1.getName() + "의 총점은 : " + st1.getTotalScore() + "이고 평균은 : " + st1.getAverageScore() + "입니다");
		// 이름을 반환하는 메소드, 총점 반환 메소드, 평균 반환 메소드를 사용하여 결과 출력
		System.out.println(st2.getName() + "의 총점은 : " + st2.getTotalScore() + "이고 평균은 : " + st2.getAverageScore() + "입니다");
		// 이름을 반환하는 메소드, 총점 반환 메소드, 평균 반환 메소드를 사용하여 결과 출력
	}
}
