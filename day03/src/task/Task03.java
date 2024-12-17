package task;

public class Task03 {
	public static void main(String[] args) {
		   //int, long, double, float, boolean, char
	      int num1 = 50;
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
	      
	    //1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
	      long result1 = (long)num1;
	      double result2 = (double)num1;
	      float result3 = (float)num1;
//	      boolean result4 = (boolean)num1;
	      char result5 = (char)num1;
	      
	      System.out.println("int -> long : " + result1);
	      System.out.println("int -> double : " + result2);
	      System.out.println("int -> float : " + result3);
	      System.out.println("int -> char : " + result5);
	      
	    //2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
	      int result6 = (int)num2;
	      double result7 = (double)num2;
	      float result8 = (float)num2;
//	      boolean result9 = (boolean)num2;
	      char result10 = (char)num2;
	      
	      System.out.println("long -> int : " + result6);
	      System.out.println("long -> double : " + result7);
	      System.out.println("long -> float : " + result8);
	      System.out.println("long -> char : " + result10);
	      
	    //3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
	      int result11 = (int)num3;
	      long result12 = (long)num3;
	      float result13 = (float)num3;
//	      boolean result14 = (boolean)num3;
	      char result15 = (char)num3;
	      
	      System.out.println("double -> int : " + result11);
	      System.out.println("double -> long: " + result12);
	      System.out.println("double -> float : " + result13);
	      System.out.println("double -> char : " + result15);
	      
	    //4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
	      int result16 = (int)num4;
	      long result17 = (long)num4;
	      double result18 = (double)num4;
//	      boolean result19 = (boolean)num4;
	      char result20 = (char)num4;
	      
	      System.out.println("float -> int : " + result16);
	      System.out.println("float -> long : " + result17);
	      System.out.println("float -> double : " + result18);
	      System.out.println("float -> char : " + result20);
	      
	    //5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
//	      int result21 = (int)isTrue;
//	      long result22 = (long)isTrue;
//	      double result23 = (double)isTrue;
//	      float result24 = (float)isTrue;
//	      char result25 = (char)isTrue;
	      
	    //6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
	      int result26 = (int)name;
	      long result27 = (long)name;
	      double result28 = (double)name;
	      float result29 = (float)name;
//	      boolean reuslt30 = (boolean)name;
	      
	      System.out.println("char -> int : " + result26);
	      System.out.println("char -> long : " + result27);
	      System.out.println("char -> double : " + result28);
	      System.out.println("char -> float : " + result29);

	}
}
