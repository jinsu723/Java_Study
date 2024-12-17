package lambda;

// 람다식

public class lambdaTest2 {
	void printHello() {
		System.out.println("안녕하세요");
	}
	
	//	void printHello() { System.out.println("안녕하세요"); }
	// 1. 이름을 없애고 -> 추가한다
	// void() -> { System.out.println("안녕하세요"); }
	// 2. 반환타입 추가론 가능하므로 생략한다
	// () -> { System.out.println("안녕하세요"); }
	// 3. 명령문이 1줄이면 중괄호와 ;을 생략 가능하다(선택)
	// () -> System.out.println("안녕하세요")
	
	// 매개변수 o, 리턴값 o
	int addTen(int num) {
		return num + 10;
	}
	
	// int addTen(int num) { return num + 10; }
	// 1. 이름을 없애고 -> 추가한다
	//  int (int num) -> { return num + 10; }
	// 2. 반환 타입은 추론이 가능하므로 생략
	//  (int num) -> { return num + 10; }
	// 3. 매개변수 타입은 추론이 가능하므로 생략 가능(선택)
	//  매개변수 타입을 생략한다면, 매개변수가 1개라면 () 생략 가능하다(선택)
	//  num -> { return num + 10; }
	// 4. 명령문이 한 줄이면 {}와 ;생략 가능(선택)
	// 	{}와 ;을 생략했다면 return 생략해야한다
	// 	바디의 결과가 값이라면 자동으로 return된다. 단, 바디에 명령문에 1개이어야만 한다
	// num -> num + 10
	
	// 매개변수 2개, 리턴 o, 바디에 명령문 2개
	int addNumber(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2);
		return num1 + num2;
	}
	
//	int addNumber(int num1, int num2) { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2); return num1 + num2; }
	// 1. 이름 없애고 -> 추가
	// int (int num1, int num2) -> { System.out.prinltn("num1의 값 : " + num1 + ", num2의 값 : " + num2); return num1 + num2; }
	
	// 2. 리턴타입 추론 가능하므로 생략 가능하다(선택)
	// (int num1, int num2) -> { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2); retunr num1 + num2; }
	
	// 3. 매개변수 타입은 추론 가능하므로 생략 가능하다(선택)
	// (num1, num2) -> { System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2) return num1 + num2; }
	
	// 4. 명령문이 2개 이상이므로 {}와 ; 생략 불가
	// 반환할값이 존재한다면 return 사용한다
	// (num1, num2) -> {System.out.println("num1의 값 : " + num1 + ", num2의 값 : " + num2); return num1 + num2; }
}
