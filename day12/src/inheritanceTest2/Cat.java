package inheritanceTest2;

// 8번 :

public class Cat extends Animal{
	// 고양이의 고유 메소드
	void meow() {
		System.out.println(this.name + "가 야용하고 웁니다.");
	}
}
