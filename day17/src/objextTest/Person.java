package objextTest;

// 3번 : Object 클래스 - equals()

public class Person {
	// 필드
	String name;
	int age;

	// 매개변수 있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
//		// 객체 자기자신과 같은 경우
//		if(this == obj) {
//			String other = ((Person)obj).name;
//			return name.equals(other);
//		}
//		// 이름이 같은 경우
//		if(obj instanceof Person) {
//			String other = ((Person)obj).name;
//			if(this.name.length() == other.length()) {
//				for(int i=0; i<this.name.length(); i++) {
//					if(this.name.charAt(i) != other.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
//		return false;

		// 이름과 나이가 같으면 같은 객체로 판단
		// 객체간의 타입 비교
		// 맞다면 == 연산자를 통해 두 나이가 같은지 비교
		// 다운캐스팅 진행 이름을 불러오기 위해
		if (obj instanceof Person) {
			int otherAge = ((Person) obj).age;
			String otherName = ((Person) obj).name;
			return this.age == otherAge && this.name.equals(otherName);
		}
		return false;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "Person [name : " + name + ", age : " + age + "]";
	}

	// equlas를 재정의하면 hashCode도 재정의, 동일객체에 대해 같은 hashCode값이 반환되도록
	// return name.hashCode() + Integer.hashCode(age); 형태로 작성가능(참고)

	@Override
	public int hashCode() {
		return this.age;
	}

}
