package task;

public class Cat extends Animal{

	//   Cat 클래스
	//   부모클래스를 상속받는 자식클래스
	//   필드: 없음
	//   메소드: cry() 오버라이딩 (고양이 소리를 출력)
//	      play() 스크래치 놀이를 합니다 출력
	
	@Override
	void cry() {
		System.out.println("야용하고 웁니다.");
	}
	
	void play() {
		System.out.println("스크래치 놀이를 합니다.");
	}
	
}
