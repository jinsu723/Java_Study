package task;

import java.util.Scanner;

public class Task02_02 {
	
//- **문제 2. 입력받은 Type 출력**
//    정수, 실수, 문자, 문자열 중 하나를 입력하여 입력받은 Type이 무엇인지 알려주는 프로그램 
//    메서드명: CheckType, Type에 따라 값 출력하는 메서드), 매개변수O, 리턴값 자유
//    출력 형식
//    정수, 실수, 문자, 문자열 중 하나를 입력하세요:  3.14
//    3.14는 실수입니다.
//    [출제 의도] 
//    오버 로딩 연습
//    여러 형변환들이 어떻게 작동하는지  연습
	
	//메세지 출력
	//스캐너로 통해 입력 받기
	//입력받은걸 CheckType이름의 오버로딩으로 넘겨주기
	//checkType에서는 해당 값들이 어떤 자료형인지 확인하기
	// - if문으로 걸어서 입력 받은 값들을 형변환해주는 메소드 만들기
	// - 형변환해주면 리턴 걸어서 넘겨주기
	//int형변환
	//실수형변환
	//문자, 문자열 형 변환
	
	public static void main(String[] args) {
		Task02_02 mt = new Task02_02(); //클래스 객체 생성
		Scanner input = new Scanner(System.in); //스캐너
		System.out.print("정수, 실수, 문자, 문자열 중 하나를 골라 자료형 값으로 입력 해 주세요 : "); //출력
		//입력받은값이 여려 자료형이니 다른 형으로 입력 했을때 오류 방지를 위해 String으로 입력 받게 해준다
		String inputValue = input.nextLine();
		System.out.println(mt.CheckType(inputValue)); //값들을 넘겨주고 CheckType 호출
	}
	String CheckType(String value) { //반환값 String(결과 출력을 위해)매개변수는 value
		if(thisInteger(value)) { //thisInteger 호출
			return CheckType(Integer.parseInt(value)); //형 변환 후 값을 아래 오버로딩쪽으로 리턴
		} else if(thisDouble(value)) {//thisDouble 호출
			return CheckType(Double.parseDouble(value)); //형 변환 후 값을 아래 오버로딩쪽으로 리턴
		} else if(value.length() == 1) { //입력값을 받은 value의 길이가 1이면(문자는 길이가 한개)
			return CheckType(value.charAt(0)); //형 변환 후 값 리턴
		} else { //셋다 아니면 문자열
			return value+"는 문자열";
		}
	}
	
	//정수변환 후 위 CheckType오버로딩쪽으로 값 리턴
	boolean thisInteger(String value) { //반환값 Boolean(if문에서 True/False 판단하기 위해), 매개변수 value
		if(value.length() == 0) { //입력값을 받은 value의 길이가 0이면(문자열이 비어있으면 정수가 아닌듯)
			return false; //false를 반환해 정수가 아님을 알리기
		}
		for(int i=0; i<value.length(); i++) { //반복문으로 하여 문자의 처음부터 마지막까지 확인하기(정수면 변환을 위해)
			char ch = value.charAt(i); //문자 ch변수에 입력값을 받은 value에 입력한값을 저장
			//아스키는 0(48)~9(57)까지 숫자 다음으로 문자의 숫자가 큼,  ch에 숫자 0~9보다 큰 문자의 아스키코드가 오면 걔는 문자
			if((ch<'0'||ch>'9')) { //문자를 형변환을 위해 아스키의 도움 받을려는 조건문
				return false; //문자는 정수가 아니니 false떠넘기기
			}
		}
		return true; //true반환
	}
	
	//실수변환 후 위 CheckType오버로딩쪽으로 값 리턴
	boolean thisDouble(String value) {
		if(value.length() == 0) { //입력값을 받은 value의 길이가 0이면(문자열이 비어있으면 이상한듯)
			return false; //false
		}
		boolean thisDot = false; //실수의 특징인 . 구분
		for(int i=0; i<value.length(); i++) { //반복문으로 하여 입력한 문자의 처음부터 마지막까지 확인하기(실수면 변환을 위해)
			char ch = value.charAt(i); //문자 ch변수에 입력값을 받은 value에 입력한값을 저장
			if(ch == '.') { //입력했던 문자에 쩜이 있는지 확인(마침표 구분)
				if(thisDot) { //실수에는 .이 두개면 실수가 아니니 자바가 "실수"하지 않게~
					return false; //false반환
				}
				thisDot = true; //조건에 부합하면 쩜이 하나, 그럼 그건 실수형태이니 실수의 특징 알려주기
			} else if((ch<'0'||ch>'9')&&ch != '-') { //아스키~
				return false; //false반환~
			}
		}
		return thisDot; //실수가 맞다고 알리기
	}
	//오버로딩의 특징 시작
	String CheckType(int value) {
		return value+"는 정수";
	}
	String CheckType(double value) {
		return value+"는 실수";
	}
	String CheckType(char value) {
		return value+"는 문자";
	}
	//오버로딩의 특징 끝~
	

}
