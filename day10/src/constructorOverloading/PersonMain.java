package constructorOverloading;

// 10번 : 생성자 오버로딩

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person("유리");
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3 = new Person();
		
		Person p4 = new Person("이름", 10, "학생");
		System.out.println(p4.name + "의 나이는 " + p4.age + "살이고, " + p4.job + "입니다.");
	}
}
