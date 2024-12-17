package interfaceTest3;

// 인터페이스의 디폴트 메소드와 클래스의 메소드가 동일한 경우

public class ClassInterMain extends Class1{
	
//	The inherited method Class1.printText()
//	cannot hide the public abstract method in Inter1
//	인터페이스의 메소드와 클래스 메소드 같의 충돌 문제 발생
//	인터페이스의 메소드가 abstract인 경우 클래스에서 숨기거나 무시할 수 없다
	
	// Class1과 Inter1 양쪽에 printText()메소드가 존재하지만
	// 오류가 발생하지 않는 이유는 구현하는 인터페이스보다 상속받는 부모 클래스의
	// 우선순위가 더 높기 때문이다
	public static void main(String[] args) {
		Inter1 c = new Class1();
		
		c.printText();
		((Class1)c).printText();
		
	}
}
