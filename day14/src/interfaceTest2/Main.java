package interfaceTest2;

//8번 : review 패키지 예제 -> interface로 구현

public class Main {
//	Music 클래스를 인터페이스로 수정하고
//	각 메소드 호출하기
	public static void main(String[] args) {
		
		Music[] arr = {new Ballad(), new HipHop(), new Rock()};
		
		for(Music ar : arr) {
			mode(ar);
		}
		
		arr = null;
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
