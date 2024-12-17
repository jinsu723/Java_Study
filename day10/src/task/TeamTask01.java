// 입력메소드

// 좀비 수 저장할 변수
// 입력이 1이라면 초기진압
// zombie메소드 사용
// syso 결과 출력

// 메소드 Zombie
// int zombie(int num)
// 좀비는 시간당 2배로 증식
// 좀비 증식 메소드, 증식된 좀비값을 리턴
// for문을 사용해서 6시간 후의 좀비 수 알아내기


//오버로딩 + 재귀호출 버전
package task;

import java.util.Scanner;

public class TeamTask01 {
	public static void main(String[] args) {
		// 1시간마다 2배씩 증가하는 좀비의 수를 계산하는 문제
		Scanner scan = new Scanner(System.in);// 스캐너
		TeamTask01 s1 = new TeamTask01();// 클래스 객체

		System.out.print("좀비 수 입력 : ");
		int num = scan.nextInt();// 초기 좀비 수 입력
		scan.close();  // 자원 닫기

		if (s1.zombie(num) == 1)// 초기 좀비 수가 1일때
			System.out.println("초기 진압 완료.");
		else// 6시간 후의 좀비 수 출력
			System.out.println("6시간 후의 좀비는 : " + s1.zombie(num) + "마리 입니다");
	}

	int zombie(int zom) { //좀비가 1마리인지 판단
		if (zom == 1)// 좀비가 1마리면 return 1
			return 1;
		return zombie(1, zom);// 1이 아니면 메소드 호출, 오버로딩
	}

	int zombie(int cnt, int zom) { //좀비가 증식하는거, 6시간 후 어떻게 증식하는지 계산
		if (cnt == 6)// 6시간 기준이므로 종료
			return zom * 2;
		else// 6이 아니면 cnt전위증감 후 재귀호출
			return zombie(++cnt, zom) * 2;
	}
}