package test01;

public class UserVO {
	// 필드
	private int userNo;
	private String id;
	private String password;
	private String name;
	private int age;

	// 생성자
	public UserVO(int userNo, String id, String password, String name, int age) {
		this.userNo = userNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	// Getter 메서드
	public int getUserNo() {
		return userNo;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "UserVO{" + "userNo=" + userNo + ", id='" + id + '\'' + ", password='" + password + '\'' + ", name='"
				+ name + '\'' + ", age=" + age + '}';
	}

	// equals 재정의 (userNo로 동일성 판단)
	@Override
	public boolean equals(Object obj) {
		System.out.println("함수 호출");
		if (this == obj) {  // 객체 본인이라면
			return true;  // true 반환
		}
		if (obj == null || getClass() != obj.getClass()) {  // 객체에 값이 없거나 같은 클래스가 아니라면
			return false;  // false 반환
		}
		UserVO userVO = (UserVO) obj;  // 다운캐스팅 강제형변환
		return userNo == userVO.userNo;  // 객체의 userNo가 같은지를 반환
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(userNo);
	}
}














