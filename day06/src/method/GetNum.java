package method;

public class GetNum {
	// 입력받은 값이 정수형인지 판단하는 메소드
	public boolean checkNum(String num) {  // 다른 패키지에서 쓸 수 있게 public 접근제한자
		for(int i=0; i<num.length(); i++) {  // 문자열을 하나씩 본다
			// 하나라도 정수형을 벗어나는 유니코드값을 가지고 있다면
			if(num.charAt(i) > 57 || num.charAt(i) < 48) {
				return false;  // 정수가 아님
			}
		}
		return true;  // 걸리는게 없다면 정수가 맞다
	}
}
