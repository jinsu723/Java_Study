package task2;

public class Mouse extends Animal{

	//   Mouse 클래스
	//   부모클래스를 상속받는 자식클래스
	//   필드: 없음
	//   메소드: cry() 오버라이딩 (쥐 소리를 출력)
//	      sleep() 고양이를 피해 잠을 잡니다 출력
	
	
	@Override
	void cry() {
		System.out.println("찍찍");
	}
	
	void sleep() {
		System.out.println("고양이를 피해 잠을 잡니다");
	}
}
