package casting3;

//7번 : 캐스팅의 특징

public class Dog extends Animal{
	
	public Dog(String name){
		super(name);
	}

	@Override
	void crying() {
		System.out.println("멍멍!");
	}
	
	// 메소드
	void walk() {
		System.out.println("산책가기*^^*");
	}
}
