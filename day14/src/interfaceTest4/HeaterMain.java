package interfaceTest4;

public class HeaterMain {
	public static void main(String[] args) {
		Heater basicHeater = new BasicHeater();
		Heater basicHeater2 = new BasicHeater2();
		Heater smartHeater = new SmartHeater();
		
		basicHeater.on();
		basicHeater2.on();
		smartHeater.on();
		
		// 모든 히터 객체를 배열로 관리
		Heater[] heaters = {basicHeater, basicHeater2, smartHeater};
		System.out.println(heaters);
		
		for(Heater heater : heaters) {
			System.out.println("히터 테스트");
			heater.on();
			heater.off();
			
			// Heater 타입 확인
			if(heater instanceof BasicHeater) {
				System.out.println("터보기능이 없습니댜");
			} else if(heater instanceof BasicHeater2) {
				heater.turbo();
			} else if(heater instanceof SmartHeater) {
				heater.turbo();
			}
		
		}
	}
}
