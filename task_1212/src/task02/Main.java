package task02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		2. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//		만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며, 
//		"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력하세요.
		
		Method m = new Method();  // 객체 생성
		
		Scanner sc = new Scanner(System.in);  // 입력 메소드 import
		
		// 프로그램 이름
		System.out.println("*****문자열을 입력하면 정수형으로 반환하는 프로그램*****");
		System.out.println("문자열을 입력하세요");  // 사용자에게 입력값 요구
		String msg = sc.nextLine();  // 입력받은 문자열을 변수에 저장
		
		if(!m.checkNum(msg)) {  // 입력받은 문자열에 정수만 입력되었는지 확인
			try {
				// 정수가 아닌 문자열이 입력되면 예외처리
				throw new MainException("숫자가 아닌 문자열이 입력되었습니다");
			} catch (MainException e) {  // 예외처리 클래스의 객체 생성
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());  // 메시지 출력
			}
		} else {
			// 정수만 입력되었다면 정수형으로 반환하고 결과 출력
			System.out.println(Integer.parseInt(msg));
		}

		sc.close();  // 자원 닫기
	}
}
