package task2;

public class Animal {
//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
	
	// 필드 생성 이름 나이 종류
	// 생성자 만들기
	// 메소드 생성
	
	String name;
	int age;
	String type;
	
	Animal(String name, int age, String type){
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	void eat() {
		System.out.println(this.name + "이(가) 밥을 먹습니다.");
	}
	
	void play() {
		System.out.println(this.name + "이(가) 놀고있습니다.");
	}
	
	void sleep() {
		System.out.println(this.name + "이(가) 잠을 잡니다.");
	}
	
	void congratulate() {
		System.out.println(this.name + "의 생일!");
		this.age++;
		System.out.println("이제 " + this.age + "살 입니다.");
	}
}
