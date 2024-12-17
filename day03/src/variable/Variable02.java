package variable;
// 2번 : 변수명 선언 시 주의사항

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문자부터 시작한다
//		int 1num = 10;
		int nu1m = 10;
		int num1 = 10;
		
//		특수문자를 쓸 수 없다(단, _와 $는 가능)
//		int @#$% = 10;
		int a$b_ = 10;
		System.out.println("a$b : " + a$b_);
		
//		공백을 사용할 수 없다(카멜표기법, 스네이크표기법 등을 활용한다)
//		int num ber = 10;
		int myAge = 10;  // 첫 단어 소문자로 시작, 단어가 바뀔 때 첫 문자 대문자로 카멜 표기법(변수명, 메소드 명 작성시)
		int my_age = 10;  // 첫 단어 소문자로 시작, 단어가 바뀔 때 언더바로 연결 스네이크 표기법(상수 작성시)
		int MyAge = 10; // 첫 단어 대문자로 시작, 단어가 바뀔 때 첫 문자 대문자로 파스칼 표기법(클래스명 작성시)
		
//		키워드(예약어)를 사용할 수 없다
//		int int = 10;
//		inr for = 10;
		
//		되도록 소문자로 시작한다(대소문자를 구분한다)
		int Abc = 100;
		int abc = 200;
		System.out.println("Abc : " + Abc);
		System.out.println("abc : " + abc);
		
	}

}
