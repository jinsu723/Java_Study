package task02;

public class MainException extends NumberFormatException{

	public MainException(String msg) {  // 생성자 선언
		super(msg);  // 부모 클래스로 필드 초기화
	}

}
