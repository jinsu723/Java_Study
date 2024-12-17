package twoForTest;

// 3번 : 2층 for문 별찍기(i와 j의 규칙성 확인)

public class TwoForTest02 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {  // 행
			for(int j=0; j<=i; j++) {  // 열
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
