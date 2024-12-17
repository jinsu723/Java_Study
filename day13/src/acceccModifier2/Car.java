package acceccModifier2;

// 2번 :

public class Car {
	// final : 최종을 의미하는 키워드
	// final 클래스 : 최종적인 클래스이므로 더 이상 상속 불가(자식 클래스 만들 수 없음)
	// final 메소드 : 오버라이딩 할 수 없는 메소드
	
	// 필드
	private int speed;
	
	// getter, setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	// 메소드
	void speedUp() {
		speed += 10;
		System.out.println("현재 시속 : " + this.speed);
	}


	final void stop() {
		System.out.println("브래이크를 밟아 차를 멈춥니다.");
		this.speed = 0;
	}
}
