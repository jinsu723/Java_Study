package constructorThis2;

// 12번 :

public class Person {
	// 필드
	String name;
	int age;

	// 생성자
	// 기본생성자
	public Person() {
	}
	
	// 이름만 매개변수로 받는 생성자
	public Person(String name) {
		this(name, 10);
		System.out.println("이름의 매개변수를 받는 생성자가 호출되었습니다.");
	}
	
	// 모든 필드의 매개변수를 받는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	// 메소드
	// printInfo() 정보 출력
	void printInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
		// this를 사용하여 현제 객체의 다른 메소드 호출
		this.greet();
	}

	// greet() 이름 님 안녕하세요
	void greet() {
		System.out.println(this.name + "님 안녕하세요.");
	}
}
