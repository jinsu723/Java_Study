package casting4;

// 8번 : 캐스팅 예제

public class Main {
	public static void main(String[] args) {
		
		// 업캐스팅
		Hero ironMan = new IronMan("아이언맨");
		Hero hulk = new Hulk("헐크");

		System.out.println(ironMan);
		System.out.println(hulk);
		
		// 다운캐스팅
		IronMan iroMan2 = (IronMan)ironMan;
	}
}
