package method;

// 3번 :

public class StackOverFlow {
   public static void main(String[] args) {
      recursiveMethod();
   }
   
   static void recursiveMethod() {
      recursiveMethod();
//      java.lang.StackOverflowError
//      재귀호출이나 반복적인 메소드 호출로 인해
//      스택 프레임이 계속 쌓여서 스택영역의 크기 제한을 초과하면 발생
      
   }
}