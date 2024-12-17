package classInterface;

// 10번 : 인터페이스 다중 구현

interface InterfaceA {
	void methodA();

	void method();
}

interface InterfaceB {
	void methodB();

	void method();
}

class ClassC implements InterfaceA, InterfaceB {

	@Override
	public void methodA() {
		System.out.println("InterfaceA의 메소드 구현");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB의 메소드 구현");
	}

	@Override
	public void method() {
		System.out.println("method 구현");
	}

}

public class InterfaceMain {
	public static void main(String[] args) {

	}
}
