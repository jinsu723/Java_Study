package wrapperTest;

public class WrapperTest02 {
   public static void main(String[] args) {
      
      int num = 10;
      double num2 = 1.5;
      printObject(num);
      Object obj = 10;
      System.out.println(obj);
      
      
   }
   
   static void printObject(Object obj) {
      System.out.println(obj);
   }
}