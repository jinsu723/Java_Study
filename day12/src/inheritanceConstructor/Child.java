package inheritanceConstructor;

// 9번 : 상속관계-생성자 확인
// 자식클래스(서브클래스)

public class Child extends Parents{
	// 필드
	int num;
	
	// 생성자
	public Child() {
		System.out.println("child 생성자 호출");
	}
	
	// 메소드
	void printInt(int num) {
		System.out.println(num);
	}
}
