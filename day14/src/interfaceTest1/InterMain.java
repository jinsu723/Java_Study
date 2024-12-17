package interfaceTest1;

//7번 : 인터페이스 객치화 불가능, 구현한 클래스 객체화 가능

public class InterMain {
	public static void main(String[] args) {
		// 인터페이스 객체화 불가능 => 추상 메소드를 구현하는 클래스로 객체화
//		Inter i = new Inter();
		
		ClassA a = new ClassA();
		System.out.println(a);
		a.method2();
		System.out.println(a.VAR2);
		
		Inter i1 = new ClassA();
		i1.method1();
	}
}
