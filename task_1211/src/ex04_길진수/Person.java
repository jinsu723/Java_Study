package ex04_길진수;

public class Person {
	
	// 필드 선언
	// 생성자 만들기 매개변수 1개
	// 메소드 선언 리턴값 String
	
	private String name;  // private 필드 선언
	
	Person(String name){  // 문자열 이름을 매개변수로 받는 생성자 선언
		this.name = name;  // 이름 초기화
	}
	
	// 이름을 열람할 수 있는 매소드 다른 클래스에선 이 메소드를 통해서만 이름을 알 수 있다
	String getName() {
		return this.name;  // 해당 객체의 이름 반환
	}
}
