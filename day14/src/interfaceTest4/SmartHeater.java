package interfaceTest4;

public class SmartHeater implements Heater{

	@Override
	public void on() {
		System.out.println("음성으로 히터를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("음성으로 히터를 끕니다");
	}

	@Override
	public void turbo() {
		System.out.println("터보모드를 활성화합니다");
	}

}
