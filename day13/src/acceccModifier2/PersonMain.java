package acceccModifier2;

import accessModifier.Person;

// 1번 : private 접근제한자

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
//		p.name = "유리";
		p.setName("유리");
		System.out.println(p.getName());
	}
}
