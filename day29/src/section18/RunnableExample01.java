package section18;

class whiteFlag implements Runnable {

	@Override
	public void run() {
//		while(true) {
//			System.out.println("백기 올려");
//		}
		System.out.println("백기 올려");
	}
	
}

public class RunnableExample01 {
	public static void main(String[] args) {
		whiteFlag wf = new whiteFlag();
		Thread t1 = new Thread(wf);
		
//		System.out.println("실행");
		t1.start();
		
		System.out.println("wf : " + wf);
		System.out.println("t1 : " + t1);
		System.out.println("thread name : " + Thread.currentThread().getName());
	}
}
