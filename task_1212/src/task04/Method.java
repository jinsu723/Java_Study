package task04;

import task01.GetNum;

// GetNum 클래스 상속받는 클래스 선언
public class Method extends GetNum{

	// 부모의 메소드 오버라이딩
	// 입력받은 값이 정수인지 아닌지 판단하는 메소드
	@Override
	public boolean checkNum(String num) {
		// TODO Auto-generated method stub
		return super.checkNum(num);  // 수정없이 사용
	}
	
	// 3의 배수라면 Fizz 5의 배수라면 Buzz 공배수라면 FizzBuzz
	String getWord(int num) {
		// 입력받은 값이 3과 5의 공배수라면
		if(num%3==0 && num%5==0) {
			return "FizzBuzz";  // 문자열 반환
		} else if(num%3 == 0) {  // 공배수는 아니지만 3의 배수라면
			return "Fizz";  // 문자열 반환
			// 공배수도 아니고 3의 배수도 아니지만 5의 배수라면
		} else if(num%5 == 0) {
			return "Buzz";  // 문자열 반환
		} else {  // 해당사항이 없다면
			return num + "";  // 입력받은 수 그대로 문자열로 반환
		}
			
	}

}
