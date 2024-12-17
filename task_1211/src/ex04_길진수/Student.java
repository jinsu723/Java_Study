package ex04_길진수;

public class Student extends Person{
	
	// 필드 선언 정수형 3개
	// 생성자 1개 점수 초기화
	// 메소드 정수형 반환
	// 메소드 실수형 반환
	
	private int javaScore;  // java 점수 필드 선언
	private int dbmsScore;  // dbms 점수 필드 선언
	private int htmlScore;  // html 점수 필드 선언
	
	// 학생의 이름과 과목별 점수를 매개변수로 받는 생성자 선언
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);  // 이름은 부모의 생성자로 보내서 겹치는 코드를 줄인다
		this.javaScore = javaScore;  // java 점수 필드 초기화
		this.dbmsScore = dbmsScore;  // dbms 점수 필드 초기화
		this.htmlScore = htmlScore;  // html 점수 필드 초기화
	}
	
	// 총점을 정수형으로 반환하는 메소드 선언
	int getTotalScore() {
		return this.javaScore + this.dbmsScore + this.htmlScore;
		// 해당 객체의 점수들의 총합을 반환한다
	}
	
	// 평균을 실수형으로 반환하는 메소드
	double getAverageScore() {
		return (this.getTotalScore()) / 2d;
		// 해당 객체의 평균 점수를 총점 메소드로 받아온 값에서 2을 나누어 실수형으로 반환
	}
}
