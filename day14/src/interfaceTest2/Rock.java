package interfaceTest2;

// 8번 : review 패키지 예제 -> interface로 구현

public class Rock implements Music{

	@Override
	public void mode() {
		System.out.println("락 모드");
	}

	void onlyRock() {
		System.out.println("onlyRock");
	}
}
