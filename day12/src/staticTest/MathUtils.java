package staticTest;

// 1번 : 정적 메소드

public class MathUtils {
	// 메소드
	static int getMax(int num1,int num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	static double round(double num) {
		return Math.round(num);
		// round() : 소수점 값을 가장 가까운 정수로 반올림하는 메소드
	}
}
