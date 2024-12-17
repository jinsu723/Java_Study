package scanner;
// 6번 : nextInt()

import java.util.Scanner;

public class ScannerTest05 {
	public static void main(String[] args) {
		
		// 나이(nextInt), 이름(nextLin)을 입력받기
		
		// 1. 변수 선언(int, String)
		// 2. 입력 클래스 import
		// 3. 출력 메시지 (나이 입력 : )
		// 4. 변수 = nextInt()
		// 5. 출력 메시지 (이름 입력 : )
		// 6. 변수 = nextLine()
		// 7. 출력 (이름은 000이고 나이는 00살입니다)
		
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		sc.close();
	}
}
