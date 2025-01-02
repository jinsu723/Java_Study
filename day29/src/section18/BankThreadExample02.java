package section18;

class AddThread02 implements Runnable{
	private Bank02 b;
	private String name;
	public AddThread02(String name, Bank02 b) {
		this.name = name;
		this.b = b;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				b.addMoney(1000);
				System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class BankThreadExample02 {
	public static void main(String[] args) {
		Bank02 b = new Bank02();
		Thread th1 = new Thread(new AddThread02("1번", b));
		Thread th2 = new Thread(new AddThread02("2번", b));
		
		th1.start();
		th2.start();
	}
}
