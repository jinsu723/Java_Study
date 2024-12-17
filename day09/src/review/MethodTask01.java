package review;

//  1번 :

public class MethodTask01 {
	// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
	// 매개변수o, 리턴값o
	// 메소드명 : changeSign

	// 1) 기능을 생각 => 음수를 양수, 양수는 음수
	// 2) 리턴타입을 생각한다 => void
	// 3) 메소드명을 생각한다 => changeSign
	// 4) 매개변수를 생각한다 => 정수형 1개
	// 5) 구현부 실행할 문장을 생각한다 => 음수 -> 양수, 양수 -> 음수 => 매개변수 * -1
	// 6) return 매개변수 * -1
	// 7) 리턴값이 맞는 타입으로 변경한다 => int

	int changeSign(int num) {
		return num * -1;
	}

	// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
	// 매개변수 o, 리턴값 o
	// 메소드명 : printName

	// 1) 기능 => 전달된 정수만큼 이름 출력하는 기능
	// 2) 리턴타입 => void
	// 3) 메소드명 => printName
	// 4) 매개변수 => 2개(int, String)
	// 5) 실행할 문장 생각 => 전달된 개수만큼
	// for문(초기식 int i=1; i<=num; i++)
	// syso(name);
	// }
	// 6) 리턴값을 생각한다 => "정수 : " + num + "이름 : " + name;

	String printName(int num, String name) {
		for (int i = 1; i <= num; i++) {
			System.out.println(name);
		}
		return "정수 : " + num + "이름 : " + name;
	}

	// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
	// 매개변수o, 리턴값o
	// 메소드명 : changeNumber

	// 1) 리턴타입을 생각한다 => int
	// 2) 메소드명 => changeNumber
	// 3) 매개변수 => 정수형 1개
	// 4) 실행할 문장 => return 삼항연산자

	int changeNumber(int num) {
		return num <= 10 ? 1 : 100;
	}

	// 4. 5개의 정수중 평균을 반환하는 메소드
	// 매개변수o(배열), 리턴값o
	// 메소드명 getAvg

	// 1) 리턴타입 생각 => void
	// 2) 메소드명 => getAge
	// 3) 매개변수 => int[] ar
	// 4) 실행할문장 =>
	// 5) 리턴타입 변경 => void -> double

	double getAvg(int[] ar) {
		// 총함 구할 변수
		// 반복문(for-each문)
		// {총합 구할 변수 += 반복문변수}
		// return (double)총합구한변수 / ar.lenth;
		int total = 0;
		for (int num : ar) {
			total += num;
		}
		return (double) total / ar.length;
	}

	// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
	// 매개변수o(배열),리턴값 x
	// 메소드명 printMinMax

	// 1) 리턴타입 => void
	// 2) 메소드명 => printMinMax
	// 3) 매개변수 => int[] ar
	// 4) 실행할 문장 => 최소값, 최대값을 0번째 인덱스로 저장하고
	// 반복문을 통해 비교하면서 0번째 인덱스보다 작은 값이 최소값, 큰 값이 최대값
	// for(int i=0; i<ar.length; i++){
	// int min = ar[0]
	// int max = ar[0]
	// }

	void printMinMax(int[] ar) {
//		int min = ar[0];
//		int max = ar[0];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			min = min > ar[i] ? ar[i] : min;
			max = max < ar[i] ? ar[i] : max;
		}
		System.out.println("최소값 : " + min + ", 최대값 : " + max);
	}

	// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	// BaNanA -> bAnANa
	// 메소드명 : changeCase
	// 매개변수와 리턴값 자유 => 단, 형변환 이용할 것

	// 1) 리턴타입 void
	// 2) 메소드명 => changeCase
	// 3) 매개변수 => 문자열 1개
	// 4) 구현부 =>
	// 문자형 변수 선언
	// 문자열 변수 선언
	// for문(i=0; i<매개변수.length(); i++){
	// 변수1 = 매개변수.charAt(i);
	// if(변수1 >= 97 && 변수1 <= 122){
	// 변수2 += (char)(변수1 - 32);
	// else if(변수1 >= 65 && 변수1 <= 90){
	// 변수2 += (char)(변수2 + 32); }
	// else {
	// 변수2 = "잘못된 값입니다.";
	// return 변수2;
	// 5) 리턴타입 수정 => String

	String changeCase(String str) {
		char c = ' ';
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 97 && c <= 122) {
				result += (char) (c - 32);
			} else if (c >= 65 && c <= 90) {
				result += (char) (c + 32);
			} else {
				result = "잘못된 값입니다";
			}
		}
		return result;
	}

	// 7. 아이디와 비밀번호를 입력받아 로그인하기
	// 매개변수 o, 리턴값 o(boolean 타입)
	// 메소드명 : login
	// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	// 둘 중 하나라도 틀리면 잘못입력했습니다 출력

	// 1) 리턴타입 => boolean
	// 2) 메소드명 => login
	// 4) 구현부 => if( 아이디.equls("admin") && 비밀번호 == 1234){
	// return true;
	// }
	// return false;

	boolean login(String id, String pw) {
		if (id.equals("admin") && pw.equals("1234")) {
			return true;
		}
		return false;
	}

	public static void main(String[] agrs) {
		
		MethodTask01 mt = new MethodTask01();
		
		System.out.println("***************1번****************");
		// 매개변수 o 리턴값 o 호출 => System.out.println(객체명.메소드명(인수));
		System.out.println(mt.changeSign(10));
		System.out.println(mt.changeSign(-10));
		
		System.out.println("***************2번****************");
		// 매개변수 2개, 리턴값 o 호출 => syso(객체명.메소드명(정수, 문자열));
		System.out.println(mt.printName(10, "황구"));
		System.out.println(mt.printName(2, "철수"));
		
		System.out.println("***************3번****************");
		// 매개변수 1개, 리턴값 o 호출 => int 변수 = 객체명.메소드명(정수);
		int number = mt.changeNumber(10);
		System.out.println(number);
		
		System.out.println("***************4번****************");
		// 매개변수 o(배열) , 리턴값 o => double 변수 = 객체명.메소드명(정수형배열);
		int[] ar = { 1, 2, 3, 4, 5 };
		double avg1 = mt.getAvg(new int[] {10, 20, 30});
		double avg2 = mt.getAvg(ar);
		System.out.println(avg1);
		System.out.println(avg2);
		
		System.out.println("***************5번****************");
		// 매개변수 o(배열), 리턴값 x => 객체명.메소드명(정수형배열);
		mt.printMinMax(ar);
		mt.printMinMax(new int[] {10, -5, 20, 3});
		
		System.out.println("***************6번****************");
		// 매개변수 o(문자열), 리턴값 o => syso(객체명.메소드명(인수));
		System.out.println(mt.changeCase("BaNnNA"));
		
		System.out.println("***************7번****************");
		// 매개변수

		System.out.println(mt.login("admin", "1234"));
		if (mt.login("admin", "1234")) {
			System.out.println("관리자님 환영합니다.");
		} else {
			System.out.println("잘못입력했습니다.");
		}
	}
}
