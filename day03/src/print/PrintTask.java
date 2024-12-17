package print;
//10번 : 실습

public class PrintTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //1. printf를 사용해 형식에 맞게 출력하기
	      //이름 : 본인이름 - 문자열
	      //나이 : 본인나이   - 정수형
	      //취미 : 취미      - 문자열
	      //키 : 실수형 2자리까지   - 실수형
	      //몸무게 : 실수형 3자리까지 - 실수형
	      
	      //1) 변수를 선언하고 값을 초기화한다
	      //2) printf 메소드를 사용하여 서식문자에 맞게 지정하고 이스케이프문자로 출력형태를 맞춘다
	      
	      String name = "김영선", hobby = "여행";
	      int age = 20;
	      double height = 155.23, weight = 150.88;
	      
	      System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n키 : %.2f\n몸무게 : %.3f\n", name, age, hobby, height, weight);
	      
	      //2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
	      int number = 255;
	      System.out.printf("10진수 : %d, 8진수 : %o, 16진수 : %x", number, number, number);
	      
	      //3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
	      //    각 자리수는 5자리로 정렬, tab키 2번 사용
//	      -------------------------
//	      상품명         가격
//	      -------------------------
//	      메로나         1500원
//	      누네띠네       1200원
//	      꼬북칩         2000원
//	      초코파이       3000원
//	      -------------------------
	      System.out.println("\n-------------------------");
	      System.out.printf("%-5s\t\t%5s\n", "상품명", "가격");
	      System.out.println("-------------------------");
	      System.out.printf("%-5s\t\t%5d원\n", "메로나", 1500);
	      System.out.printf("%-5s\t\t%5d원\n", "누네띠네", 1200);
	      System.out.printf("%-5s\t\t%5d원\n", "꼬북칩", 2000);
	      System.out.printf("%-5s\t\t%5d원\n", "초코파이", 3000);

	}

}
