package review;

public class Rock extends Music {
	// 락 클래스
	// "락 모드" 출력하는 mode메소드 만들기
	// "onlyRock 실행" 출력하는 onlyRock메소드 만들기
	
	@Override
	void mode() {
		System.out.println("락 모드");
	}
	
	void onlyRock() {
		System.out.println("onlyRock");
	}
}
