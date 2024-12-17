package task02;

import task01.GetNum;

public class Method extends GetNum{  // Task01의 GetNum 클래스를 상속받는다

	@Override
	public boolean checkNum(String num) {  // 메소드 오버라이딩
		return super.checkNum(num);  // 부모의 메소드 호출
	}

}
