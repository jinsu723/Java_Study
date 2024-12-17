package method;

// 9번 : CallByValue

public class CallByValue {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		modifyNum(num);
		System.out.println(num);
	}
	
	static void modifyNum(int num) {
		num = 20;
	}
	// 값 자체가 복사되므로 메소드 내부에서 변경된 값이 원본에 영향을 끼지지 않는다
}
