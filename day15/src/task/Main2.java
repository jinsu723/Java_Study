package task;

public class Main2 {
	public static void main(String[] args) {

		System.out.println("F를 입력 : " + subPoint("F").getMsg("ABCDEFG", "가나다"));
		// 앞에서부터 끊어서 뒤쪽만 출력
		System.out.println("B를 입력 : " + subPoint("B").getMsg("ABCDEFG", "가나다"));
		// 뒤에서부터 끊어서 앞쪽만 출력

	}

	// 문자열을 받아 앞에서 끊을지 뒤에서 끊을지 정하는 메소드
	static SubInter subPoint(String word) {
		if (word.equals("F")) {  // F가 들어왔다면
			SubInter si = (msg1, msg2) -> {  // 람다식 구현부 객체 선언
				String result = "";  // 결과를 저장할 문자열 변수 선언
				// 두 번째 문자열의 길이만큼 앞에서 잘라내고 뒤쪽만 출력하기 위한 반복문
				for (int i = msg2.length(); i < msg1.length(); i++) {
					result += msg1.charAt(i);  // 결과변수에 이어붙여 저장
				}
				return result;  // 결과 반환
			}; 
			return si;  // 반환받은 결과를 메인 메소드로 반환
		} else if (word.equals("B")) {  // B가 들어왔다면
			SubInter si = (msg1, msg2) -> {  // 람다식 구현부 객체 선언
				String result = "";  // 결과를 저장할 문자열 변수 선언
				// 앞쪽부터 출력하고 2번째 문자열의 길이만큼 빼서 출력하기 위한 반복문
				for (int i = 0; i < (msg1.length() - msg2.length()); i++) {
					result += msg1.charAt(i);  // 결과 변수에 문자열을 이어붙여 저장
				}
				return result;  // 결과 반환
			};
			return si;  // 반환받은 결과를 메인메소드로 반환한다
		}
		// F도 B도 입력받지 못 했을 때
		SubInter si = (msg1, msg2) -> "잘못 입력함";  // 람다식 결과 저장 
		return si;  // 결과 반환
	}
}
