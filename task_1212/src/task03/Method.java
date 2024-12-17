package task03;

import task01.GetNum;

//GetNum 클래스를 상속받는 클래스 선언
public class Method extends GetNum{
	
	// 부모의 메소드 오버라이딩
	// 입력받은 값이 정수인지 판단
	@Override
	public boolean checkNum(String num) {
		// TODO Auto-generated method stub
		return super.checkNum(num);  // 부모의 메소드 그대로 사용
	}

	// 입력받은 값이 0에서 100 사이인지 판단하는 메소드
	boolean checkNumRange(int num) {
		// 0부터 100까지 입력했다면
		if(num >= 0 || num <= 100) {
			return true;  // ture 반환
		}
		// 범위를 벗어났다면 false 반환
		return false;
	}
}
