package review;

public class CastingTask {
	public static void main(String[] args) {
		// 음악재생 프로그램
		// 부모는 Music클래스
		// 구현하지 않은 mode메소드 만들기

		// 자식은 Ballad, HipHop, Rock 클래스

		// 발라드 클래스
		// "발라드 모드" 출력하는 mode메소드 만들기
		// "onlyBallad 실행" 출력하는 onlyBallad메소드 만들기

		// 힙합 클래스
		// "힙합 모드" 출력하는 mode메소드 만들기
		// "onlyHipHop 실행" 출력하는 onlyHipHop메소드 만들기

		// 락 클래스
		// "락 모드" 출력하는 mode메소드 만들기
		// "onlyRock 실행" 출력하는 onlyRock메소드 만들기

		// CastingTask에서 참조변수를 따로 만들지 않고
		// 매개변수의 다형성을 활용하여 모든 클래스타입의 메소드를 호출하기
		
		Music[] arr = {new Ballad(), new HipHop(), new Rock()};
		
		for(Music ar : arr) {
			mode(ar);
		}
		
		arr = null;  // 다 쓴 뒤 참조 제거
		System.gc();
		// 권장하진 않음(개발자가 가비지 컬렉션을 명시적으로 요철할 수 있으나 JVM이 반드시 즉시 실행하지는 않음
	}
	
	static void mode(Music m) {
		m.mode();
		
		if(m instanceof Ballad) {
			((Ballad)m).onlyBallad();
		} else if(m instanceof HipHop) {
			((HipHop)m).onlyHipHop();
		} else {
			((Rock)m).onlyRock();
		}
	}
}
