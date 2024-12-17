package task;

public class Task_01 {
//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
	
	// 클래스 생성
	// 필드 생성 String name, int age, String Type
	String name;  // 이름을 저장할 수 있는 필드
	int age;  // 나이를 저장할 수 있는 필드
	String type;  // 종류를 저장할 수 있는 필드
	
	Task_01(String name, int age, String type){  // 변수 초기화
		this.name = name;  // 이름 초기화
		this.age = age;  // 나이 초기화
		this.type = type;  // 종류 초기화
	}
	
	Task_01(String name, int age){  // 나이와 이름만 입력받음
		this(name, age, "고양이");  // 냥으로 끝나는 이름은 무조건 고양이
	}
	
	
	// 메소드 생성
	// 밥먹기
	// 리턴값 x 매개변수x 식사중 식사완료 출력
	void eat() {  // 식사 메소드
		System.out.println(this.name + "이/가 식사를 합니다");  // 이름과 행동 출력
		System.out.println("식사 완료.");  // 식사끝
	}
	
	// 놀기
	// 리턴값x 매개변수x 놀기 놀기 완료 출력
	void play() {  // 놀기 메소드
		System.out.println(this.name + "이/가 재밋게 놀기 시작합니다.");  // 이름과 놀고있음을 알려줌
		System.out.println("놀기끝.");  // 놀기끝
	}
	
	// 자다
	// 리턴값x 매개변수x 자는중 이러남 출력
	void sleep() {  // 잠자기 메소드
		System.out.println(this.name + "이/가 잠에 들었습니다.");  // 이름과 잠을 자고 있다는 것을 알려줌
		System.out.println("기상.");  // 기상
	}
	
	// 생일축하
	// 리턴값x 매개변수x 생일축하 생일끝 출력
	void birthday() {  // 생일 메소드
		System.out.println(this.name + "(이)의 생일.");  // 누가 생일인지 알려줌
		System.out.println("생일끝.");  // 생일끝
	}
}
