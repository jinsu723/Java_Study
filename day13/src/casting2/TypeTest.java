package casting2;

// 6번 : 자식 객체의 타입 여러개인지 확인-매인클래스

public class TypeTest {
	public static void main(String[] args) {
		Parents p = new Parents();
		Child c = new Child();
		
		System.out.println(p);
		System.out.println(c);
		
		// 객체 instanceof 클래스명 => boolean 타입으로 나온다
		// instanceof : 객체가 특정 클래스나 해당 클래스의 자식 클래스인지 확인할 때 사용
		System.out.println(p instanceof Parents);  // true : p는 Parents의 객체
		System.out.println(p instanceof Child);  // false : p는 Child의 객체가 아님
		System.out.println(c instanceof Child);  // true : c는 Child의 객체
		System.out.println(c instanceof Parents);  // true : c는 Child이면서 Parents의 객체
		// 자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다!!
		
		Parents pp = new Child();
		Child cc = new Child();
	}
}
