//입력메소드;
//형변환
//날짜형식은? 20241204 int형 사용
//이름을 정수로 변형 → 단어
//ex)폰은정 → 폰:유니값 은:유니콘 정:유니코드값


//메소드 tellFortune 생성
//매개변수에 이름(자리를 정수로), 날짜 값 → 타입은 int
//산술 : 이름+날짜 % 5 → 변수에 저장
//switch(위 변수)로 케이스0~4까지
//각 케이스에 변수로 문자열 저장 String fortune = "";
//아니면 바로 리턴도 가능
//결과값 문자열로 리턴


package task;

import java.util.Scanner;

public class TeamTask03 {
	public static void main(String[] args) {
//		이름과 날짜를 입력 유니코드로 변환 각 더하기
//		5로 나눠서 운세 출력
//		0 : 오늘은 행운의 날입니다!
//		1 : 약간의 어려움이 있을 수 있어요.
//		2 : 평온한 하루가 예상됩니다.
//		3 : 모험심을 발휘해보세요!
//		4 : 좋은 일이 찾아올 거예요.
//		[ 조건 ]
//		1. 매개변수 o(2개), 리턴값 o
//		2. 메소드명 : tellFortune

		Scanner scan = new Scanner(System.in);// 스캐너
		TeamTask03 s3 = new TeamTask03();// 클래스 객체

		System.out.print("이름을 입력해 주세요 : ");
		String name = scan.next();// 이름 저장
		System.out.print("날짜를 입력해 주세요(ex 241204) : ");
		int date = scan.nextInt();// 날짜 저장
		
		scan.close();  // 자원 닫기

		switch (s3.tellFortune(name, date)) {// 결과 별 운세 출력
		case 0: //결과값이 0이면
			System.out.println("0 : 오늘은 행운의 날입니다!");
			break; //탈출
		case 1: //결과값이 1이면
			System.out.println("1 : 약간의 어려움이 있을 수 있어요.");
			break; //탈출
		case 2: //결과값이 2이면
			System.out.println("2 : 평온한 하루가 예상됩니다.");
			break; //탈출
		case 3: //결과값이 3이면
			System.out.println("3 : 모험심을 발휘해보세요!");
			break; //탈출
		case 4: //결과값이 4이면
			System.out.println("4 : 좋은 일이 찾아올 거예요.");
			break; //탈출
		default: //결과값이 전부 아니면
			System.out.println("이건 나올 일 없음");
		}

	}

	int tellFortune(String name, int date) {// 운세 case 계산
		char ch[] = new char[name.length()];// 문자형 배열 생성
		ch = name.toCharArray();// 이름을 문자형 배열로 저장
		int sum = 0;
		for (int data : ch)
			sum += data;// 문자를 정수형으로 합산
		int result = (sum + date) % 5;// 최종 계산
		return result;// 결과값 리턴
	}
}
