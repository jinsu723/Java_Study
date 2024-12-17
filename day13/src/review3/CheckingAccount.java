package review3;

public class CheckingAccount extends Account{
//   CheckingAccount 클래스
//   메소드
//      withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
   
   //생성자
   public CheckingAccount(double balance) {
      super(balance);
   }

   //오버라이딩
   @Override
   void withdraw(double amount) {
      double totalAmount = amount + 1000;
      if(this.balance < totalAmount) {
         System.out.println("잔액부족! 출금 실패");
      }else {
         this.balance -= totalAmount;
         System.out.println("출금된 금액 : " + amount +", 수수료 : 1000원, 현재잔액 : " + this.balance);
      }
   }
   
}
