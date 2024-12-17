package classBasic2;

 // 4번 : 클래스의 특징2(연관성있는 데이터와 기능을 한 곳에 통합)

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.width = 10;
		rect1.height = 20;
		
		System.out.println("rect1의 넓이 : " + rect1.getArea());
		System.out.println("rect1의 둘레 : " + rect1.getPerimeter());
	}
}
