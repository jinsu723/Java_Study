package method;

// 5번 : 메소드 사용이유2 : 높은 재사용성

public class MethodBasic02 {
	public static void main(String[] args) {
		// 동일한 로직을 구현하기 위해 새롭게 코드를 작성할 필요 없이
		// 이미 작성된 메소드를 호출하면 된다
		// 작성된 코드의재사용성을 높일 수 있다
		
		System.out.println("첫 번째 직사각형의 면적 : " + calculateArea(5,10));
		System.out.println("첫 번째 직사각형의 면적 : " + calculateArea(50,3));
	}
	
	static int calculateArea(int width, int height) {
		return width * height;
	}
}
