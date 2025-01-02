package section18;

public class RunnableExample03 {
	public static void main(String[] args) {
		Runnable blue = () -> {
			while(true) {
				System.out.println("청기 올려");
			}
		};
		
		Runnable white = () -> {
			while(true) {
				System.out.println("백기 올려");
			}
		};
		
		Thread blueFlag = new Thread(blue);
		Thread whiteFlag = new Thread(white);
		
		blueFlag.start();
		whiteFlag.start();
	}
}
