package task;

import java.util.Scanner;

public class TeamTask01 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int money =0, in = 0, out = 0, choice = 0, num = 0;
//		int cola = 1500, si = 1500, power = 2000;
//		
//		System.out.println("돈을 넣으세요");
//		money = sc.nextInt();
//		
//		String menu = "음료의 번호를 선택하세요 \n" + "1. 콜라 : 1500\n" + "2. 사이다 : 1500\n" + "3. 파워에이드 : 2000\n" + "4. 잔액반환\n" + "선택 : ";
//		
//		System.out.println(menu);
//		choice = sc.nextInt();
//		
//		while(!(choice == 4)) {		
//			switch(choice) {
//			case 1:
//				System.out.println("콜라 몇 개?");
//				num = sc.nextInt();
//				System.out.println(num + "개 선택함. 가격은 " + (num * cola) + "원");
//				System.out.println();
//				if(money < num*cola) {
//					System.out.println("!!잔액 부족!!");
//					System.out.println();
//					System.out.println(menu);
//					choice = sc.nextInt();
//					break;
//				}
//				money = money - (num * cola);
//				System.out.println("*****당신의 잔액 : " + money + "*****");
//				System.out.println();
//				System.out.println(menu);
//				choice = sc.nextInt();
//				break;
//			case 2:
//				System.out.println("사이다 몇 개?");
//				num = sc.nextInt();
//				System.out.println(num + "개 선택함. 가격은 " + (num * si) + "원");
//				System.out.println();
//				if(money < num*si) {
//					System.out.println("!!잔액 부족!!");
//					System.out.println();
//					System.out.println(menu);
//					choice = sc.nextInt();
//					break;
//				}
//				money = money - (num * si);
//				System.out.println("*****당신의 잔액 : " + money + "*****");
//				System.out.println();
//				System.out.println(menu);
//				choice = sc.nextInt();
//				break;
//			case 3:
//				System.out.println("파워에이드 몇 개?");
//				num = sc.nextInt();
//				System.out.println(num + "개 선택함. 가격은 " + (num * power) + "원");
//				System.out.println();
//				if(money < num*power) {
//					System.out.println("!!잔액 부족!!");
//					System.out.println();
//					System.out.println(menu);
//					choice = sc.nextInt();
//					break;
//				}
//				money = money - (num * power);
//				System.out.println("*****당신의 잔액 : " + money + "*****");
//				System.out.println();
//				System.out.println(menu);
//				choice = sc.nextInt();
//				break;
//			}
//			
//		}
//		System.out.println("잔돈 반환 완료..");
//		System.out.println("프로그램 종료");
//		
//	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputMoney = 0; // 내가 넣은 금액
		int choice = 0; // 선택장애 ON
		int item_count = 0; // 아이템의 갯수
		int zzalzzal = 0; // 짤짤이
		boolean running = true; // while문은 오로지 True와 False로 판단하기 때문에 boolean타입으로 while문 동작방식 제어하기
		final int item1 = 2500; // 콜라의 가격
		final int item2 = 2000; // 사이다의 가격
		final int item3 = 4000; // 커피의 가격
		int total_item_pay = 0; // 아이템 총합

		System.out.print("깁 미 머니 ~ : ");
		inputMoney = input.nextInt();
		System.out.println(inputMoney + "원을 넣으셨습니다.\n");
		if (inputMoney >= 1) { // 넣은 돈이 양수인가 음수인가 판단
			while (running) { // while문은 True or False로 판단하기 때문에 변수 불러오는거~
				System.out.println("원하시는 메뉴를 골라주세요.\n" + "1. 콜라 : 2500원\n" + "2. 사이다 : 2000원\n" + "3. 커피 : 4000원\n"
						+ "4. 돈 배출\n" + "원하시는 음료수의 번호를 입력 해 주세요 : ");
				choice = input.nextInt();
				input.nextLine();

				switch (choice) {
				case 1:
					System.out.println("콜라를 선택하셨습니다."); // 콜라를 선택했다는 내용 출력
					System.out.print("음료수의 갯수를 입력 해 주세요 :"); // 선택장애 일으키게 하는 멘트 완벽
					item_count = input.nextInt(); // 갯수이므로 정수형으로 입력 받기
					System.out.println("콜라 " + item_count + "개를 선택하셨습니다."); // 어떤 선택을 했는지 확실하게 보여주기
					total_item_pay = item1 * item_count; // 최종 가격을 계산하기 위해 total_item_pay 변수에 음료가격x음료갯수
					zzalzzal = inputMoney - total_item_pay; // 짤짤이 반환을 위해 내가 넣은 금액과 자판기의 최종가격을 뺴줘서 짤짤이 뱉어주기
					input.nextLine(); // 버퍼 초기화(왜? nextInt였으니 이녀석은 버퍼초기화를 못함)
					if (inputMoney >= total_item_pay) { // 만약 내가 넣은 돈이 넉넉하다~
						System.out.println("콜라 " + item_count + "개를 배출할게용~ \n잔돈" + zzalzzal + "원 받고 잘가용"); // 음료 배출 후
																											// 잘가라고 알려주기
						running = false; // while문을 끝내기 위해 위에 지정한 running부분을 True에서 False로 지정해서 While문 까지 탈주
						break; // 급제동
					} else { // 넉넉하지 않는 거지가 이득까지 볼려고 한다~
						System.out.println("금액이 부족합니다."); // 돈이 부족하다고 한 후 선택장애의 길로 보내버리기
					}
					break;// 급제동~~~
				case 2:
					System.out.println("사이다를 선택하셨습니다.");
					System.out.print("음료수의 갯수를 입력 해 주세요 :");
					item_count = input.nextInt();
					System.out.println("사이다 " + item_count + "개를 선택하셨습니다.");
					total_item_pay = item2 * item_count;
					zzalzzal = inputMoney - total_item_pay;
					input.nextLine();
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
					item_count = input.nextInt();
					System.out.println("커피 " + item_count + "개를 선택하셨습니다.");
					total_item_pay = item3 * item_count;
					zzalzzal = inputMoney - total_item_pay;
					input.nextLine();
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
		} else {
			System.out.println("으악 도둑이다 프로그램 종료");
		}

		input.close();// 얘는 switch에 넣으면 while문 때문에 다음 선택지로 이동하게 됨
						// 즉, 돈도 잃고 먹기 싫은 음료 억지로 먹게 됨
	}
}
