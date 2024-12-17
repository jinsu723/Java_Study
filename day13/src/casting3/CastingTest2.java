package casting3;

// 7번 : 캐스팅의 특징

public class CastingTest2 {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.crying();
		
//		Animal animal2 = new Dog("진돌이");  // 업캐스팅
//		Animal animal3 = new Cat("아토");
		
//		CastingTest2 ct = new CastingTest2();
		
		// 1. 같은 메소드가 부모에도 있고 자식에도 있는 경우(오버라이딩)
		// 업캐스팅을 하여도 오버라이딩 된 메소드가 실행된다
//		animal2.crying();
		
		// 2. 메소드가 부모에는 없고 자식에서 추가된 경우
		// (부모에 존재하지 않는 멤보에 접근하려는 경우)
//		animal2.walk();
		// 자식 클래스에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 없다
		// 이 경우에는 다운 케스팅을 해야한다
//		((Dog)animal2).walk();
		
//		printText(animal2);
//		ct.printText2(animal3);
		
		// 생성자 추가 후
		Animal animal = new Animal("동물");
		Dog dog = new Dog("진돌이");
		Cat cat = new Cat("아토");
		
		printText(dog);
		printText(cat);
		
		tryWalk(dog);
		tryWalk(cat);
		
		printText(new Dog("멍뭉이"));
		
	}
	
//	static void printText(Dog dog) {
//		System.out.println(dog.name + "이가 운다");
//		dog.crying();
//	}
	
	// 1. 메소드의 매개변수로 여러 타입의 값을 받는 경우
	// 일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야 한다
	// 매개변수에 업캐스팅을 하게 되면 1개의 타입으로 자식 클래스의 값들을 담아줄 수 있다
//	static void printText(Dog dog) {
//		System.out.println(dog.name + "이가 운다");
//		dog.crying();
//	}
	
	// 2. 같은 부모 클래스가 존재한다면 매개변수를 부모 타입으로 받는다(업캐스팅)
	// 하나의 메소드에서 매개변수를 부모타입으로 만들면 여러 자식타입을 받아서 사용이 가능하다(다형성)
	static void printText(Animal ani) {
		System.out.println(ani.name + "가 운다");
		ani.crying();  // 업캐스팅된 객체가 들어와도 오버라이딩 된 메소드가 호출된다
	}
	
	void printText2(Animal ani) {
		System.out.println(ani.name + "가 운다");
		ani.crying();
	}
	
	// 3. 만약 부모 클래스에 존재하지 않는 멤버에 접근하기 위해서는?
	// down casting을 해줘야 한다
	static void tryWalk(Animal animal) {
		// 매개변수로 받아오 객체의 주소가 Cat타입인지, Dog 타입인지를 확인한다
		if(animal instanceof Dog) {
//			 Dog타입이 맞다면 Dog로 Down casting한다
			((Dog)animal).walk();
		} else {
			System.out.println("산책안가ㅡㅡ");
		}
	}
}
