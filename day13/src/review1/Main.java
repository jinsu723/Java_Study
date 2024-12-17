package review1;

public class Main {
	public static void main(String[] args) {
		
		// 사용되어야 하는 문법/개념 : 클래스, 상속, 메소드 오버라이딩
		
		Employee e = new Employee("짱구", 8000);
		Manager m = new Manager("철수", 6000);
		Developer d = new Developer("유리", 5500);
		
		Employee[] emp = {e, m, d};
		
		for(Employee em : emp) {
			System.out.println(em.name + "의 보너스는 " + em.calculateBonus());
		}
	}
}
