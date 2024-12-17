package review2;

public class Main {
   public static void main(String[] args) {
//      Book 클래스 
//      필드
//         title, author
//
//      생성자
//      기본 생성자 : 제목과 작가를 "알수없음"으로 초기화
//      매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화
//      매개변수 생성자 : 제목과 작가를 모두 받아 초기화
//
//      EBook 클래스 Book 클래스를 상속
//      필드
//         sizeInMB
//
//      생성자
//      기본 생성자
//         super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//      매개변수 생성자 
//         제목, 작가, 크기를 받아 초기화

      Book book1 = new Book();
      System.out.println(book1.title);
      Book book2 = new Book("자바프로그래밍");
      System.out.println(book2.title);
      System.out.println(book2.author);
      Book book3 = new Book("java", "오라클");
      System.out.println(book3.title + "의 저자 " + book3.author);
      EBook ebook = new EBook();
      System.out.println(ebook.sizeInMB);

   }
}
