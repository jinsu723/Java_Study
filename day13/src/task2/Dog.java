package task2;

public class Dog extends Animal{

	//   Dog 클래스
	//   부모클래스를 상속받는 자식클래스
	//   필드: 없음
	//   메소드: cry() 오버라이딩 (개 소리를 출력)
//	      walk() 산책을 갑니다 출력
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
	
	void walk() {
		System.out.println("산책을 갑니다");
	}
	
}
