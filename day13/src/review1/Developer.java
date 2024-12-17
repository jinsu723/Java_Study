package review1;

public class Developer extends Employee {

   // 생성자
   public Developer(String name, int salary) {
      super(name, salary);
   }

   // 메소드 오버라이딩

   @Override
   double calculateBonus() {
      return salary * 0.15;
   }
}
