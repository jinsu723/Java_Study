package section18;

class AddThread01 implements Runnable{
	private Bank01 b;
	private String name;
	public AddThread01(String name, Bank01 b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				b.addMoney(1000);
				System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class BankThreadExample01 {
	public static void main(String[] args) {
		Bank01 b= new Bank01();
		Thread th1 = new Thread(new AddThread01("1번", b));
		Thread th2 = new Thread(new AddThread01("2번", b));
		th1.start();
		th2.start();
	}
}
