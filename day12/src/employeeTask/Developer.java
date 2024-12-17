package employeeTask;

public class Developer extends Employee{  // Employee를 상속받는 클래스

	@Override
	double calculateBonus() {  // 보너스 계산기 => 오버라이딩
		return salary * 0.15;  // 봉급 * 0.15를 return
	}

	public Developer(String name) {  // 이름 문자열을 매개변수로 받는 생성자 선언
		super(name, 600);  // 이름만 다르고 Developer의 봉급은 모두 같다
	}
}
