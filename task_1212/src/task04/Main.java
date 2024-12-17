package task04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//		5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 
//		그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//		사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.
		
		Method m = new Method();  // 메소드가 있는 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		
		// 프로그램 이름
		System.out.println("*****Fizz&Buzz*****");
		System.out.println("정수를 입력하세요");  // 사용자에게 입력값 요구
		
		String msg = sc.nextLine();  // 입력받은 값을 문자열에 저장
		
		// 사용자가 정수를 입력했는지 확인
		if(!m.checkNum(msg)) {
			try {
				// 정수가 아니라면 예외처리
				throw new MainException("숫자가 아닌 문자열이 입력되었습니다");
			} catch (MainException e) {  // 예외처리 클래스의 객체 생성
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());  // 예외 메시지 출력
			}
		} else {  // 제대로 정수를 입력했다면
			// 문자열을 정수로 반환하고 3의 배수인지 5의 배수인지 판단하여 결과 출력
			System.out.println("결과 공개 : " + m.getWord(Integer.parseInt(msg)));
		}
		
		sc.close();  // 자원 닫기
	}
}
