package abstractTest2;

//5번 : 추상클래스와 강제성

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		System.out.println(animal1);
		System.out.println(animal2);
		
		animal1.crying();
		animal2.crying();
	}
}
