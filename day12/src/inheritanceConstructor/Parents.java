package inheritanceConstructor;

// 9번 : 상속관계-생성자 확인
//자식클래스(서브클래스)

public class Parents {
	// 필드
	int number;

	
	// 생성자
	public Parents() {
		super();
		System.out.println("Parents 생성자 호출");
	}
	
	// 매소드
	void printStr(String str) {
		System.out.println(str);
	}
	

}
