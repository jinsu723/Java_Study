package method;

// 6번 : 메소드 사용이유3 : 유지보수에 유리함

public class MethodBasic03 {
	public static void main(String[] args) {
		// 코드의 구조를 모듈화(=부품화)함으로써 수정과 확장이 쉬워진다
		// 하나의 메소드만 변경하면 해당 메소드를 호출하는 모든 코드에 자동으로 반영되므로
		// 수정 범위를 최소화할 수 있다
		
		System.out.println("메소드이용 25의 제곱 : " + calculateSqure(25));
		System.out.println("5의 제곱 : " + 5*5);
		System.out.println("100의 제곱 : " + 100*100);
		
		System.out.println("메소드이용 5의 제곱 : " + calculateSqure(5));
	}
	
	static int calculateSqure(int num) {
		return num * num;
	}
}
