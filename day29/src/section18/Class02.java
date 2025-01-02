package section18;

class Class03 implements Runnable {
	Class01 c;
	String name;

	public Class03(String name, Class01 c) {
		this.name = name;
		this.c = c;
	}

	@Override
	public void run() {
			for (int i = 0; i < 10; i++) {
				synchronized(c){
					try {
						if(c.getNum1() <= 0) {
							Thread.sleep(100);
							System.out.println("더 이상 짐이 없습니다");
							return;
						} else {
							Thread.sleep(100);
							c.minusNum(1);
							System.out.println(this.name + "가 짐을 옮기다 " + c.getNum1());
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}

		
	}
}

public class Class02 {
	public static void main(String[] args) {
		Class01 c = new Class01();

		Thread th1 = new Thread(new Class03("길진수", c));
		Thread th2 = new Thread(new Class03("길현수", c));

		c.setNum1(10);

		th1.start();
		th2.start();
	}
}
