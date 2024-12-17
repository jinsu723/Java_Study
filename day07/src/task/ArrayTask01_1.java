package task;

import java.util.Scanner;

public class ArrayTask01_1 {
	public static void main(String[] args) {
		// 8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		// 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		
		// 0) Scanner 입력클래스 import
		// 1) 사물함 번호 설정
		// 2) 비밀번호 설정
		// 3) 사용할 사물함 번호와 비밀번호 입력 후 일치 여부 확인(if)
		
		Scanner sc  = new Scanner(System.in);
//		System.out.println("사물함 번호를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		System.out.println("이용할 사물함의 비밀번호를 설정하세요 : ");
//		int arPw = sc.nextInt();
//		
//		System.out.println("사용할 사물함 번호를 입력하세요, : ");
//		int choice = sc.nextInt();
//		System.out.println("사용할 사물함 번호의 비밀번호를 입력하세요 : ");
//		int choicePw = sc.nextInt();
//		
//		if(arPw == choicePw) {
//			System.out.println("비밀번호가 일치합니다. 사물함을 이용하세요.");
//		} else {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
		
		// 1) 5칸짜리 사묾함의 비밀번호를 각각 배열에 저장한다
		// 2) 사용자에게 이용할 사물함 번호를 묻는다
		// 3) 비밀번호를 입력받아 확인한다
		// 4) 일치/불일치를 출력한다
		
		int[] arPw = new int[5];
//		int[] arPw1 = {1111, 2222, 3333, 4444, 5555};
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이욯할 사물함 번호 입력 : ";
		String inputMsg = "비밀번호 입력 : ";
		String result = null;
		int choice = 0, inputPw = 0;
		
		for(int i = 0; i < arPw.length; i++) {
			System.out.println(i + 1 + mainMsg);
			arPw[i] = sc.nextInt();
		}
//		for(int data : arPw) {
//			System.out.println(data);
//		}
		
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		if(arPw[choice - 1] == inputPw) {
			System.out.println("비밀번호 일치");
		} else {
			System.out.println("비밀번호 불일치");
		}
		
		// 9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
		// 3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!!)
		
		// 1) 입력 클래스 import
		// 2) 3칸 배열 선언
		// 3) 합계 저장할 변수(int)
		// 4) 3과목의 점수 입력받는 for-each문(double)
		// 5) 총점 계싼할 for-each문
		// 6) 결과 출력(printf)
		
		int[] scores = new int[3];
		int index = 0;  // for-each문에서 사용하기 위한 변수
		int total = 0;
		double evg = 0.0;
		
		System.out.println("3과목의 점수를 입력하세요");
		
		for(int score : scores) {
			System.out.println("점수 입력 : ");
			score = sc.nextInt();
			scores[index++] = score;  // score[0, 1, 2]
		}
		
		for(int score : scores) {
			total += score;
		}
		
		evg = (double)total / scores.length;
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.3f\n", evg);
	}
}
