package review2;

public class EBook extends Book {
//   EBook 클래스 Book 클래스를 상속
//   필드
//      sizeInMB
//
//   생성자
//   기본 생성자
//      super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//   매개변수 생성자 
//      제목, 작가, 크기를 받아 초기화

   // 필드
   double sizeInMB;

   // 생성자
   public EBook() {
      this("알수없음", "알수없음", 0);
   }

   public EBook(String title, String author, double sizeInMB) {
      super(title, author);
      this.sizeInMB = sizeInMB;
   }

}