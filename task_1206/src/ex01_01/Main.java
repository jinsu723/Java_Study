package ex01_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//로직구성 있어야 함
		
		// 성적 평가 프로그램
		// 학생의 성적을 입력받아 학점을 계산하는 프로그램
		// 90점이상 A, 80점 이상 90점 미만 B, 70점 이상 80점 미만 C, 70점 미만 F
		// 반드시 메소드 만들 것(2개 이상), 객체를 2개 만들 것
				
		
		// 사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
		// 필드 : 이름, java점수, dbms점수, 총점, 학점
		// 생성자 : 상관없음
		// 메소드 : calculateGrage(int ) : 점수를 받아 학점 반환하는 메소드(매개변수1개 정수형)
		// 		isPass(int) : 점수가 70점 이상이면 true, 아니면 false 반환하는 메소드
		
		// 입력 메소드 import
		// 점수 2개를 저장할 변수 선언
		// 객체 생성
		// 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생1의 이름, java 점수, dbms 점수를 띄어쓰기를 통해 입력하세요");
		Student t1 = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		
		System.out.println("학생2의 이름, java 점수, dbms 점수를 띄어쓰기를 통해 입력하세요");
		Student t2 = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		
		t1.getTotal();
		System.out.println(t1.isPass());
		
		t2.getTotal();
		System.out.println(t2.isPass());
	}
}
