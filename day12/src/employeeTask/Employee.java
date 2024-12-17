package employeeTask;

public class Employee {  // 클래스 선언
	String name;  // 이름 필드 선언
	int salary;  // 봉급 필드 선언
	
	Employee(String name, int salary){  // 문자열과 정수형을 매개변수로 받는 생성자 선언
		this.name = name;  // 이름 초기화
		this.salary = salary;  // 봉급 초기화
	}
	
	Employee(String name){  // 문자열 형태로만 매개변수를 받는 생성자 선언
		this.name = name;  // 이름 초기화
		this.salary = 600;  // 봉급 초기화
	}
	
	double calculateBonus() {  // 보너스 계산 메소드
		return salary * 0.1;  // 봉급 * 0.1 을 return
	}
	
	
	public static void main(String[] arga) {  // 메인메소드
//		1) 직원 프로그램
//	Employee 클래스
//	필드 
//	   name, salary
//	메소드
//	   calculateBonus() : 기본적으로 salary * 0.1 반환
//
//	Manager와 Developer 클래스는 Employee 클래스 상속
//	Manager 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.2 반환
//	Developer 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.15 반환
//	메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
		
		System.out.println("*****직원 프로그램*****");
		
		// 메인 클래스에 필드 선언
		// 생성자 선언
		// 문자열과 정수형을 받는 생성자, 문자열만 받는 생성자
		// 메소드 선언
		// 리턴 타입 실수형
		// 메인클래스를 상속받는 각 클래스에 생성자 선언
		// 메인클래스를 상속받는 각 클래스에 메소드 선언 => 오버라이딩
		// 객체 생성
		// 결과 출력
		
		Employee p1 = new Employee("길진수");  // Employee 클래스에 있는 생성자로 객체 생성
		Employee p2 = new Employee("길길진수", 1000);  // Employee 클레스에 있는 생성자로 객체 생성
		Manager p3 = new Manager("진수길");  // Manage 클레스에 있는 생성자로 객체 생성
		Developer p4 = new Developer("수길진");  // Developer 클래스에 있는 생성자로 객체 생성
		
		System.out.println("길진수의 보너스 : " + p1.calculateBonus());  // 봉급 계산 메소드 호출
		System.out.println("길길진수의 보너스 : " + p2.calculateBonus());  // 봉급 계산 메소드 호출
		System.out.println("진수길의 보너스 : " + p3.calculateBonus());  // Manager 클래스에서 메소드 오버라이딩하여 봉급 계산 후 출력
		System.out.println("수길진의 보너스 : " + p4.calculateBonus());  // Developer 클래스에 메소드 오버라이딩하여 봉급 계산 후 출력

	}
}
