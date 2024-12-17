package bookTask;

public class Book {  // 클래스 선언
	String title;  // 제목 필드 선언
	String author;  // 저자 필드 선언
	
	Book(){  // 기본 생성자
		this.title = "알수없음";  // 제목을 알 수 없음으로 초기화
		this.author = "알수없음";  // 저자를 알 수 없음으로 초기화
	}
	
	Book(String title){  // 제목만 받아 초기화
		this.title = title;  // 제목 필드를 초기화
		this.author = "알수없음";  // 저자는 알 수 없음으로 초기화
	}
	
	Book(String title, String author){  // 제목과 저자를 받아 초기화
		this.title = title;  // 제목 필드를 초기화
		this.author = author;  // 저자 필드를 초기화
	}
	
	void printInfo() {  // 책의 정보 출력
		System.out.println("책의 제목 : " + this.title);
		System.out.println("책의 저자 : " + this.author);
		// 객체에 저장된 필드와 메시지 출력
	}
	public static void main(String[] asgs) {  // 메인메소드
//	2) 도서 프로그램
//	Book 클래스 
//	필드
//	   title, author
//
//	생성자
//	기본 생성자 : 제목과 작가를 "알수없음"으로 초기화
//	매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화
//	매개변수 생성자 : 제목과 작가를 모두 받아 초기화
//
//	EBook 클래스 Book 클래스를 상속
//	필드
//	   sizeInMB
//
//	생성자
//	기본 생성자
//	   super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//	매개변수 생성자 
//	   제목, 작가, 크기를 받아 초기화

		// 필드 선언 문자열 2개
		// 생성자 선언 3개
		// 기본 생성자 필드 2개 알수없음 초기화
		// 매개변수 생성자 title을 받고 작가를 알수없음
		// 매개변수 생성자 author과 title을 모두 받아 초기화
		
		System.out.println("*****도서 프로그램*****");  // 프로그램 이름
		
		Book b1 = new Book();  // 기본생성자로 객체 생성
		Book b2 = new Book("잭과콩나무");  // 제목만 받는 생성자로 객체 생성
		Book b3 = new Book("고양이", "베르나르베르베르");  // 제목과 저자 모두를 받는 생성자로 객체 생성
		
		EBook b4 = new EBook();  // EBook클래스의 기본 생성자로 객체 생성
		EBook b5 = new EBook("녹나무의파수꾼", "히가시노게이고", 100);
		// EBook 클래스의 매개변수로 3개를 받는 생성자로 객체 생성
		
		b1.printInfo();  // b1의 정보 출력
		b2.printInfo();  // b2의 정보 출력
		b3.printInfo();  // b3의 정보 출력
		b4.printInfo();  // b4의 정보 출력
		b5.printInfo();  // b5의 정보 출력
	}
}