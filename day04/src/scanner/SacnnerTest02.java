package scanner;

import java.util.Scanner;

// 2번 : 입력 메소드는

public class SacnnerTest02 {
	public static void main(String[] args) {
		
//		// 1. 입력 클래스 변수 만들기
//		Scanner sc = new Scanner(System.in);
//		// 2. 출력 메시지(입력받을 것이 어떤 것인지)
//		System.out.println("지금 배우고 있는 프로그래밍 언어는?");
//		// 3. String 변수명 = 입력 메소드
//		String subject = sc.next();
//		// 4. 변수 출력
//		System.out.println(subject);
		
		// 실습
		// 이릅을 입력하세요 : 000
		// 000님 안녕하세요
		// printf 사용하기
		
		// 로직구성
		// 1. 입력 클래스 변수 import : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		// 2. 출력 메시지(입력받을 것이 어떤 것인지)
		System.out.print("이름을 입력하세요 : ");
		// 3. String 변수명 = 입력 메소드(.next())
		String name = sc.nextLine();
		// 4. 변수 출력
		System.out.printf("%s님 안녕하세요", name);
	}
}
