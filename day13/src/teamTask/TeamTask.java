package teamTask;

import java.util.Scanner;

public class TeamTask {
   int point;
   int comPoint;
   int choice;
   int myCard[];
   boolean isTrue;
   final int DEAD = 21;
   String msg = "1번. 히트(카드 1장받기)\r\n" + "2번. 스탠드(나의 모든 턴 종료) : ";

   void playGame(int card[]) {
//      int dealerPoint = (int) (Math.random() * 13) + 1;
//      System.out.println(dealerPoint);
      Scanner scan = new Scanner(System.in);

      System.out.println("게임을 시작합니다");
      System.out.println("기본으로 2장을 받습니다");

      gameSetting(card);// 카드 2장 뽑
      comPoint = (int) (Math.random() * 5) + 17;

      isTrue = true;
      while (isTrue) {
         printResult(card);
         point = printMyCard(card);

         System.out.print(msg);
         choice = scan.nextInt();
         switch (choice) {
         case 1:
            drawCard(card);
            point = printMyCard(card);
            break;
         case 2:
            point = printMyCard(card);
            isWin(comPoint, point);
            printResult(card);
            isTrue = false;
            break;
         default:
            System.out.println("다시 입력");
            continue;
         }

         if (point > DEAD) {
            System.out.println("버스트!");
            System.out.println("딜러 승!");
            printResult(card);
            break;
         }

      }
   }

   // 처음에 카드 2장 받고 시작
   void gameSetting(int card[]) {
      drawCard(card);
      drawCard(card);
   }

   // 카드 한장 뽑기
   void drawCard(int card[]) {
      int idx = 0;
      for (int i = 0; i < card.length; i++) {
         if (card[i] == 0) {
            idx = i;
            break;
         }
      }
      card[idx] = (int) (Math.random() * 13) + 1;
   }

   // 내 총점 계산
   int printMyCard(int card[]) {
      int sum = 0;
      for (int i = 0; i < card.length; i++) {
         if (card[i] == 0) {
            System.out.println("총 점수 : " + sum);
            return sum;
         }
         sum += card[i];
      }
      return 0;
   }

   char[] clacResult(int card[]) {
      int idx = 0;
      for (int i = 0; i < card.length; i++) {
         if (card[i] == 0) {
            idx = i;
            break;
         }
      }
      char result[] = new char[idx];
      for (int i = 0; i < idx; i++) {
         if (card[i] == 13)
            result[i] = 'K';
         else if (card[i] > 11)
            result[i] = 'Q';
         else if (card[i] > 10)
            result[i] = 'J';
         else if (card[i] == 1)
            result[i] = 'A';
         else
            result[i] = (char) card[i];
      }
      return result;
   }

   void printResult(int card[]) {
      System.out.print("지금까지 나온 카드 : ");
      char result[] = clacResult(card);
      for (char ch : result) {
         if ((int) ch > 1 && (int) ch < 11)
            System.out.print((int) ch + " ");
         else
            System.out.print(ch + " ");
      }
   }

   void isWin(int com, int me) { // cc : 딜러, pc : 사람
      if (com == me) {
         System.out.println("무승부!");
         System.out.print("딜러의 점수 : " + com);
         System.out.print("당신의 점수 : " + me);
      } else if (com > me) { // 사용자 패배
         System.out.println("당신의 패배!");
         System.out.print("딜러의 점수 : " + com);
         System.out.print(" 당신의 점수 : " + me);
      } else { // 사용자 승리
         System.out.println("당신의 승리!");
         System.out.println("당신의 점수 : " + me);
         System.out.println(" 딜러의 점수 : " + com);
      }
   }

}
