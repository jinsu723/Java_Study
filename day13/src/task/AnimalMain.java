package task;

// 9번 :

public class AnimalMain {
	public static void main(String[] args) {
	//   Animal 클래스
	//   부모클래스
	//   필드: 없음
	//   메소드: cry() (소리를 출력)
	//   
	//   Cat 클래스
	//   부모클래스를 상속받는 자식클래스
	//   필드: 없음
	//   메소드: cry() 오버라이딩 (고양이 소리를 출력)
//	      play() 스크래치 놀이를 합니다 출력
//	      
	//   Dog 클래스
	//   부모클래스를 상속받는 자식클래스
	//   필드: 없음
	//   메소드: cry() 오버라이딩 (개 소리를 출력)
//	      walk() 산책을 갑니다 출력
	//   
	//   Mouse 클래스
	//   부모클래스를 상속받는 자식클래스
	//   필드: 없음
	//   메소드: cry() 오버라이딩 (쥐 소리를 출력)
//	      sleep() 고양이를 피해 잠을 잡니다 출력
//	      
	//   AnimalMain 클래스
	//   Animal 클래스의 객체 생성
	//   각 클래스의 객체 생성
	//   메소드 : main메소드
	//   printCrying(Animal animal)메소드   
//	      (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
	//   
	//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)

		AnimalMain aniM = new AnimalMain();  // 객체 생성
		Animal ani = new Animal();  // 객체 생성
		Animal cat = new Cat();  // 업캐스팅
		Animal dog = new Dog();  // 업캐스팅
		Animal mouse = new Mouse(); // 업캐스팅
		
		ani.cry();
		aniM.printCrying(cat);
		aniM.printCrying(dog);
		aniM.printCrying(mouse);
		
		
		// 배열에 담아 출력하면 출력문이 짧아진다
		Animal[] aniArr = {new Cat(), new Dog(), new Mouse()};
		
		// 공통 메소드 호출 다운 캐스팅으로 고유 메소드 호출
		for(Animal animal : aniArr) {
			aniM.printCrying(animal);
		}
	}
	
	void printCrying(Animal animal){
		if(animal instanceof Cat) {
			animal.cry();
			((Cat)animal).play();  // 다운캐스팅
		} else if (animal instanceof Dog) {
			animal.cry();
			((Dog)animal).walk();  // 다운캐스팅
		} else {
			animal.cry();
			((Mouse)animal).sleep();  // 다운케스팅
		}
	}
	void printCrying_t(Animal animal){  // 공통메소드를 위쪽으로 뻈음
		animal.cry();					// 어차피 무조건 실행된다
		
		if(animal instanceof Cat) {
			((Cat)animal).play();  // 다운캐스팅
		} else if (animal instanceof Dog) {
			((Dog)animal).walk();  // 다운캐스팅
		} else {
			((Mouse)animal).sleep();  // 다운케스팅
		}
	}
}