package task01;

public class Method extends GetNum{
	
	// 1부터 입력받은 수까지를 더해주는 메소드
	int sumNum(int num) {
		int count = 0;  // 결과를 저장할 변수 선언
		for(int i=1; i<=num; i++) {  // 입력받은 수만큼 반복
			count += i;  // 1부터 입력받은 수까지 더해서 저장한다
		}
		return count;  // 결과 반환
	}
	
}
