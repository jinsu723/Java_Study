package methodOverride;

// 11번 :

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}

	// 메소드 오버라이딩 : 부모 클래스의 메소드를 자식클래스에서 재정의
	@Override
	void sound() {
		System.out.println(this.name + "가 멍멍 짖습니다.");
	}
	
}
