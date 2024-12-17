package interfaceTest2;

//8번 : review 패키지 예제 -> interface로 구현

public class Ballad implements Music{

	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}
	
	void onlyBallad() {
		System.out.println("onlyBllad");
	}

}
