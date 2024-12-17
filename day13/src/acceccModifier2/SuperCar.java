package acceccModifier2;

// 2번 :

public class SuperCar extends Car{

	@Override
	void speedUp() {
		setSpeed(getSpeed() + 20);  // private 필드 접근은 getter와 setter를 통해 처리
		System.out.println("슈퍼카가 가속합니다 " + getSpeed());
	}
	
}
