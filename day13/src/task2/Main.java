package task2;

public class Main {
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
//		      play() 스크래치 놀이를 합니다 출력
//		      
		//   Dog 클래스
		//   부모클래스를 상속받는 자식클래스
		//   필드: 없음
		//   메소드: cry() 오버라이딩 (개 소리를 출력)
//		      walk() 산책을 갑니다 출력
		//   
		//   Mouse 클래스
		//   부모클래스를 상속받는 자식클래스
		//   필드: 없음
		//   메소드: cry() 오버라이딩 (쥐 소리를 출력)
//		      sleep() 고양이를 피해 잠을 잡니다 출력
//		      
		//   AnimalMain 클래스
		//   Animal 클래스의 객체 생성
		//   각 클래스의 객체 생성
		//   메소드 : main메소드
		//   printCrying(Animal animal)메소드   
//		      (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
		//   
		//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)
		
		Main m = new Main();
		Animal[] arr = {new Cat(), new Dog(), new Mouse()};
		
		for(Animal ar : arr) {
			m.printCrying(ar);
		}
	}
	
	void printCrying(Animal animal) {
		animal.cry();
		if(animal instanceof Cat){
			((Cat) animal).play();
		} else if(animal instanceof Dog) {
			((Dog)animal).walk();
		} else {
			((Mouse)animal).sleep();
		}
	}
}
