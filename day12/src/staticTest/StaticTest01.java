package staticTest;

// 2번 : 정적 메소드와 인스턴스 메소드

public class StaticTest01 {
	public static void main(String[] args) {
//		// 정적 메소드를 호출할 때는 클래스명.메소드명으로 호출
//		StaticTest01.staticMethod();
//		
//		// 같은 클래스에 있는 static 메소드는 메소드명 만으로도 호출 가능
//		staticMethod();
//		
//		// 인스턴스 메소드를 호출하기 위해 객체 생성
		StaticTest01 st = new StaticTest01();
//		// 정적 메소드를 호출하지만 권장하지 않음
//		st.staticMethod();
//		
//		// 인스턴스 메소드 호출
//		st.instanceMethod1();
//		st.instanceMethod2();
		
		st.instanceMethod1();
	}
	
	// 인스턴스 메소드1
	void instanceMethod1() {
		System.out.println("인스턴스 메소드1 실행");
		instanceMethod2();
		staticMethod();
	}
	
	// 인스턴스 메소드2
	void instanceMethod2() {
		System.out.println("인스턴스 메소드2 실행");
	}
	
	// 정적 메소드
	static void staticMethod() {
		System.out.println("정적 메소드 실행");
//		instanceMethod1();  // 인스턴스 메소드 호출 불가
	}
}
