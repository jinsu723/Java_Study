package inheritanceConstructor2;

// 10번 :

public class SuperCar extends Car{
		// 필드
		boolean booster;
		
		// 메소드
		void boosterOn() {
			System.out.println("부스터 가동");
		}
		
		void boosterOff() {
			System.out.println("부스터 중지");
		}
		
		// 생성자
		public SuperCar() {
			super();
		}

		public SuperCar(String brand, String color, int price, boolean booster) {
			super(brand, color, price);
			this.booster = booster;
		}
}
