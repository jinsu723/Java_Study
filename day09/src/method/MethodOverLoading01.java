package method;

// 7번 : 메소드 오버로딩

public class MethodOverLoading01 {
	public static void main(String[] args) {
		
		System.out.println(addInt(10, 2));
		System.out.println(addDouble(15.2, 4.6));
	}
	
	// 메소드 오버로딩 전
	static int addInt(int num1, int num2) {
		return num1 + num2;
	}
	
	static double addDouble(double num1, double num2) {
		return num1 + num2;
	}
}
