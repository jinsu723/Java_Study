package methodOverride;

// 11번 :

public class Animal {
	// 필드
	String name;
	int age;
	
	// 메소드
	void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}

	// 생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
}
