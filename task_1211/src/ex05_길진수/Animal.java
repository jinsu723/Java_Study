package ex05_길진수;

public abstract class Animal {
	
	// 필드 선언
	// 생성자 이름 초기화
	// 일반 메소드 이름 반환
	// 추상 메소드 행동 출력
	
	protected String name;  // protected로 필드 선언
	// 같은 클래스, 같은 패키지, 다른 페키지의 상속관계만 호출 가능
	
	public Animal(String name) {  // 동믈의 이름을 매개변수로 하는 생성자 선언
		super();  // Object 생성자
		this.name = name;  // 이름을 받아 필드 초기화
	}
	
	String getName() {  // 이름을 반환해주는 메소드 선언
		return this.name;  // 이름 반환
	}
	
	abstract void performAction();  // 동물의 행동을 출력하는 추상 메소드 선언
}
