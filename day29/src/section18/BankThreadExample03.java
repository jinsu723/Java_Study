package section18;

class AddThread03 implements Runnable{
	private Bank03 b;
	private String name;
	public AddThread03(String name, Bank03 b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		synchronized(b) {
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(100);
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}

public class BankThreadExample03 {
	public static void main(String[] args) {
		Bank03 b = new Bank03();
		
		Thread t1 = new Thread(new AddThread03("1번", b));
		Thread t2 = new Thread(new AddThread03("2번", b));
		
		t1.start();
		t2.start();
	}
}
