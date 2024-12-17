package ex01;

public class Main_t {
	public static void main(String[] args) {
		Student_t st1 = new Student_t("짱구", 80, 90);
		Student_t st2 = new Student_t("철수", 99, 70);

		System.out.println(st1);
		System.out.println(st2);

		System.out.println(st1.totalScore);
		System.out.println(st2.totalScore);

		System.out.println(st1.isPass((st1.javaScore + st1.dbmsScore) / 2) ? "PASS" : "FAIL");
		System.out.println(st2.isPass((st2.javaScore + st2.dbmsScore) / 2) ? "PASS" : "FAIL");

	}
}
