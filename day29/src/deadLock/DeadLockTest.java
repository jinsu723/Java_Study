package deadLock;

public class DeadLockTest {
	public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		
		// 첫 번째 쓰레드 : r1을 점유하고 r2를 기다림
		Thread t1 = new Thread(() -> r1.methodA(r2), "Thread-1");
		// 두 번째 쓰레드 : r2를 점유하고 r1을 기다림
		Thread t2 = new Thread(() -> r2.methodA(r1), "Thread-2");
		
		t1.start();
		t2.start();
	}
}
