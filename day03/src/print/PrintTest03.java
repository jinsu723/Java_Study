package print;
// 9번 : 서식문자의 옵션(printf)

public class PrintTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.out.println("==============================");
	      //기본 형식 지정자
	      System.out.printf("%s %s", "hello", true);
	      System.out.printf("\n%d %f", 2024, 11.123456);
	      System.out.printf("\n%c", 'a');
	      System.out.println("\n==============================");
	      //자리수를 지정하여 출력
	      System.out.printf("%-5s %05d", "java", 1);
	      System.out.printf("\n%-10s%d\n", "안녕하세요", 500);
	      System.out.printf("%-10.2s", "길진수");
	      System.out.println("\n==============================");
	      //정렬과 가격출력
	      System.out.printf("\n%-5s\t\t%5d원", "꼬북칩", 2500);
	      System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 3000);
	      System.out.printf("\n%-5s\t\t%5d원", "껌", 500);

	}

}
