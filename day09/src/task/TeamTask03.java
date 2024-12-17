package task;

import java.util.Scanner;

public class TeamTask03 {
	public static void main(String[] args) {
//		회원가입과 로그인(메소드로 코드 분리하기)
//		회원가입(입력폼 : 아이디, 비번, 비번확인, 닉네임)
//		→ 배열로 아이디와 닉네임 임의로 만들기(개수는 아무렇게나,,)
//		→ 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
//		→ 닉네임도 겹치면 알려주기
//		→ 비번은 아스키코드로 암호화
//		→ 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끗
//		→ 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 {암호화된아스키코드값} 입니다"
//		└ 배열, 메소드, for문, if문, 형변환
//
//		로그인
//		→ 로그인 기회는 딱 5번 → 5번 이후에는 보안암호 표시(변수로 보안암호1개만 저장)
//		→ 로그인 성공 시 회원가입한 아이디와 닉네임 표시(user님 환영합니다, 접속한 아이디는 Id입니다)
//		└ 배열, 메소드, for문, while..?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 진행");
		System.out.println("사용할 아이디 입력");
		String id = sc.next();
		System.out.println("비밀번호 입력");
		int pw = sc.nextInt();
		System.out.println("비밀번호 재입력");
		int pw2 = sc.nextInt();
	}
	
	void signIn(String[] idNamePw) {
		final String[] ID = {"abcd", "efg"};
		final String[] NAME = {"rlfwlstn"};
		int pw = 0;
	}
}
