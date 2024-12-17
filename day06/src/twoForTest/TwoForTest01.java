package twoForTest;

// 2번 :

public class TwoForTest01 {
	public static void main(String[] args) {
		
		for(int i=1; i<3; i++) {  // 바깥 for문
			for(int j=1; j<3; j++) {  // 안쪽 for문
				System.out.println("i : " + i + ", j : " + j);
			}
		}
		
		// 1. 바깥 for문 시작
		// 	처음 i = 1로 초기화, i < 3 조건 검사해서 true 반복문 내부로 들어간다
		// 2. 안쪽 for문 시작
		//	j = 1로 초기화, j < 3 조건을 검사해서 true 반복문 내부로 들어간다
		//	System.out.println("i : " + i + ", j : " + j); => 출력 결과 i = 1, j : 1
		// 3. 안쪽 for문 진행
		//	j가 1증가(j++)하여 j = 2가 된다
		//	j < 3 조건을 검사한다. 조건이 true이므로 내부 코드를 실행한다
		//	System.out.println("i : " + i + ", j : " + j); => 출력 결과 i : 1, j : 2
		//	다시 j++를 실행한다. j = 3이 된다
		//	j < 3 조건이 false이므로 안쪽 반복문 종료한다
		// 4. 바깥쪽 반복문이 진행
		//	i가 1 증가(i++)하여 i = 2가 된다
		//	i < 3 조건을 다시 검사하여 조건이 true이므로 내부 코드를 실행한다
		// 5. 안쪽 for문 반복
		//	j = 1초기화된다
		//	이전과 동일한 방식으로 반복한다
		// 6. 바깥쪽 반복문 종류
		//	i가 i++이므로 i = 3이 된다
		//	i < 3 조건을 검사하여 조건이 false이므로 바깥 반복문이 종료된다
		
		// 바깥 for문이 1번 반복할 때 안쪽 for문은 매번 처음부터 끝까지(조건이 false) 실행된다
		// 바깥 for문의 조건이 false가 될 때까지 반복한다
	}
}
