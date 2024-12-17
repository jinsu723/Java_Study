package staticTest;

//3번 : 정적 변수와 정적 메소드

public class MyClassB {
	public static void main(String[] args) {
		// 1. 인스턴스 변수 출력 => 객체 생성 필수
		MyClassA a = new MyClassA();
		MyClassA aa = new MyClassA();
		System.out.println(a.instanceVar);  // 0
		
		// 2. 정젹 변수 출력 => 객체 생성으로 접근 가능하나 권장하지 않음
		// 클래스명.정적변수명으로 접근하나!! => 공통된 저장공간을 사용한다
		System.out.println(a.staticVar);
		System.out.println(MyClassA.staticVar);  // 0
		
//		a.staticVar = 10;
//		System.out.println(a.staticVar);
//		aa.staticVar = 20;
//		System.out.println(aa.staticVar);
//		System.out.println(a.staticVar);
		
		// 3. 다른 클래스에서 안스턴스 메소드 호출
//		a.instanceMethod1();
		
		// 4. 다른 클래스에서 스테틱 메소드 호출
		MyClassA.staticMethod1();
	}
}
