package synchronization;

public class WaitTest {
	public static void main(String[] args) {
		WaitThread wt = new WaitThread();
		
		Thread t1 = new Thread(wt, "a");
		t1.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wt.method2();
	}
}
