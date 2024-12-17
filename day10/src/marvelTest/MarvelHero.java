package marvelTest;

// 11번 :

public class MarvelHero {
	// 마블에 나오는 히어로를 객체로 만들어 출력하기
	// 필드
	String name;
	String superpower;
	int age;
	// 이름, 슈퍼파워(String superpower), 나이
	
	// 생성자
	// 모든 필드를 매개변수로 받는 생성자
	MarvelHero(String name, String superpower, int age) {
		this.name = name;
		this.superpower = superpower;
		this.age = age;
		System.out.println(this);
	}
	
	// 정보출력 매소드(printInfo)
	// 모든 필드 내용 출력
	void printInfo(){
		System.out.println(this.name + "의 나이는 " + this.age + "이고, 슈퍼파워는 " + this.superpower + "입니다.");
	}
	
	void performAction() {
		System.out.println(this.name + "의 " + this.superpower + "!!");
	}

}
