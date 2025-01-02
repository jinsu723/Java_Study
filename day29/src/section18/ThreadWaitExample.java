package section18;

class AddStackThread01 extends Thread{
	private Storage01 storage;
	
	public AddStackThread01(Storage01 storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(2000);
				if(this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class PopStackThread01 extends Thread{
	private Storage01 storage;
	public PopStackThread01(Storage01 storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(2000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage01 s = new Storage01();
		AddStackThread01 add = new AddStackThread01(s);
		PopStackThread01 pop = new PopStackThread01(s);
		
		add.start();
		pop.start();
	}
}
