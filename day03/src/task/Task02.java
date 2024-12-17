package task;

public class Task02 {
	public static void main(String[] args) {
	    //int, long, double, float, boolean, char
	      int num1 = 10;
	      long num2 = 20000000L;
	      double num3 = 1.555555555555555;
	      float num4 = 1.1111f;
	      boolean isTrue = true;
	      char name = 'a';
	      
	      System.out.println("int : " + num1);
	      System.out.println("long : " + num2);
	      System.out.println("double : " + num3);
	      System.out.println("float : " + num4);
	      System.out.println("boolean : " + isTrue);
	      System.out.println("char : " + name);
	      
	      //1. 정수(int) -> 모든 자료형 자동형변환 가능여부 확인
	      long result1 = num1;
	      double result2 = num1;
	      float result3 = num1;
//	      boolean result4 = num1;
//	      char result5 = num1;
	      
	      System.out.println("int -> long : " + result1);
	      System.out.println("int -> double : " + result2);
	      System.out.println("int -> float : " + result3);
//	      System.out.println("boolean : " + result4);
//	      System.out.println("char : " + result5);
	      
	      //2. 정수(long) -> 모든 자료형 자동형변환 가능여부 확인
//	      int result6 = num2;
	      double result7 = num2;
	      float result8 = num2;
//	      boolean result9 = num2;
//	      char result10 = num2;
	      
//	      System.out.println("int : " + result6);
	      System.out.println("long -> double : " + result7);
	      System.out.println("long -> float : " + result8);
//	      System.out.println("boolean : " + result9);
//	      System.out.println("char : " + result10);
	      
	      //3. 실수(double) -> 모든 자료형 자동형변환 가능여부 확인
//	      int result11 = num3;
//	      long result12 = num3;
//	      float result13 = num3;
//	      boolean result14 = num3;
//	      char resul15 = num3;
	      
	      //4. 실수(float) -> 모든 자료형 자동형변환 가능여부 확인
//	      int result16 = num4;
//	      long result 17 num4;
	      double result18 = num4;
//	      boolean result19 = num4;
//	      char result20 = num4;
	      
	      System.out.println("float -> double : " + result18);
	      
	      //5. 논리형 (boolean)  -> 모든 자료형 자동형변환 가능여부 확인
//	      int resutl21 = isTrue;
//	      long result22 = isTrue;
//	      double result23 = isTrue;
//	      float result24 = isTrue;
//	      char result25 = isTrue;
	      
	      //6. 문자형(char) -> 모든 자료형 자동형변환 가능여부 확인
	      int result26 = name;
	      long result27 = name;
	      double result28 = name;
	      float result29 = name;
//	      boolean result30 = name;
	      
	      System.out.println("char -> int : " + result26);
	      System.out.println("char -> long : " + result27);
	      System.out.println("char -> double : " + result28);
	      System.out.println("char -> float : " + result29);

	}
}
