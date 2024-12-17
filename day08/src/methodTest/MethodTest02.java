package methodTest;

// 14번 : 메소드 정의 및 호출

public class MethodTest02 {
	public static void main(String[] args) {
		// 메소드 호출
		// 1) 메소드 정의하는 부분에서 static 키워드 붙인다 (static 키워드 배우기 전까지 사용하지 않음)
		// (main 메소드가 메모리에 할달될 때 add메소드도 같이 메모리 할장시키는 방법)
		
		// 2) 메임 메소드에 add 메소드가 있는 클래스를 알려준다
		// 클래스명 변수 = new 클래스명();
		MethodTest02 mt = new MethodTest02();
//		System.out.println(mt.add(10, 20));
		mt.add(10, 20);
		mt.add(5, 5);
		
		MethodTest02 mt1 = new MethodTest02();
		System.out.println(mt);
		System.out.println(mt1);
		mt1.add(10,10);
	}
	
	// 2개의 값을 더하는 메소드 add
	// 리턴 타입 => void
	// 메소드 명 => add
	// 매개변수 => int num1, int num2
	// 실행할 문장 => num1출력, num2출력, num1 + num2 출력
	// 리턴값 x
	
	void add(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1+num2);
	}
}
