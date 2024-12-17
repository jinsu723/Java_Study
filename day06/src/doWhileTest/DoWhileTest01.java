package doWhileTest;

// 1번 : do~while문

public class DoWhileTest01 {
	public static void main(String[] args) {
		
			boolean isFalse = false;
			
//			// while문
//			while(isFalse) {
//				System.out.println("안녕");
//			}
//			
//			System.out.println("실행끝");
			
			// do ~ while문
			do {
				System.out.println("안녕");
			} while(isFalse);
			
			System.out.println("출력끝");
	}
}
