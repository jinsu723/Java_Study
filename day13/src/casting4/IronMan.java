package casting4;

// 8번 : 캐스팅 예제

public class IronMan extends Hero{
	// 생성자
	public IronMan(String name) {
		super(name);
	}

	@Override
	void superPower() {
		System.out.println(this.getName() + "이(가) 슈트를 입고 날아갑니다");
	}
	
}
