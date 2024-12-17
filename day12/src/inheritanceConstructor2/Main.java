package inheritanceConstructor2;

// 10번 :

public class Main {
	public static void main(String[] agrs) {
		Car car1 = new Car();
		Car car2 = new Car("KIA", "black", 10000);
		
		System.out.println(car1);
		System.out.println(car2);
		
		car1.brand = "HYUNDAI";
		car1.color = "red";
		
		System.out.println(car1.brand);  // null -> HYUNDAI
		System.out.println(car2.brand);  // KIA
		
		SuperCar sc1 = new SuperCar();
		SuperCar sc2 = new SuperCar("BMW", "blue", 150000, true);
		
		System.out.println(sc1);
		System.out.println(sc2);
		
		System.out.println(sc1.brand);  // null
		System.out.println(sc2.brand);  // BMW
	}
}
