package method;

// 2번 :

public class StackMethod {
   public static void main(String[] args) {
      StackMethod sm = new StackMethod();
      // 1. main메소드 실행 -> 스택에 main 스택프레임이 생성
      //    변수 result가 main 스택 프레임에 저장된다
      // 2. add메소드 호출 -> 스택에 add 스택프레임이 생성
      // 	매개변수 num1, num2, sum변수가 add 스택프레임에 저장됨
      // 3. add 메소드 종료 -> add 스택 프레임 삭제
      //	sum, num1, num2가 메모리에서 제거됨
      // 4. main메소드 종료 -> main 스택 프레임 삭제
      
      int result = sm.add(10, 20);
      System.out.println(sm);
      
   }
   
   int add(int num1, int num2) {
      int sum = num1 + num2;   
      return sum;
   }
}
