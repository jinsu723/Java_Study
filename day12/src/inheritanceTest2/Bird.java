package inheritanceTest2;

// 8번 :

public class Bird extends Animal{
	// 새 클래스의 고유 메소드
	void fly() {
		System.out.println(this.name + "가 하늘을 날고있습니다.");
	}
}
