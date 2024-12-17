package task2;

public class AnimalMain {
	public static void main(String[] args) {
		// 객체 생성
		Animal dog = new Animal("진돌", 5, "강아지");
		Animal cat = new Animal("아토", 10, "고양이");
		Animal bird = new Animal("구름", 2, "새");
		
		dog.eat();
		cat.eat();
		bird.eat();
		
		dog.play();
		cat.play();
		bird.play();
		
		dog.sleep();
		cat.sleep();
		bird.sleep();
		
		dog.congratulate();
		cat.congratulate();
		bird.congratulate();
	}
}
