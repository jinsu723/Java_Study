package bookTask;

public class EBook extends Book{  // Book 클래스를 상속하는 EBook 클래스 선언
	int sizeInMB;  // 책의 용량 필드를 선언
	
	EBook(){  // 매개변수가 없는 생성자
		super("알수없음", "알수없음");  // Book클래스의 생성자로 인수를 보내 필드를 초기화
		this.sizeInMB = 0;  // 용량 초기화
	}
	
	EBook(String title, String author, int sizeInMB){  // 제목, 저자, 용량을 받아 필드를 초기화하는 생성자 선언
		this.title = title;  // 제목을 초기화
		this.author = author;  // 저자를 초기화
		this.sizeInMB = sizeInMB;  // 책의 용량을 초기화
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("책의 용량 : " + this.sizeInMB);
	}
	

	
	// 필드 선언 sizeInMB
	// 생성자 기본생성자
	// super 사용
	// super(제목과 작가 알수없음) 사이즈 0으로 초기화
	// 매개변수 생성자
	// 3개의 매개변수를 받아 초기화
}