package review2;

public class Book {
//   필드
//      title, author
//
//   생성자
//   기본 생성자 : 제목과 작가를 "알수없음"으로 초기화
//   매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화
//   매개변수 생성자 : 제목과 작가를 모두 받아 초기화

   // 필드
   String title;
   String author;

   // 생성자
   public Book() {
      this("알수없음", "알수없음");
   }

   public Book(String title) {
      this(title, "알수없음");
   }

   public Book(String title, String author) {
      this.title = title;
      this.author = author;
   }

}
