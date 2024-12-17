package task;

import java.util.Scanner;

public class TeamTask02_02 {
	public static void main(String[] args) {
		// 입력메소드
		// ~냥 , ~냠, ~용, ~쪄를 iAmCute 메소드 안에 문자형으로 선언
		//
		// 키워드 포함된 문장 입력 시 2번 출력
		// ex)하이용 → 하이용용, 쿵했쪄 → 쿵했쪄쪄

		// String iAmCute(String word)
		// 입력받은 문자열을 문자형 배열로 저장
		// char[] key = new char[word.length()];
		// char 냥 냠 용 쪄
		// boolean flag = true;
		// while(flag)
		// if(word)
		// 키워드 사용 없으면 그렇개 해주세요 리턴 flag = true;
		// 키워드 사용하면 뒤에 마지막 글자 뒤에 붙여주고 사용 횟수 카운트 출력 리턴
		// 키워드 3번 사용하면 그만 리턴 flag = false;

		Scanner sc = new Scanner(System.in);
		TeamTask02_02 tt = new TeamTask02_02();

		System.out.println("문자열을 입력하세요.");
		String words = sc.nextLine();
		sc.close();  // 자원 닫기

		System.out.println(tt.iAmCute(words));
	}

	String iAmCute(String words) {
		Scanner sc = new Scanner(System.in);
		char[] key = { '냥', '냠', '용', '쪄' };

		int count = 0;

		while (true) {
			boolean flag = false;
			char[] word = new char[words.length()];
			int a = 0;
			
			for (int i = 0; i < words.length(); i++) {
				word[i] = words.charAt(i);
			}
//			for (char data : word) {
//				System.out.println(data);
//			}
			for (int i = 0; i < key.length; i++) {
				if (count == 4) {
					sc.close();
					return "그 만 ! !";
				}
				if (key[i] == word[words.length() - 1]) {
					count++;
					flag = true;
					a = i;
				}
			}
			if (!(flag)) {
				System.out.println("잘하고있다.");
				words = sc.nextLine();
			} else {
				System.out.println(words + key[a]);
				System.out.println("당신은 귀엽습니다><");
				words = sc.nextLine();
			}
			sc.close();  // 자원 닫기
		}
	}
}
