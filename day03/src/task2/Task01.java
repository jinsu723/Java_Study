package task2;

public class Task01 {
	public static void main(String[] args) {
	       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
	      
//   출력결과 예시
//   int: 100000
//   long: 123456789L
//   float: 3.14f
//   double: 3.14159265359
//   char: A
//   boolean: true
		
		// 변수 선언하면서 초기화
		// 변수에 저장되 값 출력
		
		int num1 = 100000;
		long num2 = 123456789L;
		float num3 = 3.14f;
		double num4 = 3.14159265359d;
		char a = 'A';
		boolean isTrue = true;
		
		System.out.println("int : " + num1);
		System.out.println("long : " + num2 + "L");
		System.out.println("float : " + num3 + "f");
		System.out.println("double : " + num4);
		System.out.println("char : " + a);
		System.out.println("boolena : " + isTrue);
		
	      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
	      
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
		
		// 변수를 상수로 선언하기
		// 결과 출력
		
		final String MYNAME = "길진수";
		final int BIRTHDAY = 980723;
		
		System.out.println("제 이름은 " + MYNAME + "이고 생년월일은 " + BIRTHDAY + "입니다.");
		
	      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
	      
	      // 정수형 age 변수 선언, 값 : 25
	      // 실수형 height 변수 선언, 값 : 160.5
	      // 논리형 isStudent 변수 선언, 값 : true
	      
//	      출력결과
//	      나이 : 25, 타입은 000형
//	      키 : 160.5, 타입은 000형
//	      학생여부 : true, 타입은 000형
		
		// 정수형 변수 1개 선언
		// 실수형 변수 1개 선언
		// 논리형 변수 1개 선언
		// 결과 출력
		
		int age = 25;
		double height = 160.5;
		boolean isStudent = true;
		
		System.out.println("나이 : " + age + ", 타입은 정수형");
		System.out.println("키 : " + height + ", 타입은 실수형");
		System.out.println("학생 여부 : " + isTrue + ", 타입은 논리형");
		
	      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
	      // 
//	      출력결과
//	      안녕하세요, 제 이름은 [000]입니다.
//	      제 취미는 [00]입니다.
		
		// 문자열 변수 선언 취미 저장
		// 형식지정자 사용하여 결과 출력
		
		String hobby = "음악 듣기";
		
		System.out.printf("안녕하세요, 제 이름은 %s입니다.\n제 취미는 %s입니다.\n", MYNAME, hobby);
		
	      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
	      String strNum = "100";
	      int intNum = 200;
	      double doubleNum = 300.5;
	      char charLetter = 'C';
	      boolean boolVal = true;
	      
	      int num5 = Integer.parseInt(strNum);
	      System.out.println("문자열에서 정수형으로 변환 : " + num5);
	      
	      String numToString = intNum + "";
	      String doubleToString = doubleNum + "";
	      String booleanToString = boolVal + "";
	      
	      System.out.println(booleanToString);
	      
	      int charToNum = charLetter;
	      System.out.println(charToNum);
	      
//	      strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
//	      intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
//	      charLetter를 정수로 변환하여 출력
//	      boolVal을 문자열로 변환하여 출력
	      
	      int StringToNum = Integer.parseInt(strNum);
	      System.out.println("intNum + strNum : " + (intNum + StringToNum));
	      System.out.println("intNum + doubleNum : " + ((double)intNum + doubleNum));
	      System.out.println("charLetter -> int : " + (int)charLetter);
	      System.out.println("boolean -> String : " + booleanToString);
	}
}
