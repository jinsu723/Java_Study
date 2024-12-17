package classInterface;

// 13번 : 상속과 구현은 별개이다

class Parent1{
	void ParentMethod() {
		System.out.println("부모 클래스의 메소드");
	}
}

interface InterfaceA1{
	void methodA();
}

interface InterfaceB1{
	void methodB();
}

class Child1 extends Parent1 implements InterfaceA1, InterfaceB1{

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}
	
}
public class ExtendsImpl {

}
