package section18;

public class Bank02 {
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public synchronized void addMoney(int money) {
		this.money += money;
	}
}
