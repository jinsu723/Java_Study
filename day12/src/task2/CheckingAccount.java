package task2;

public class CheckingAccount extends Account{

//	CheckingAccount 클래스
//	메소드
//	   withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
	
	@Override
	void withdraw(double amount) {
		if(this.balance < (amount + 1000)) {
			System.out.println("잔액부족");
		} else {
			System.out.println("수수료는 1000원입니다.");
			this.balance -= 1000;
			super.withdraw(amount);
		}
	}

}
