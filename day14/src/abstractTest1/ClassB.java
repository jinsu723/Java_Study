package abstractTest1;

// 2번 : 추상 클래스

public abstract class ClassB {
	// 추상 메소드
	abstract void method1();
	
	// 일반 메소드
	void method2() {
		System.out.println("추상 클래스의 method2() 호출");
	}
}
