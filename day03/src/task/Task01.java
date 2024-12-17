package task;

public class Task01 {
	public static void main(String[] args) {
	       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
	      
//      출력결과 예시
//      int: 100000
//      long: 123456789L
//      float: 3.14f
//      double: 3.14159265359
//      char: A
//      boolean: true
     int num1 = 100000;
     long num2 = 123456789L;
     float num3 = 3.14F;
     double num4 = 3.4159265359d;
     char name = 'A';
     boolean isTrue = true;
     
     System.out.println("int: " + num1);
     System.out.println("long: " + num2 + "L");
     System.out.println("floatL " + num3 + "F");
     System.out.println("double: " + num4);
     System.out.println("char: " + name);
     System.out.println("boolean: " + isTrue);
		
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
     
     String myName = "길진수";
     int birth = 980723;
     
     System.out.println("제 이름은 " + myName + "이고 " + "생년월일은 " + birth + "입니다");
      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
      
      // 정수형 age 변수 선언, 값 : 25
      // 실수형 height 변수 선언, 값 : 160.5
      // 논리형 isStudent 변수 선언, 값 : true
      
//      출력결과
//      나이 : 25, 타입은 000형
//      키 : 160.5, 타입은 000형
//      학생여부 : true, 타입은 000형
     
     int age = 25;
     double height = 160.5d;
     boolean isStudent = true;
     
     System.out.println("나이 : " + age + ", 타입은 정수형");
     System.out.println("키 : " + height + ", 타입은 실수형");
     System.out.println("학생여부 : " + isStudent + ", 타입은 논리형");
      
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      // 
//      출력결과
//      안녕하세요, 제 이름은 [000]입니다.
//      제 취미는 [00]입니다.
     
     String hobby;
     
     System.out.printf("안녕하세요, 제 이름은 [%s]입니다.\n제 취미는 [%s]입니다." , "길진수" , "음악감상");
     System.out.println();
     
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;
      
//      strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
//      intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
//      charLetter를 정수로 변환하여 출력
//      boolVal을 문자열로 변환하여 출력
      
      int result1 = Integer.parseInt(strNum);
      double result2 = intNum;
      int result3 = charLetter;
      String result4 = boolVal + "";
      
      System.out.println("intNum + strNum : " + (result1 + intNum));
      System.out.println("intNum + doubleNum : " + (result2 + doubleNum));
      System.out.println("charLetter : " + result3);
      System.out.println("boolean : " + result4);

	}
}
