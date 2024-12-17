package acceccModifier2;

// 2번 : 

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		
//		car.speed = 100;
		car.setSpeed(100);
		System.out.println(car.getSpeed());
		
		SuperCar superCar = new SuperCar();
		superCar.speedUp();  // 자식 클래스의 객체는 오버라이딩 된 메소드 호출
		superCar.stop();
	}
}
