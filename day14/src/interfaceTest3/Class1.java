package interfaceTest3;

// 인터페이스의 디폴트 메소드와 클래스의 메소드가 동일한 경우

public class Class1 implements Inter1{

	@Override
	public void printText() {
		System.out.println("Class1의 printText");
	}

}
