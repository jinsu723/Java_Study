package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
//		공백(0100)                                                           
//		문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
//		   구구단은 1단부터 9단까지다.
//		   사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
//		   (이중 for 문 사용, if 사용 X)
//
//		[입출력예시]
//		구구단을 어디까지 출력할까요? : 4
//		1 * 1 = 1   2 * 1 = 2   3 * 1 = 3   4 * 1 = 4   
//		1 * 2 = 2   2 * 2 = 4   3 * 2 = 6   4 * 2 = 8   
//		1 * 3 = 3   2 * 3 = 6   3 * 3 = 9   4 * 3 = 12   
//		1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16   
//		1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   
//		1 * 6 = 6   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   
//		1 * 7 = 7   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   
//		1 * 8 = 8   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   
//		1 * 9 = 9   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36

		// 입력 메소드 import
		// 변수 선언(단 입력)
		// 출력메시지 '구구단을 어디까지 출력할까요?'
		// 이중 for문 사용하여 결과값 출력

		Scanner sc = new Scanner(System.in); // 입력 메소드 import

		System.out.println("***구구단을 출력해주는 프로그램***"); // 프로그램 이름

		int num1; // 입력받을 변수 선언
		System.out.print("구구단을 어디까지 출력할까요? : "); // 사용자에게 입력값 요구
		num1 = sc.nextInt(); // 입력값 저장

		for (int i = 1; i < 10; i++) { // 행
			for (int j = 1; j <= num1; j++) { // 열
				System.out.print(j + " * " + i + " = " + i * j + "\t"); // 결과 출력
			}
			System.out.println(); // 줄을 바꾼다
		}
		sc.nextLine(); // 버퍼 비우기

//
//		문제 2. UP&DOWN 게임
//		   게임의 정답은 정해놓는다.
//		   사용자에게 1 ~ 50까지의 정수를 입력 받고, 입력 받은 값이 정답보다 크면 "DOWN!"을 출력한다
//		   정답보다 작으면 "UP"을 출력한다.
//		   정답이 아닐 경우 "값을 다시 입력해 주세요 : " 를 출력한 후, 값을 다시 입력 받는다.
//		   정답을 맞히면 "정답입니다 *번 째에 맞혔습니다!"를 출력하고 프로그램을 종료한다.
//		   단, 1 ~ 50까지의 정수 범위를 벗어나면 "1 ~ 50까지의 숫자만 입력해주세요 : " 를 출력한다.

		// 변수 선언(정답, 입력변수, range, game, 시도한 횟수)
		// 출력메시지 '값을 입력해 주세요'
		// 값 저장
		// 입력한 수의 범위 확인
		// 저장한 값과 정답 비교
		// 정답이라면 n번째에 맞혔습니다 후 종료
		// 아니라면 다시 입력값 요구

		System.out.println("***UP & DOWN GAME***"); // 프로그램 이름

		int num2 = 0, count = 1; // 입력값, 시도 횟수 선언
		final int GAME_NUMBER = 23; // 상수 선언 및 저장
		boolean range = true; // 입력값의 범위를 확인할 변수
		boolean game = true; // 정답이 맞게 나올 때까지 계속 시도하게 해줄 변수

		System.out.println("값을 입력해 주세요"); // 사용자에게 입력값 요구
		num2 = sc.nextInt(); // 입력값 저장

		while (range) { // 범위 판단하기
			if (num2 < 1) { // 입력값이 1보다 작으면
				System.out.print("1 ~ 50까지의 정수만 입력해 주세요 : "); // 경고메시지
				num2 = sc.nextInt(); // 입력값 저장
				range = true; // 반복
			} else if (num2 > 50) { // 입력값이 50보다 크면
				System.out.print("1 ~ 50까지의 정수만 입력해 주세요 : "); // 경고메시지
				num2 = sc.nextInt(); // 입력값 저장
				range = true; // 반복
			} else { // 위의 조건들에 해당사항이 없음
				break; // 반복문 탈출
			}
		}

		while (game) { // 정답과 비교하기
			if (num2 > GAME_NUMBER) { // 입력값이 더 크면
				System.out.println("DOWN!"); // 힌트
				System.out.println("값을 다시 입력해 주세요"); // 입력값 요구
				num2 = sc.nextInt(); // 입력값 저장
				count++; // 시도 횟수에 1 추가
				game = true; // 반복
			} else if (num2 < GAME_NUMBER) { // 입력값이 더 작으면
				System.out.println("UP!"); // 힌트
				System.out.println("값을 다시 입력해 주세요"); // 입력값 요구
				num2 = sc.nextInt(); // 입력값 저장
				count++; // 시도 횟수에 1 추가
				game = true; // 반복
			} else { // 정답
				System.out.println("정답입니다 " + count + "번 째에 맞혔습니다!"); // 축하메시지
				game = false; // 게임 종료
			}
		}

		sc.nextLine(); // 버퍼 비우기

//		JAV탕
//		문제1) 입력한 갯수만큼 늘어나는 반칸 다이아 만들기
//		     *
//		    * *   
//		   * * *
//		  * * * *
//		 * * * * *    
//		* * * * * * 
//		 * * * * *
//		  * * * *
//		   * * *
//		    * *
//		     *
//

		// 변수 선언(입력받을 값)
		// 출력 메시지 '숫자 입력'
		// 입력값 저장
		// 위쪽 반판 만들기
		// 아래쪽 반판 만들기

		System.out.println("***DIAMOND***"); // 프로그램 이름

		int num3 = 0; // 변수 선언

		System.out.print("숫자 입력 : "); // 입력값 요구
		num3 = sc.nextInt(); // 입력값 저장

		for (int i = 0; i < num3; i++) { // 윗 반판 만들기
			for (int j = 0; j < num3 - i; j++) { // 공백으로 채울 칸 정하기
				System.out.print(" "); // 모양 잡기 위해 공백으로 하기
			}
			for (int j = 0; j <= i; j++) { // *을 체울 칸 정하기
				System.out.print("* "); // * 출력
			}

			System.out.println(); // 줄바꿈
		}

		for (int i = 1; i < num3; i++) { // 아래 반판 만들기
			for (int j = 0; j <= i; j++) { // 공백으로 체울 칸 정하기
				System.out.print(" "); // 모양 잡기 위해 공백으로 하기
			}
			for (int j = 0; j <= num3 - i - 1; j++) { // * 을 넣을 칸 정하기
				System.out.print("* "); // * 출력
			}

			System.out.println(); // 줄바꿈
		}

		sc.nextLine(); // 버퍼 비우기

//		문제2) 금액을 넣어주세요 : 입력값
//		   메뉴 출력 1~4번까지
//		      1 콜라 : 2500
//		      2 사이다 : 2000
//		      3 커피 : 4000
//		      4 잔액반환
//		   거스름돈과 잔액부족 표시 출력하고
//		   음료수가 나왔습니다 메시지 출력
//		   음료수 갯수 n 개 표현
//		   음료수 나오거나 잔액부족하면 종료시키기
//

		// 변수 선언(넣은 금액, 선택한 수, 음료의 개수, 잔돈, while제어하기 위한 변수, 각 음료의 가격, 가격 총 합
		// 출력메시지 '돈을 넣어주세요'
		// 입력받아저장
		// 값이 양수인지 판단
		// 반복문
		// 메뉴 보여주기
		// 메뉴 선택
		// 갯수 선택
		// 총 합과 결제 후 금액 계산, 저장
		// 결과 메시지 출력

		System.out.println("***자 판 기***");

		int inputMoney = 0; // 내가 넣은 금액
		int choice = 0; // 음료 선택 변수
		int item_count = 0; // 아이템의 갯수
		int zzalzzal = 0; // 잔돈
		boolean running = true; // true값을 넣어줘서 일단 한 번 은 실행시킨다
		final int ITEM1 = 2500; // 콜라의 가격
		final int ITEM2 = 2000; // 사이다의 가격
		final int ITEM3 = 4000; // 커피의 가격
		int total_item_pay = 0; // 아이템 총합

		System.out.print("깁 미 머니 ~ : "); // 입력값 요구
		inputMoney = sc.nextInt(); // 입력값 저장
		System.out.println(inputMoney + "원을 넣으셨습니다.\n"); // 입력값 확인
		if (inputMoney >= 1) { // 넣은 돈이 양수인가 음수인가 판단
			while (running) { // 일단 한 번은 실행
				System.out.println("원하시는 메뉴를 골라주세요.\n" + "1. 콜라 : 2500원\n" + "2. 사이다 : 2000원\n" + "3. 커피 : 4000원\n"
						+ "4. 돈 배출\n" + "원하시는 음료수의 번호를 입력 해 주세요 : "); // 메뉴 보여주기
				choice = sc.nextInt(); // 입력값 저장
				sc.nextLine(); // 버퍼 비우기

				switch (choice) { // 선택에 따른 결과 출력
				case 1: // 1입력
					System.out.println("콜라를 선택하셨습니다."); // 선택한 메뉴 출력
					System.out.print("음료수의 갯수를 입력 해 주세요 :"); // 갯수 받기
					item_count = sc.nextInt(); // 입력값 저장
					System.out.println("콜라 " + item_count + "개를 선택하셨습니다."); // 입력값 확인
					total_item_pay = ITEM1 * item_count; // 총 결제 금액 저장
					zzalzzal = inputMoney - total_item_pay; // 넣은 금액에서 총 금액을 뺀 값을 저장
					sc.nextLine(); // 버퍼 초기화
					if (inputMoney >= total_item_pay) { // 내가 넣은 금액이 더 많음
						System.out.println("콜라 " + item_count + "개를 배출할게용~ \n잔돈" + zzalzzal + "원 받고 잘가용"); // 결과 출력
						running = false; // 반복문 종료
						break; // 탈출
					} else { // 총 합이 더 많다
						System.out.println("금액이 부족합니다."); // 결과 출력
					}
					break; // 탈출
				case 2:
					System.out.println("사이다를 선택하셨습니다.");
					System.out.print("음료수의 갯수를 입력 해 주세요 :");
					item_count = sc.nextInt();
					System.out.println("사이다 " + item_count + "개를 선택하셨습니다.");
					total_item_pay = ITEM2 * item_count;
					zzalzzal = inputMoney - total_item_pay;
					sc.nextLine();
					if (inputMoney >= total_item_pay) {
						System.out.println("사이다" + item_count + "개를 배출할게용~ \n잔돈" + zzalzzal + "원 받고 잘가용");
						running = false;
						break;
					} else {
						System.out.println("금액이 부족합니다.");
						running = false;
						break;
					}
				case 3:
					System.out.println("커피를 선택하셨습니다.");
					System.out.print("음료수의 갯수를 입력 해 주세요 :");
					item_count = sc.nextInt();
					System.out.println("커피 " + item_count + "개를 선택하셨습니다.");
					total_item_pay = ITEM3 * item_count;
					zzalzzal = inputMoney - total_item_pay;
					sc.nextLine();
					if (inputMoney >= total_item_pay) {
						System.out.println("커피" + item_count + "개를 배출할게용~ \n잔돈" + zzalzzal + "원 받고 잘가용");
						running = false;
						break;
					} else {
						System.out.println("금액이 부족합니다.");
						running = false;
						break;
					}
				case 4:
					System.out.println(inputMoney + "원을 반환합니다.");
					running = false;
					break;
				default:
					System.out.println("?");
					break;
				}
			}
		} else { // 넣은 돈이 음수라면
			System.out.println("으악 도둑이다 프로그램 종료"); // 결과 출력
		}

		sc.close(); // 버퍼 비우기

//		JAVA요
//		문제 1 : 점심 선택 및 가격 확인
//		   사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
//		   - 점심 메뉴 4가지에서만 가능하다
//		      짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
//		   - 올바른 메뉴를 입력할 때까지 반복합니다.
//		   - 잘못된 메뉴를 입력하면 다시 입력받습니다.
//

		// 변수 선언
		// 반복문 실행
		// 출력메시지'메뉴'
		// 입력값 받아 저장
		// 입력값과 변수 비교
		// 결과 출력

		System.out.println("***점심메뉴 고르기 + 타자연습***"); // 프로그램 이름

		int numj = 5000, nump = 8000, numz = 25000, numh = 6000; // 변수 선언
		String jang = "짜장", pig = "돈까스", za = "피자", hem = "햄버거", input1 = ""; // 메뉴의 이름을 String으로 지정해서 변수에 저장
		boolean cham = true; // 반복문 while을 제어하기 위한 True, False를 Boolean타입 지정

		while (cham) { // 반복문 실행
			System.out.print("짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)\n 메뉴를 고르세요 : "); // 메뉴 보여주기
			input1 = sc.nextLine(); // 입력값 저장

			if (input1.equals(jang)) { // 맞게 썼나
				System.out.println("선택하신 메뉴는 " + jang + " 이고 " + numj + "원 입니다."); // 결과 출력
				cham = false; // 탈출
			} else if (input1.equals(pig)) {
				System.out.println("선택하신 메뉴는 " + pig + " 이고 " + nump + "원 입니다.");
				cham = false;
			} else if (input1.equals(za)) {
				System.out.println("선택하신 메뉴는 " + za + " 이고 " + numz + "원 입니다.");
				cham = false;
			} else if (input1.equals(hem)) {
				System.out.println("선택하신 메뉴는 " + hem + " 이고 " + numh + "원 입니다.");
				cham = false;
			} else { // 위 조건들에 해당사항이 없다
				System.out.println("재입력"); // 재입력 요구
			}

		}

		sc.nextLine(); // 버퍼 비우기

//		문제 2 : 문자의 아스키코드 값 확인
//		   사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
//		   사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
//		   'A'를 입력하면 종료하고 종료 메시지를 출력한다
//

		// 변수 선언
		// 출력메시지'문자를 입력하세요'
		// String 입력 받아 char 형태로 형변환 뒤 저장
		// 만약 A를 입력했다면 프로그램 종료
		// 아니라면 변환된 아스키 코드 출력

		System.out.println("***아스키 코드 공부***"); // 프로그램 이름

		final char finish = 'A'; // A값은 탈출하는 문자이기 때문에 상수로 지정
		while (true) { // while문 제어없이 반복하기
			System.out.print("문자를 입력하세요 : "); // 출력~~~

			char input = sc.next().charAt(0); // 입력 받는 next는 char가 아닌 String으로 와야 해서 String으로 형변환

			if (input == finish) { // 만약 입력 받은 값이 finish변수와 같다면
				System.out.println("프로그램 종료");
				break; // 반복문 탈출하기
			}

			System.out.println(input + " " + (int) input); // 입력 받은 값을 아스키코드로 변환해주기
		}
		sc.nextLine(); // 버퍼 비우기

//		I팀
//		1. 업다운문제
//		   초기 숫자 상수로 정하고 숫자 3회 입력
//		     > (상수 > 입력) : up 출력
//		     > (상수 < 입력) : down 출력
//

		// 변수 선언(정답, 입력)
		// 출력메시지 '정수를 입력하시오'
		// 반복문 3번
		// 결과 출력

		System.out.println("***UP & DOWN 2***"); // 프로그램 이름

		int no1 = 0; // 입력받을 값 선언
		final int GAME_NUMBER2 = 4; // 게임의 정답 상수

		for (int i = 0; i < 3; i++) { // 3번의 시도
			System.out.println("정수를 입력하세요 3번까지 가능"); // 입력값 요구
			no1 = sc.nextInt(); // 입력값 저장
			if (no1 < GAME_NUMBER2) { // 입력한 값이 작다
				System.out.println("up"); // 힌트
			} else if (no1 > GAME_NUMBER2) { // 입력한 갑시 크다
				System.out.println("DOWN"); // 힌트
			} else { // 정답
				System.out.println("정답입니다."); // 축하메시지
				break;
			}
		}
		sc.nextLine(); // 버퍼 비우기

//		2. OX 퀴즈 (2문제만 존재함) 
//		   1번 못 맞추면 프로그램 종료
//		         1번 맞추면 2번 문제로 넘어가기
//
//		1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 : X
//		2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : O
//
//		(모든 문제를 맞춘 경우)
//		1번문제를 맞힐경우 정답입니다 2번문제로 넘어갑니다 출력
//		2번문제도 맞힐경우 정답입니다 모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다. 출력 후 프로그램 종료
//
//		(1번문제를 틀린인 경우)
//		1번문제를 틀린경우 틀렸습니다. 출력 후 프로그램 종료(다음문제로 넘어가지 않음)
//

		// 변수 선언(퀴즈의 답 입력2)
		// 출력 메시지'문제'
		// 1번 문제 답 저장
		// 값 비교
		// 맞으면 다음 문제 틀리면 끝
		// 2번문제 답 저장
		// 값 비교
		// 맞으면 끝. 틀려도 끝

		System.out.println("***O/X 쿠이즈***"); // 프로그램 이름

		String q1 = "", q2 = ""; // 답을 저장할 변수 선언
		System.out.println("1번문제) 아기 화장품은 순해서 어른들이 사용해도 괜찮다?"); // 1번 문제
		q1 = sc.next(); // 1번 문제의 답을 저장한다

		if (q1.equals("X")) { // 1번 문제 정답
			System.out.println("정답입니다. 2번문제로 넘어갑니다."); // 축하
			System.out.println("독사가 자기 혀를 깨물면 죽는다?"); // 2번문제 출력
			q2 = sc.next(); // 2번문제 답 저장

			if (q2.equals("O")) { // 2번문제 정답
				System.out.println("2번 문제도 정답입니다 모든 문제를 맞췄습니다."); // 축하
			} else { // 2번문제 오답
				System.out.println("2번 문제를 틀렸습니다."); // 탈락
			}

		} else { // 1번 문제 오답
			System.out.println("1번문제를 틀렸습니다."); // 탈락
		}

//		보안ER
//		1. 문자 추출 사각형 생성
//		      문자열(3문자 이상)을 받아온다
//		      문자열에서 3번재 위치한 문자로 5*5 크기의 사각형을 출력한다
//		      [출력 예시]
//		            문자열을 입력해 주세요 : hello
//		            l l l l l 
//		            l l l l l 
//		            l l l l l 
//		            l l l l l 
//		            l l l l l
//

		// 메시지 출력'문자열 입력'
		// 변수 선언, 형변환 및 저장
		// 행과 열 만들기
		// 결과 출력

		System.out.println("***문자를 추출해 사각형 만들기***"); // 프로그램 이름

		System.out.println("문자열 3자리 이상 입력하세요"); // 사용자에게 입력값 요구
		char msg = sc.next().charAt(2); // String으로 받은 값을 char로 형변화 하여 저장

		for (int i = 0; i < 5; i++) { // 행
			for (int j = 0; j < 5; j++) { // 열
				System.out.print(msg + " "); // 추출한 값 넣기
			}
			System.out.println(); // 줄 바꾸기
		}

//		1-2(심화) 문자 추출 사각형 생성
//		      문자열(3문자 이상)을 받아온다
//		      문자열에서 3번재 위치한 문자로 5*5 크기의 가운데가 비어있는 사각형을 출력한다
//		      [출력 예시]
//		            문자열을 입력해 주세요 : hello
//		            l l l l l 
//		            l       l 
//		            l       l 
//		            l       l
//		            l l l l l
//

		// 메시지 출력'문자열 입력'
		// 변수 선언, 형변환 및 저장
		// 행과 열 만들기
		// 결과 출력

//		System.out.println("***문자를 추출해 사각형 만들기2***");
//		
//		System.out.println("문자열 3자리 이상 입력하세요");
//		char msg2 = sc.next().charAt(2);
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i == 0 || i == 4) {
//					System.out.print(msg2 + " ");
//				} else {
//					if(j==1 || j==2 || j==3) {
//						System.out.print(msg2);
//					} else {
//						System.out.println("       ");
//					}
//				}
//			}
//			System.out.println();
//		}
		// 가운데에 빈 칸을 만드는 방법을 모르겠습니다

//		2. 평균 성적, 평균 학점 계산
//		  사용자로부터 3과목의 점수를 각각 입력받고 주어진 표에 맞게 계산하여 평균 학점과 평균 성적을 계산하시오
//		  <표>
//		    점수   ㅣ  등급  ㅣ    학점
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		   95-100 ㅣ   A+  ㅣ   (4.5)
//		   90-94  ㅣ   A    ㅣ    (4.0)
//		   85-89  ㅣ   B+  ㅣ    (3.5)
//		   80-84  ㅣ   B    ㅣ    (3)
//		   75-79  ㅣ   C+  ㅣ   (2.5)
//		   75미만  ㅣ   F   ㅣ    (0)
//
//		[출력 예시1]
//		3과목의 성적을 입력해 주세요 : 90 89 98
//		평균 학점 : 4.0
//		평균 성적 : A
//
//		[출력 예시2]
//		3과목의 성적을 입력해 주세요 : 74 74 74
//		평균 학점 : 0.0
//		평균 성적 : F 
//		

		// 변수 선언(점수 3개, 점수 합, 평균, 학점, 등급)
		// 메시지 출력 '성적 입력'
		// 변수 저장
		// 평균 구하기
		// 학점 판별
		// 결과 출력

		System.out.println("***학점 계산기***"); // 프로그램 이름

		int score1, score2, score3, sum; // 정수형 변수 선언
		double evg, score4; // 실수형 변수 선언
		String alpha = ""; // 문자열 변수 선언

		System.out.println("당신의 성적을 입력하세요(띄어쓰기로 구분)"); // 입력값 요구
		score1 = sc.nextInt(); // 점수1 저장
		score2 = sc.nextInt(); // 점수2 저장
		score3 = sc.nextInt(); // 점수3 저장

		sum = score1 + score2 + score3; // 총 합
		evg = sum / 3.0; // 평균

		if (evg >= 95) { // 학점 판별
			alpha = "A+"; // 등급 저장
			score4 = 4.5; // 학점 저장
		} else if (evg >= 90) {
			alpha = "A";
			score4 = 4.0;
		} else if (evg >= 85) {
			alpha = "B+";
			score4 = 3.5;
		} else if (evg >= 80) {
			alpha = "B";
			score4 = 3.0;
		} else if (evg >= 75) {
			alpha = "C+";
			score4 = 2.5;
		} else {
			alpha = "F";
			score4 = 0;
		}
		System.out.println("평균 학점 : " + alpha + "\n평균 성적 : " + score4); // 결과 출력하기

		sc.nextLine(); // 버퍼 비우기
		sc.close(); // 자원 닫기
	}
}
