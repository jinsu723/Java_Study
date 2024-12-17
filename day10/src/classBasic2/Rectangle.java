package classBasic2;

// 4번 : 클래스의 특징2(연관성있는 데이터와 기능을 한 곳에 통합)

public class Rectangle {
	// 직사각형 정보와 관련된 기능
	
	// 필드
	int width;  // 너비
	int height;  // 높이
	
	// 메소드
	// 넓이를 계산하는 메소드
	int getArea() {
		return width * height;
	}
	
	// 둘레를 계산하는 메소드
	int getPerimeter() {
		return (width + height) * 2;
	}
}
