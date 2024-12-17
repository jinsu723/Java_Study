package employeeTask;

public class Manager extends Employee{  // Employee 클래스를 상속받음

	@Override
	double calculateBonus() {  // 보너스 계산 메소드 => 오버라이딩
		return salary * 0.2;  // 봉급 * 0.2를 return
	}
	
	Manager(String name) {  // 이름 문자열을 받는 생성자 선언
		super(name, 500);  // 이름만 달라지고 Manage의 봉급은 모두같다
	}
	

}
