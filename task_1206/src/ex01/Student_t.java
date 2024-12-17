package ex01;

public class Student_t {
	// 필드
	String name;
	int javaScore;
	int dbmsScore;
	int totalScore;
	String grade;
	
	// 생성자
	public Student_t(String name, int javaScore, int dbmsScore) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.totalScore = javaScore + dbmsScore;
		this.grade = calculateGrade((javaScore + dbmsScore)/2);
	}
	
	// 메소드
	// calculateGrade(int ) : 두 과목의 평균점수(int) 학점 반환하는 메소드(매개변수 1개 정수형)
	String calculateGrade(int avgScore) {
		if(avgScore >= 90) {
			return "A";
		} else if(avgScore >= 80) {
			return "B";
		} else if(avgScore >= 70) {
			return "C";
		} else {
			return "F";
		}
	}
	
	// isPass(int) : 두 과목의 평균 점수(int)가 70점 이상이면 true, 아니면 false반환하는 메소드
	boolean isPass(int avgScore) {
		return avgScore >= 70;
	}
}
