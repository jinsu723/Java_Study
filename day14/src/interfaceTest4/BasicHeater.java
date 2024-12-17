package interfaceTest4;

public class BasicHeater extends HeaterAdapter{

	@Override
	public void on() {
		System.out.println("버튼으로 히터를 켭니다");
	}

	@Override
	public void off() {
		System.out.println("버튼으로 히터를 끕니다");
	}

	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		
	}

}
