package ex01_01;

public class Student {
	// 사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
	// 필드 : 이름, java점수, dbms점수, 총점, 학점
	// 생성자 : 상관없음
	// 메소드 : calculateGrage(int ) : 점수를 받아 학점 반환하는 메소드(매개변수1개 정수형)
	// 		isPass(int) : 점수가 70점 이상이면 true, 아니면 false 반환하는 메소드
	
	// 필드 초기화
	// 이름, 점수, 점수를 받는 생성자 선언
	// 학점이 계산해주는 메소드
	// 총점과 학점을 반환해주는 메소드
	// 합격 여부를 출력해주는 메소드
	
	String name;
	int javaScore;
	int dbmsScore;
	int sum;
	char grade;
	
	public Student(String name, int javaScore, int dbmsScore) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
	}
	
	char getGrade() {
		this.sum = this.javaScore + this.dbmsScore;
		if(this.sum/2 >= 90) {
			return 'A';
		} else if(this.sum/2 >= 80) {
			return 'B';
		} else if(this.sum/2 >= 70) {
			return 'C';
		} else {
			return 'F';
		}
	}
	
	void getTotal() {
		System.out.println(this.name + "님의 학점은 " + getGrade() + "입니다.");
	}
	
	boolean isPass() {
		if((javaScore + dbmsScore)/2 < 70) {
			return false;
		} return true;
	}
	
}
