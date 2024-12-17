package doWhileTest;

// 7번 : 기타 제어문-continue문

public class ContinueTest {
	public static void main(String[] args) {
		// 1~10까지 중 7을 제외하고 출력(for문)
		for(int i=0; i<10; i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i + 1);
		}
		
		// 1~10RKwl 중 5를 제외하고 출력(while문)
		int num = 1;
		while(num <= 10) {
			if (num == 5) {
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}
	}
}
