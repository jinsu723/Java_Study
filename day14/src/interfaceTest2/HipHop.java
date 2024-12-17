package interfaceTest2;

//8번 : review 패키지 예제 -> interface로 구현

public class HipHop implements Music{

	@Override
	public void mode() {
		System.out.println("힙합 모드");
	}

	void onlyHipHop() {
		System.out.println("onlyHipHop");
	}
}
