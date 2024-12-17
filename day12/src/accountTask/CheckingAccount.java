package accountTask;

public class CheckingAccount extends Account{  // Account 클래스를 상속받는 클래스 선언
//	CheckingAccount 클래스
//	메소드
//	   withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
	
	void withdraw(double amount) {  // 메인 클래스의 출금 메소드 오버라이딩
		balance -= 1000;  // 정적변수에서 1000원을 빼서 저장한다
		System.out.println((int)amount + "원을 출금합니다. 수수료는 1000원 입니다.");
		// 받은 인수를 정수형으로 출력하고 수수료 안내
	}
}