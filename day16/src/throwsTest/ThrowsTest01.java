package throwsTest;

// 5번 : 예외 던지기(throws는 메소드 선언부에 사용한다)

public class ThrowsTest01 {

	static void method() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);  // 500 => 0.5초 (ms단위)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		method();
	}
}
