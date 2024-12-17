package task;

import java.util.Random;
import java.util.Scanner;

// 공백(0100) 문제3
public class Task03 {
	public static void main(String[] args) {
//		- **문제 3. 랜덤다이스 만들기**
//	    
//	    주사위를 돌려서 같은 수 두 번이 나올 때 까지 던진다. 몇번째에 성공하는지 횟수를 계산해야 하고, 메서드에 이름을 입력하면 그 사람의 결과가 출력된다
//	    
//	    "연속으로 같은 수 나오기 성공"
//	    "김태현님은 총 몇 번 성공하셨습니다" 출력
//	    
//	    메소드명은 randomDice, 리턴값은 없음, 매개변수는 문자열 변수 사용
//	    
//	    - 출제 의도 -< while문, 증감연산자, if문, 기타제어문>
//	    
//	    - 추가 요소
//	    Random random = new Random();를 사용
//	    random.nextInt(a)+b (:b부터 a까지의 수를 랜덤으로 뽑음)을 사용
		
		// 입력메소드 import
		// 이름 저장할 변수 선언
		// 객체 선언
		
		System.out.println("*****랜덤다이스 만들기*****");  // 프로그램 이름
		
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		System.out.println("이름을 입력하세요.");  // 사용자에게 입력값 요구
		String name = sc.nextLine();  // 이름 입력받아 저장하기
		sc.close();  // 자원 닫기
		
		Task03 t = new Task03();  // 객체 생성
		
		t.randomDice(name);  // 메소드 실행
	}
	
	// 리턴값 : X
	// 매개변수 문자열
	// Random 메소드 import
	// 반복문 while
	// 같은 수가 연속 2번 나올 때까지 반복 시도바다 횟수 카운트
	// 앞 시도의 숫자 저장할 변수 선언, 뒷 시도의 숫자 저장할 변수 선언
	// 두 숫자 비교
	// 맞으면 결과 출력하고 빠져나오기
	
	void randomDice(String name) {  // 메소드 선언 매개변수 문자열
		Random rd = new Random();  // 랜덤메소드 import
		int num1 = rd.nextInt(1, 7), num2 = rd.nextInt(1, 7), count = 0;
		// 1~6까지 나오게 할 주사위2개, 횟수를 셀 변수 1개 선언
		while(true) {  // 반복실행
			System.out.println((count+1) + "번째 시도...");  // 횟수 세어주기
			System.out.println("num1 : " +num1);  // 앞에 나온 숫자
			System.out.println("num2 : " +num2);  // 뒤에 나온 숫자
			if(num1 == num2) {  // 두 숫자가 같다면
				count++;  // 횟수 카운트
				System.out.println();  // 줄 띄우기
				System.out.println("연속으로 같은 수 나오기 성공");  // 축하메시지
				System.out.println(name + "님은 총 " + (count) + "번만에 성공하셨습니다");  // 결과 출력
				break;  // 메소드 종료
			} else {  // 두 숫자가 같지 않으면
				count++;  // 횟수 +1
				System.out.println("-----실패!-----");  // 실패
				System.out.println();  // 줄 띄우기
				num1 = num2;  // 뒤에 나온 숫자를 앞에 나온 숫자로 저장
				num2 = rd.nextInt(1, 6);  // 뒷 숫자를 새로 뽑는다
			}
		}
	}
}
