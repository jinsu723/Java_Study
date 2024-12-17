package task;

import java.util.Scanner;

// JAVA요 문제1
public class Task04 {
	public static void main(String[] args) {
//		1번 문제 
//		사용자에게 0~9까지의 정수 10개를 입력을 받고
//		이 때 잘못된 정수를 입력하면 다시 입력을 받고
//		사용자가 입력한 10개의 정수의 합을 구하시오
		
		// 입력메소드 import
		// 겍체 선언
		// 10개의 정수 입력받아 배열에 저장
		// while문 올바른 값이 들어올 때까지 반복
		// 결과 출력
		
		Scanner sc = new Scanner(System.in);  // 입력메소드 import
		Task04 t = new Task04();  // 객체 선언
		int[] ar = new int[10];  // 10칸 정수형 배열 선언
		System.out.println("1자리수 정수를 10개 입력하세요.");  // 사용자에게 입력값 요구
		for(int i=0; i<ar.length; i++) {  // 10번 입력받기
			System.out.println((i+1) + "번째 정수를 입력하시오.");  // 몇번째 입력인지 알려주기
			ar[i] = sc.nextInt();  // 입력받은 수들을 차례로 배열에 저장
		}
		
		while(t.isOneNumber(ar)) {  // 1자리수를 잘 입력하지 못했다면
			System.out.println("잘못된 값 입력. 다시 입력하세요.");  // 메시지 출력
			System.out.println("1자리수 정수를 10개 입력하세요.");  // 다시 입력
			
			for(int i=0; i<ar.length; i++) {  // 10번 입력받기
				System.out.println(i + "번째 정수를 입력하시오.");  // 몇번째 자리인지 알려주기
				ar[i] = sc.nextInt();  // 입력받은 수들을 차례로 배열에 저장
			}
		}
		
		System.out.println("당신이 입력한 수들의 합 : " + t.getSum(ar));  // 결과 출력
		sc.close();  // 자원 닫기
	}
	
	// 리턴 타입 : boolean
	// 매개변수 : 정수 배열
	// for-each문 사용해서 올바른 값이 들어왔는지 확인
	// boolean값을 리턴해서 메인메소드의 while 제어
	
	boolean isOneNumber(int[] ar) {  // 메소드 선언 논리형return, 매개변수 정수 배열
		for(int data : ar) {  // 배열 둘러보기
			if(data >= 10) {  // 안에 10 이상의 수가 있다면
				return true;  // 반복 입력을 위한 true return
			}
		}
		return false;  // 걸리는게 없다면 반복 종룔를 위한 false
	}
	
	// 리턴 타입 : int
	// 매개변수 : 정수 배열
	// for-each문 사용하여 배열에 저장된 수 누적 합 구하기
	
	int getSum(int[] ar) {
	// 배열에 있는 수들의 합을 구하는 메소드 정수형 return, 매개변수 정수형 배열
		int sum = 0;  // 초기 변수 선언 및 초기화
		for(int data : ar) {  // 배열 둘러보기
			sum += data;  // 총합 저장할 변수에 누적 더하기
		}
		return sum;  // 총합 return
	}
}
