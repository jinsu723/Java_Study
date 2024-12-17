package review1;

public class Manager extends Employee{
	
	public Manager(String name, int salary) {
		super(name, salary);  // 부모의 생성자(Employee 클래스)
	}

	
	// 메소드
	@Override
	double calculateBonus() {
		// TODO Auto-generated method stub
		return salary * 0.2;
	}
	

}
