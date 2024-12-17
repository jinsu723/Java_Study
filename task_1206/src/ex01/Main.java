package ex01;

import java.util.Scanner;

// 길진수
public class Main {
	String name;
	int java;
	int dbms;
	
	Main(String name, int java, int dbms){
		this.name = name;
		this.java = java;
		this.dbms = dbms;
	}
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
		
		// 입력메소드
		// 객체 생성
		// 점수 저장할 변수
		// 메소드로 보내 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 학생의 이름과 java 성적, dbms성적을 띄어쓰기로 입력하세요.");
		String name1 = sc.next();
		int java1 = sc.nextInt();
		int dbms1 = sc.nextInt();
		Main st1 = new Main(name1, java1, dbms1);
		
		System.out.println("두 번째 학생의 이름과 java 성적, dbms성적을 띄어쓰기로 입력하세요.");
		String name2 = sc.next();
		int java2 = sc.nextInt();
		int dbms2 = sc.nextInt();
		Main st2 = new Main(name2, java2, dbms2);
		
		int sum1 = st1.java + st1.dbms;
		int sum2 = st2.java + st2.dbms;
		
		System.out.println(st1.name + "의 학점 : " + st1.calculateGrage(sum1));
		System.out.println(st2.name + "의 학점 : " + st2.calculateGrage(sum2));
		
		System.out.println(st1.name + "는 " + (st1.isPass(sum1) ? "통과" : "실격"));
		System.out.println(st2.name + "는 " + (st2.isPass(sum2) ? "통과" : "실격"));
		
	}
	
	// 계산기
	// 리턴값 문자열
	// 평균을 구해 학저 계산
	// 매개변수 정수 정수
	char calculateGrage(int sum){
		int avg = sum / 2;
		if(avg >= 90) {
			return 'A';
		} else if(avg >= 80) {
			return 'B';
		} else if(avg >= 70) {
			return 'C';
		} else {
			return 'F';
		}
	}
	
	// 패스
	// 리턴값 논리형
	// 매개변수 정수형
	// 점수 입력받고 논리형 리턴
	
	boolean isPass(int avg) {
		if(avg/2 >= 70) {
			return true;
		} else {
			return false;
		}
	}
}
