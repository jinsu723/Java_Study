package oper;

import java.util.Scanner;

// 10번 :

public class OperTask01 {
	public static void main(String[] args) {
		
		// 입력 메서드 import
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자로부터 두 개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		
		// 변수 선언 4개
		// 메시지 출력 '두 개의 숫자를 띄어쓰기로 구분하여 입력하세요
		// 합과 곱 구해서 변수 2개에 저장하기
		// 결과 출력
		// 버퍼 비우기
		
		int num1 = 0, num2 = 0, sum = 0, multy = 0;
		System.out.print("두 개의 정수를 띄어쓰기로 구분하여 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		multy = num1 * num2;
		
		System.out.println("두 정수의 합 : " + sum + ", 두 정수의 곱 : " + multy);
		
		sc.nextLine();
		System.out.println();
		
		// 2. 1번에서 입력받은 두 개의 숫자를 사용하여 평균을 계산하고 소수점 두 자리수까지 출력하기
		
		// 변수 선언 1개
		// 입력받은 수의 합을 2로 나눠서 평균 변수에 저장
		// 소수점 2자리 구하기
		// 결과 출력
		
		double evg = 0;
		evg = sum / 2d;
		System.out.printf("평균값 : %.2f" , evg);
		
		System.out.println();
		System.out.println();		
		
		// 3. 두 자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
		// 입출력 결과
		// 두 자리수 정수를 입력하세요 :
		// 십의자리수는 _입니다. 일의 자리는 _입니다.
		
		// 변수 선언 3개
		// 출력 메시지 두 자릿수 정수를 입력하세요
		// 변수 1개 입력
		// 십의자리수 구하기
		// 일의자리 구하기
		// 결과 출력
		
		int num3 = 0, ten = 0, one = 0;
		
		System.out.print("두 자릿수 정수를 입력하세요 : ");
		num3 = sc.nextInt();
		one = num3 % 10;
		num3 /= 10;
		ten = num3 % 10;
		
		System.out.println("십의 자리수 : " + ten + ", 일의 자리수 : " + one);
		
		sc.nextLine();
		System.out.println();
		
		// 4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡 수와 잔돈 출력하기
		// 한 곡의 가격은 400원 입니다.
		
		// 변수 선언 4개
		// 곡 가격 400원
		// 입력 받기 int형으로
		// 나누기연산으로 부를 수 있는 곡 수 계산
		// 나머지 연산으로 잔돈 계산
		// 결과 출력
		// 버퍼 비우기
		
		final int price = 400;
		int pay = 0, song = 0, change = 0;
		System.out.print("금액을 입력하세요 : ");
		pay = sc.nextInt();
		song = pay / price;
		change = pay % price;
		
		System.out.println("넣은 금액 : " + pay + " , 부를 수 있는 곡 수 : " + song + ", 잔돈 : " + change);
		sc.nextLine();
		sc.close();
	}
}
