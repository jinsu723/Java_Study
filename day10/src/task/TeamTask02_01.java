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
// 키워드 3번 사용하면  그만 리턴 flag = false;

package task;

import java.util.Scanner;

public class TeamTask02_01 {
	public static void main(String[] args) {
//		[조건]
//		키워드 : ~냥 , ~냠, ~용, ~쪄
//		1. 매개변수 o, 리턴값 o (키워드 포함 여부를 담은 정수형 flag 변수 선언할 것)
//		2. 입력받은 문자열 중에 키워드가  있다면 해당 키워드를 
//		2번 연속 출력하게 문장을 바꿉니다.
//		그 후 "당신은 귀엽습니다" 문장을 다음 줄에 출력 합니다.
//		3. 만약 키워드가 포함되지 않았다면 "잘하고 있습니다, 
//		앞으로도 그렇게 사용해주세요" 출력
//		4. 키워드가 들어간 문장이 총 3번 이상 입력 되었을때

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

		Scanner scan = new Scanner(System.in);
		TeamTask02_01 s2 = new TeamTask02_01();

		int count = 0;
		while (true) {
			System.out.print("메세지 입력 : ");
			String msg = scan.next();
			scan.close();  // 자원 닫기

			if (s2.iAmCute(msg) == 1) {
				count++;
				if (count == 4) {
					System.out.println("그  만!!!!");
					break;
				}
				System.out.println(msg + msg.charAt(msg.length() - 1));
				System.out.println("당신은 귀엽습니다 >.<");
			} else
				System.out.println("잘하고 있습니다. 앞으로도 그렇게 사용해주세요");
		}

	}
	
	int iAmCute(String m) {
		int flag = 0;
		char keyWord[] = { '냥', '냠', '용', '쪄' };
		for (char data : keyWord)
			if (data == m.charAt(m.length() - 1))
				flag = 1;
		return flag;
	}
}
