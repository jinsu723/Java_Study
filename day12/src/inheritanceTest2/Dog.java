package inheritanceTest2;

// 8번 :

public class Dog extends Animal{
	// 강아지의 고유 메소드
	void bark() {
		System.out.println(this.name + "이가 멍멍 짖습니다.");
	}
}
