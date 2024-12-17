package apiTest;

public class ApiMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc);
		
		try {
			System.out.println(calc.divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
}
