package constructorThis2;

// 12번 :

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동", 20);
		Person p3 = new Person("신짱구");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
	}
}
