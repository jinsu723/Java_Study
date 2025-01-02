package section18;

public class RunnableExample02 {
	public static void main(String[] args) {
		Runnable white = () -> {
			while(true) {
				System.out.println("백기올려");
			}
		};
		
		Thread whiteFlag = new Thread(white);
		whiteFlag.start();
	}
}
