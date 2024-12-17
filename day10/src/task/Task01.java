package task;

import java.util.Random;
import java.util.Scanner;

// 공백(0100) 문제1
public class Task01 {
	public static void main(String[] args) {
//		** 문제 1. randomGame
//
//		게임에 참여할 두 명의 이름을 사용자에게 입력 받는다.
//		랜덤으로 나온 5개 숫자들의 합이 더 큰 사람이 이기는 게임이다.
//		메소드명 : randomGame
//
//		- randomGame 메서드를 main에서 두 번 호출하여 출력 형식대로 출력하게 만들 것
//		- 매개변수 o 리턴 타입 자유
//
//		출력 형식
//		1등 : 사용자 1, 합계 : 00
//		2등 : 사용자 2, 합계 : 00
//
//		출제 의도
//
//		- 메서드를 외부에서 선언하고 호출하는 것을 연습하자
//		- 랜덤 클래스 생성하여 nextInt 메서드 새롭게 사용해보기
//		- Scanner의 입력 메서드를 변수에 넣어 인수로 사용해보기
		
		// 입력 메소드 import
		// 두 사용자의 이름을 저장할 변수 선언
		// 두 사용자의 합계를 저장할 변수 선언
		// 승자와 패자의 합계를 비교할 변수 선언
		// randonGame 메소드 객체 생성
		// 두 사용자의 합계를 비교할 코드
		// 결과 출력
		
		System.out.println("*****randonGame*****");  // 프로그램 이름
		
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		String name1 = "", name2 = "";  // 두 사용자의 이름을 저장할 변수 선언
		int sum1 = 0, sum2 = 0;  // 두 사용자의 합계를 저장할 변수 선언
		
		System.out.print("사용자1의 이름을 입력하세요 : ");  // 이름 입력 요구
		name1 = sc.nextLine();  // 1번 사용자의 이름 저장
		System.out.print("사용자2의 이름을 입력하세요 : ");  // 이름 입력 요구
		name2 = sc.nextLine();  // 2번 사용자으 이름 저장
		
		sc.close();  // 자원 닫기
		
		Task01 t = new Task01();  // 객체 생성
		sum1 = t.randomGame(name1);  // 1번 사용자의 게임 결과
		sum2 = t.randomGame(name2);  // 2번 사용자으 게임 결과
		
		if(sum1 > sum2) {  // 1번 사용자 우승
			System.out.println("1등 : " + name1 + ", 합계 : " + sum1);  // 1등 이름, 합계 출력
			System.out.println("2등 : " + name2 + ", 합계 : " + sum2);  // 2등 이름, 합계 출력
		} else if(sum1 < sum2) {  // 2번 사용자 우승
			System.out.println("1등 : " + name2 + ", 합계 : " + sum2);  // 1등 이름, 합계 출력
			System.out.println("2등 : " + name1 + ", 합계 : " + sum1);  // 2등 이름, 합계 출력
		} else {  // 무승부
			System.out.println("무승부");  // 메시지 출력
		}
	}
	
	// 리턴타입 : int
	// 매개변수 : String name
	// random 메소드 import
	// 합계를 저장할 변수 선언
	// 5번의 반복을 통해 랜덤으로 나온 값을 결과에 더해서 저장
	// 결과값 return
	
	int randomGame(String name) {  // 메소드 선언 수형 return 매개변수 문자열
		Random rd = new Random();  // 랜덤메소드 import
		int sum = 0;  // 합계를 저장할 변수 선언
		for(int i=0; i<5; i++) {  // 랜덤한 수를 5번 뽑는다
			sum += rd.nextInt(10);  // 0 ~ 9까지의 수를 랜덤하게 뽑아서 합계에 누적 저장한다
		}
		return sum;  // 결과 return
	}
}
