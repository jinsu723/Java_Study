package oper;
// 8번 :

public class OperTest01 {
	public static void main(String[] args) {
		// 산술연산자 : +, -, /, %
		
		int num1 = 10, num2 = 20;
		double num3 = 5.5, num4 = 2.5;
		
		System.out.println("=====덧셈=====");
		System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
		System.out.println(num3 + " + " + num4 + " = " +(num3 + num4));
		System.out.println(num1 + " + " + num4 + " = " +(num1 + num4));
		
		System.out.println("=====뺼셈====");
		System.out.println(num1 + " - " + num2 + " = " +(num1 - num2));
		System.out.println(num3 + " - " + num4 + " = " +(num3 - num4));
		System.out.println(num1 + " - " + num4 + " = " +(num1 - num4));
		
		System.out.println("=====곱셈====");
		System.out.println(num1 + " * " + num2 + " = " +(num1 * num2));
		System.out.println(num3 + " * " + num4 + " = " +(num3 * num4));
		System.out.println(num1 + " * " + num4 + " = " +(num1 * num4));
		
		System.out.println("=====나눗셈====");
		System.out.println(num1 + " / " + num2 + " = " +(num1 / num2));
		System.out.println(num3 + " / " + num4 + " = " +(num3 / num4));
		System.out.println(num1 + " / " + num4 + " = " +(num1 / num4));
		
		System.out.println("=====나머지연산자====");
		System.out.println(num1 + " % " + num2 + " = " +(num1 % num2));
		System.out.println(num3 + " % " + num4 + " = " +(num3 % num4));
		System.out.println(num1 + " % " + num4 + " = " +(num1 % num4));
	}
}
