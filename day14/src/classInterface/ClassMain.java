package classInterface;

//9번 : 클래스 단일상속

class Parent {
	void dispaly() {
		System.out.println("부모클래스");
	}
}

class Parent2{
	void display0() {
		System.out.println("부모클래스2");
	}
}

class Child extends Parent{
	void display2() {
		System.out.println("자식클래스");
	}
}

public class ClassMain{
	public static void main(String[] args) {
		
	}
}