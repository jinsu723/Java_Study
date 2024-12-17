package constructorBasic1;

// 6번 : 생성자

public class Tv {
	// 필드
	boolean power; // 기본값 false
	int ch;
	int vol;
	String color;
	String brand;

	// 기본 생성자 => 개발자가 만들지 않으면 컴파일러가 자동으로 생성한다
	public Tv() {

	}
	
	// 매개변수 2개 있는 생성자
	public Tv(boolean power, int ch) {
		this.power = power;
		this.ch = ch;
	}

	// 메소드
	// 전원 키고 끌 수 있는 메소드
	// 전원이 꺼져있다면 키고
	// 꺼져있다면 끄기

	void powerOnOff() {
		power = !power;
		System.out.println("현제 전원 상태 : " + (power ? "켜짐" : "꺼짐"));
	}

	// 매개변수가 5개 있는 생성자
	public Tv(boolean power, int ch, int vol, String color, String brand) {
		this.power = power;
		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.brand = brand;
	}

	// 볼륨을 올리고 내릴 수 있는 메소드
	// 전원이 올라가 있는지 확인
	// 내려가있으면 안되고 올라가 있으면
	// 1씩 증가시키고 감소시키기

	void increaseVolune() {
		if (power) {
			if (vol <= 99) {
				vol++;
			}
			System.out.println("현재 볼륨 : " + vol);
		}
	}

	void decreaseVolume() {
		if (power) {
			if (vol >= 0) {
				vol--;
			}
			System.out.println("현재 볼륨 : " + vol);
		}
	}

	// 채널 올리고 내릴 수 있는 메소드
	// 전원 올라가 있는지 확인
	// 올라가 있다면
	// 1씩 증가시키고 감소시키기

	void nextChannel() {
		if (power) {
			ch++;
		}
	}

	void previousChannel() {
		if (power) {
			ch--;
		}
	}
}