package staticTest;

// 3번 : 정적 변수와 정적 메소드

public class MyClassA {
	// 필드(인스턴스 변수, 스태틱 변수, 상수)
	// 인스턴스변수
	int instanceVar;
	// 스테틱변수
	static int staticVar;
	
	// 메소드(인스턴스 메소드, 스태틱 메소드)
	// 인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스 메소드1 호출되었습니다.");
		instanceVar = 10;
		System.out.println("인스턴스 메소드1에서 인스턴스 변수 값 : " + instanceVar);
		staticVar = 10;
		System.out.println("인스턴스 메소드1에서 스태틱 변수 값 : " + staticVar);
		instanceMethod2();
		staticMethod1();
	}
	
	// 인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2가 호출되었습니다.");
	}
	
	// 스테틱 메소드1
	static void staticMethod1() {
		System.out.println("스테틱 메소드1이 호출되었습니다.");
//		instanceMethod2();  // 스태틱 메소드에서 인스턴스 메소드 호출 불가
//		instanceVar = 100;  // 스태틱 메소드에서 인스턴스 변수 접근 불가
		staticVar = 200;
		System.out.println("스테텍 메소드1에서 스태틱 변수 값 : " + staticVar);
		staticMethod2();
	}
	
	// 스테틱 메소드2
	static void staticMethod2() {
		System.out.println("스테틱 메소드2가 호출되었습니다.");
	}
}
