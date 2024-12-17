package task;

import java.util.Scanner;

public class Task02_01 {
	public static void main(String[] args) {
//		- **문제 2. 입력받은 Type 출력**
//	    
//	    정수, 실수, 문자, 문자열 중 하나를 입력하여 입력받은 Type이 무엇인지 알려주는 프로그램 
//	    
//	    메서드명: CheckType, Type에 따라 값 출력하는 메서드), 매개변수O, 리턴값 자유
//	    
//	    출력 형식
//	    정수, 실수, 문자, 문자열 중 하나를 입력하세요:  3.14
//	    3.14는 실수입니다.
//	    
//	    출제 의도 
//	    
//	    - 오버 로딩 연습
//	    - 여러 형변환들이 어떻게 작동하는지  연습
		Scanner scan = new Scanner(System.in);
		Task02_01 s2 = new Task02_01();

		System.out.print("정수, 실수, 문자, 문자열 중 하나를 입력하세요 : ");
		s2.CheckType(scan);

	}

	void CheckType(Scanner sc) {
		char num[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		String s = sc.nextLine();
		if(s.length()==0)return;
		boolean allNumber = true;
		boolean thisint = true;
		char input[] = s.toCharArray();// asd123
		for (char c : input) {
			allNumber = false;
			for (char n : num)
				if (c == n || c == '.') {
					allNumber = true;
					break;
				}
			if (!allNumber)
				break;
		}

		if (allNumber) {
			for (char c : input)
				if (c == '.')
					thisint = false;
			if (thisint)
				CheckType(Integer.parseInt(s));
			else
				CheckType(Double.parseDouble(s));
		} else {
			if (input.length == 1)
				CheckType(s.charAt(0));
			else
				CheckType(s);
		}
	}

	void CheckType(int i) {
		System.out.println(i + "는 정수입니다");
	}

	void CheckType(double d) {
		System.out.println(d + "는 실수입니다");
	}

	void CheckType(char c) {
		System.out.println(c + "는 문자형입니다.");
	}

	void CheckType(String s) {
		System.out.println(s + "는 문자열입니다");
	}
}