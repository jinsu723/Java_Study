package task;

// 16번 :

public class MethodTask {
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : changeSign
		
		System.out.println("1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드");  // 프로그램 이름
		System.out.println("num : 10 => " + mt.changeSign(10));  // 결과 출력
		
		// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
		// 매개변수 o, 리턴값 o
		// 메소드명 : printName
		
		System.out.println("2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드");  // 프로그램 이름
		System.out.println("길진수를 10번 출력하기 : " + mt.printName("길진수", 10));  // 결과 출력
		
		// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : chageNumber
		
		System.out.println("3. 10 이하의 숫자는 1로, 10을 초과하는 숫자는 100으로 반환하는 메소드");  // 프로그램 이름
		System.out.println("3을 넣었더니 " + mt.changeNumber(3) + "이 나왔다!");  // 10이하의 수를 넣었을 떄의 결과
		System.out.println("49를 넣었더니 " + mt.changeNumber(49) + "이 나왔다!");  // 10을 초과하는 수를 넣었을 때의 결과
		
		// 4. 5개의 정수 중 평균을 반환하는 메소드
		// 매개변수o(배열이용), 리턴값o
		// 메소드명 : getAvg
		
		System.out.println("4. 5개의 정수 중 평균을 반환하는 메소드.");  // 프로그램 이름
		int[] number = {1, 2, 3, 4, 5};  // 배열선언 및 초기화
		System.out.println("1, 2, 3, 4, 5의 평균을 알려드림: " + mt.getAvg(number));  // 결과 출력 
		
		// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
		// 매개변수o(배열), 리턴값x
		// 메소드명 printMinMax
		
		System.out.println("5. 정수 배열 중 최대값과 최소값을 출력하는 메소드.");  // 프로그램 이름
		int[] number2 = {5, 9, 4, 12, 1};  // 배열 선언 및 초기화
		mt.printMinMax(number2);  // 결과 출력
		
		// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		// BaNanA -> bAnANa
		// 메소드명 : changeCase
		// 매개변수와 리턴값 자유 => 단, 형변환 이용할 것
		
		System.out.println("6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드.");  // 프로그램 이름
		mt.changeCase("bAnANa");  // 결과 출력
		
		// 7. 아이디와 비밀번호를 입력받아 로그인하기
		// 매개변수 o, 리턴값 o(boolean 타입)
		// 메소드명 : login
		// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
		// 둘 중 하나라도 틀리면 잘못입력했습니다 출력
		
		System.out.println("7. 아이디와 비밀번호를 입력받아 로그인하기.");  // 프로그램 이름
		System.out.println(mt.login("admin", 1234) ? "관리자님 환영합니다." : "잘못입력했습니다.");  // 결과 출력
	}
	
	// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드

	// 리턴 타입 : void => int
	// 매개변수 : int num
	// 실행할 문장 : num => -num, -num => num
	// 리턴값 result로 저장
	
	int changeSign(int num) {  // int형 매개변수를 넣어주고 리턴타입을 int로 맞춘다
		num = -num;  // 입력받은 정수의 부호를 바꿔서 저장한다
		int result = num;  // 저장된 변수를 결과에 저장
		
		return result;  // 결과
	}
	
	// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
	// 매개변수 o, 리턴값 o
	// 메소드명 : printName
	
	// 리턴 타입 : void => String
	// 매개변수 : String name, int num
	// 실행할 문장 : name을 num만큼 출력
	// 리컨값 : result에 저장
	
	String printName(String name, int num) {  // String형과 int형 매개변수를 받고 리턴 타입을 String으로 한다
		// 결과 저장할 result 변수 선언
		// for문 num만큼 반복
		// result에 더해서 대입
		// result에 결과 저장
		String result = "";  // 결과를 저장할 변수 선언
		for(int i=0; i<num; i++) {  // 입력받은 수 만큼 반복
			result += name;  // 결과 누적 저장
		}
		return result;  // 결과
	}
	
	// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
	// 매개변수o, 리턴값o
	// 메소드명 : chageNumber
	
	// 리턴 타입 : void => int
	// 매개변수 : int num
	// 실행할 문장 : 10 이하는 1로 10 초과는 100으로
	// 리턴값 result에 저장
	int changeNumber(int num) {  // int형 매개변수를 받고 리턴 타입을 int형으로 한다
		// 결과를 저장할 변수 선언
		// 입력 받은 숫자가 10이하인지 아닌지 판단하는 if문
		// 변수에 결과 저장
		// return result
		
		int result = 0;  // 결과를 저장할 변수 선언
		if(num <= 10) {  // 입력받은 수가 10이하라면
			result = 1;  // 결과에 1 저장
		} else {  // 10을 초과한다면
			result = 100;  // 결과에 100 저장
		}
		return result;  // 저장된 결과 return
	}
	
	// 4. 5개의 정수 중 평균을 반환하는 메소드
	// 매개변수o(배열이용), 리턴값o
	// 메소드명 : getAvg
	
	// 리턴 타입 : void => double
	// 매개변수 : int[] num
	// 실행할 문장 : 5개의 수의 합과 평균을 구한다
	// 리턴값 result에 저장
	
	double getAvg(int[] num) {  // 리턴타입 double로 하는 메소드 생성 배열을 매개변수로 받는다
		// 총합과 평균을 저장할 변수 선언
		// for문
		// 5번 반복하면서 배열에 저장된 수들의 합 구하기
		// 평균 계산
		// 평균값 return
		
		int sum = 0;  // 총합을 저장할 변수
		double avg = 0;  // 평균을 저장할 변수
		for(int i=0; i<num.length; i++) {  // 5번 반복
			sum += num[i];  // 배열에 저장된 수들을 모두 합한다
		}
		avg = (double)sum / num.length;  // 평균을 실수형으로 저장
		return avg;  // return
	}
	
	// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
	// 매개변수o(배열), 리턴값x
	// 메소드명 printMinMax
	
	// 리턴 타입 : void
	// 매개변수 : int[] num
	// 실행할 문장 : 최대값과 최소값을 구해서 저장 및 출력
	// 리턴값 x
	
	void printMinMax(int[] num) {  // 리턴값 void, 정수형 배열을 매개변수로 한다
		// 최대값과 최소값 저장할 변수 선언
		// for문을 통해 배열의 길이만큼 반복하며 최대값과 최소값 저장
		// 결과 출력
		
		int max = 0, min = 1000000000;  // 최대값과 최소값 선언 및 초기화
		for(int i=0; i<num.length; i++) {  // 배열의 길이만큼 반복
			if(num[i] > max) {  // 0번 부터 4번인덱스까지 값 크기 비교
				max = num[i];  // 최대값 저장
			}
			if(num[i] < min) {  // 0번부터 4번 인덱스까지 값 크기 비교
				min = num[i];  // 최소값 저장
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);  // 결과를 출력
	}
	
	// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	// BaNanA -> bAnANa
	// 메소드명 : changeCase
	// 매개변수와 리턴값 자유 => 단, 형변환 이용할 것
	
	// 리턴 타입 : void
	// 매개변수 : String word
	// 실행할 문장 : 유니코드를 사용해 대문자를 소문자로 바꾼다
	// 리턴값 x
	
	void changeCase(String word) {  // 리턴타입 void, 문자열을 매개변수로 받는다
		// 문자형을 저장할 배열 선언
		// for문을 통해 입력받은 문자열을 문자형으로 하나하나 변환
		// 대문자는 소문자로 소문자는 대문자로 유니코드 변환
		// 결과 출력(for-each)
		
		char alphabet[] = new char[word.length()];  // 문자열의 길이만큼 문자형 배열 생성
		for(int i=0; i<word.length(); i++) {  // 문자열의 길이만큼 반복
			alphabet[i] = word.charAt(i);  // 문자열을 문자형으로 바꿔 한 자리씩 저장
			if((int)alphabet[i] >= 97) {  // 유니코드 크기 비교
				alphabet[i] = (char)(alphabet[i] - 32);  // 소문자는 대문자로 바꾼다
			} else {
				alphabet[i] = (char)(alphabet[i] + 32);  // 대문자는 소문자로 바꾼다
			}
		}
		System.out.print(word + " => ");  // 결과 출력
		for(char data : alphabet) {  // 배열에 저장된 값을 보여준다
			System.out.print(data);  // 출력
		}
		System.out.println();
	}
	
	// 7. 아이디와 비밀번호를 입력받아 로그인하기
	// 매개변수 o, 리턴값 o(boolean 타입)
	// 메소드명 : login
	// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	// 둘 중 하나라도 틀리면 잘못입력했습니다 출력
	
	// 리턴 타입 : void => boolean
	// 매개변수 : String id, int pw
	// 실행 문장 : 저장된 값들과 입력받은 값을 비교
	// 리턴값 boolean
	
	boolean login(String id, int pw) {  // 리턴값 논리형, 문자열과  정수형으로 매개변수
		final String ID = "admin";  // id 설정
		final int PW = 1234;  // pw 설정
		
		if((ID==id) && (PW==pw)) {  // 아이디와 비밀번호가 일치하는 확인
			return true;  // 맞으면 true
		} else {
			return false;  // 아니면 false
		}
	}
}
