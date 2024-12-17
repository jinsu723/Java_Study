package review;

public class Ballad extends Music{
	// 발라드 클래스
	// "발라드 모드" 출력하는 mode메소드 만들기
	// "onlyBallad 실행" 출력하는 onlyBallad메소드 만들기
	
	@Override
	void mode() {
		System.out.println("발라드 모드");
	}
	
	void onlyBallad() {
		System.out.println("onlyBallad");
	}
}
