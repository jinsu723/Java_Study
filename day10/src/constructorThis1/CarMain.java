package constructorThis1;

//9번 : 가독성 향상

class Car {
   // 필드
   String model;
   int speed;

   // 생성자 : alt + shift + s + o
   public Car(String model) {
      this.model = model;
      System.out.println("생성자 : " + this);
   }

   public Car(int speed) {
      this.speed += speed;
   }

   // 메소드
   void printInfo() {
      System.out.println("모델 : " + this.model);
      System.out.println("속도 : " + this.speed);
   }
}

public class CarMain {
   public static void main(String[] args) {
      Car car1 = new Car("BMW");
      System.out.println("car1 : " + car1);

      Car car2 = new Car("기아");
      System.out.println(car1);
      System.out.println(car2);

      System.out.println(car1.speed);
      car1.speed = 50;
      System.out.println(car1.speed);
      car1.printInfo();
      car2.printInfo();
   }
}
