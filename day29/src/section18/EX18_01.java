package section18;

public class EX18_01 {
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();  // 스레드의 이름을 반환받아 저장
		System.out.println("현제 스레드의 이름 : " + threadName);
	}
}
