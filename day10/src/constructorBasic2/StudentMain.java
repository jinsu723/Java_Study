package constructorBasic2;

//7번 : 기본생성자 확인

class Student {
   // 필드
   String name;
   int age;

   // 기본생성자
   public Student() {
      System.out.println("기본생성자가 호출되었습니다");
      this.name = "길진수";
   }
}

public class StudentMain {
   public static void main(String[] args) {
      Student st = new Student(); //객체 생성시 기본생성자 호출
      Student st1 = new Student();
      st.name = "짱구";
      System.out.println(st.name);
      System.out.println(st1.name);
   }
}