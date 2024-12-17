package interfaceTest3;

public class CalcuMain {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();  // 인터페이스는 객체화 할 수 없다
		CalculImpl cal = new CalculImpl();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(-10, 20));
		Utility.printMsg("안녕");
	}
}
