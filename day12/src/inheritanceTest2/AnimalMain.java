package inheritanceTest2;

// 8번 :

public class AnimalMain {
	public static void main(String[] args) {
		// 동물 클래스의 객체 생성
		Animal ani = new Animal();
		// Animal 클래스에 있는 필드와 메소드만 사용 가능
		ani.name = "사자야";
		System.out.println(ani.name);
		
		// 새 클래스 객체 생성
		// Bird 클래스는 Animal을 상속받고 있으므로 Animal 클래스에 있는 필드와 메소드 사용가능
		// Bird 클래스에 있는 멤버도 사용 가능
		Bird bird = new Bird();
		bird.name = "짹짹이";
		bird.age = 2;
		bird.type = "참새";
		System.out.println(bird.name);
		bird.eat("새우깡");
		
		// 강아지 클래스 객체 생성
		Dog dog = new Dog();
		dog.name = "멍멍이";
		dog.age = 3;
		dog.type = "강아지";
		
		System.out.println(dog);
		dog.birthday();
		
		// 고양이 클래스 객체 생성
		Cat cat = new Cat();
		System.out.println(cat);
		cat.name = "아토";
		cat.age = 11;
		cat.type = "고양이";
		
		cat.meow();
	}
}
