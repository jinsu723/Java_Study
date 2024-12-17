package task;

public class Main {
	public static void main(String[] args) {
		// 반환받는 것이 값이기 때문에 출력 메소드를 통해 결과 출력
		// calculator 메소드 안에 인터페이스의 메소드가 구현되어 있기 때문에 동시 호출 가능
		System.out.println(calculator(true).getInt(3, 6));
		System.out.println(calculator(false).getInt(4, 9));
	}
	
	// 논리형 매개변수를 받아 인터페이스의 메소드를 구현하여 출력하는 메소드
	static MultipleInter calculator(boolean isTrue) {  // true면 값을 곱해주고 false면 0을 반환
		if(isTrue) {  // true가 들어온다면
			MultipleInter mi1 = (num1, num2) -> num1 * num2;  // 람다식로 메소드 구현 두 수를 곱해 반환
			return mi1;  // 반환받은 값을 메인 메소드로 반환한다
		} else {  // flase가 들어왔다면
			MultipleInter mi1 = (num1, num2) -> 0;  // 람다식으로 메소드 구현 0 반환
			return mi1;  // 반환받은 값을 메인 메소드로 반환한다
		}
	}
}
