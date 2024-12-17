// 길진수
package task;

import java.util.Scanner;

// 6번 :

public class ArrayTask01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열문제 조건 1) 칸수만 알고 있다고 가정
		// 조건 2) 반드시 length 사용
		// 조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용

		// 1. 100 ~ 1 까지의 값을 배열에 넣고 출력
		// 일반 for문만 사용

		// 배열 선언
		// for문 사용해서 1부터 100까지 값 넣기
		// for문 사용해서 1부터 100까지 출력

		int[] arr1 = new int[100];  // 100칸 배열 선언
		for(int i = 0; i < arr1.length; i++) {  // 배열의 길이만큼 반복
			arr1[i] = i+1;  // 1부터 값을 넣기 때문에 +1을 해서 넣어준다
		}
		for(int i = 0; i < arr1.length; i++) {  // 배열의 길이만큼 반복
			System.out.println("arr1[" + i + "] : " + arr1[i]);  // 결과 출력
		}

		// 2. 1 ~ 10까지의 값을 배열에 넣고 총 합 구하기
		// 일반 for문만 사용

		// 배열 선언
		// 총 합을 구할 변수 선언
		// for문 사용해서 각 값 넣기
		// 각 값을 넣으면서 누적 합계 구하기

		int[] arr2 = new int[10];  // 10칸 배열 선언
		int sum1 = 0;  // 총 합을 구할 변수 선언
		
		for(int i = 0; i < arr2.length; i++) {  // 배열의 길이만큼 반복
			arr2[i] = i + 1;  // 1부터 값이 들어가기 때문에 +1을 해서 넣어준다
			sum1 += arr2[i];  // 배열의 누적 총 합을 계산
		}
		
		System.out.println("1부터 10까지의 총 합 : " + sum1);  // 총 합 출력

		// 3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		// 일반 for문, for-each문 상관없음(소수점 3자리까지)

		// 입력 메소드 import
		// 배열 선언
		// 변수 선언(총 합, 평균을 저장할 변수)
		// for문 안에서 4번의 입력을 받아 배열에 저장
		// for문 안에서 배열 안의 총 합을 구한 뒤 평균 계산
		// 출력

		int[] arr3 = new int[4];  // 4칸 배열 선언
		int sum2 = 0;  // 총 합을 구할 변수 선언
		double evg1;  // 평균을 저장할 변수 선언
		
		for(int i = 0; i < arr3.length; i++) {  // 배열의 길이만큼 반복
			System.out.println((i+1) + "번째 정수를 입력하세요(총 4번)");  // 메시지가 4번 출력된다
			arr3[i] = sc.nextInt();  // 네 번의 입력을 받아 저장
			sum2 += arr3[i];  // 총 합 계산
		}
		evg1 = sum2 / 4d;  // 평균을 계산해 저장한다
		System.out.printf("입력 한 수의 평균값 : %.3f" , evg1);  // 평균값을 소수점 3자리까지 출력
		
		System.out.println();  // 줄바꿈
		sc.nextLine();  // 버퍼 비우기

		// 4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		// for-each문 사용

		// 배열 선언 10자리
		// for문 사용해서 값 집어넣기
		// 배열[0] ~ 배열[4] 0, 1, 2, 3, 4
		// 배열[5] ~ 배열[9] 0, 1, 2, 3, 4
		// for-each문 사용하여 출력

		int[] arr4 = new int[10];  // 10칸 배열 선언
		
		for(int i = 0; i <arr4.length; i++) {  // 처음 5개의 값을 넣을 반복문
			arr4[i] = i;  // 5개의 값을 저장한다
		}
		
		for(int i = 5; i <(arr4.length/2); i++) {  // 마지막 5개의 값을 넣을 반복문
			arr4[i] = i;  // 5개의 값을 저장한다
		}
		
		for(int data : arr4) {  // 배열에 저장된 값을 보기 위한 반복문
			System.out.println(data);  // 데이터 출력
		}

		// 5. A~F까지를 C만 제외하고 배열에 담아 출력
		// 일반 for문
		// 초기식 int i = 0;

		// 배열 선언 6칸
		// A의 아스키 코드 65, C의 아스키 코드 67
		// for(int i = 0; i<배열.length; i++)
		// if ( i == 3 )
		// {continue;}
		// 배열에 아스키 코드 담기
		// for문 출력
		// for(int i = 0; i<배열.length; i++)
		// if ( i == 3 )
		// {continue;}
		// syso((char)배열[i]);

		int[] arr5 = new int[6];  // 6칸 배열 선언
		
		for(int i = 0; i < arr5.length; i++) {  // 배열의 길이만큼 반복
			if(i == 2) {  // i가 2라면
				continue;  // 건너뛰기
			}
			arr5[i] = i+65;  // 아스키코드값을 배열에 저장
		}
		
		for(int i = 0; i < arr5.length; i++) {  // 배열의 길이만큼 반복
			if(i == 2) {  // i가 이라면
				continue;  // 건너뛰기
			}
			System.out.print((char)arr5[i] + " ");  // 아스키코드값을 char형태로 출력
		}

		// 6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력

		// 배열 선언(소문자를 담을 배열, 대문자를 담을 배열)
		// for문을 사용하여 차례대로 값 입력
		// for(int i = 0; i <= 배열.length; i++)
		// if(i%2 == 0){
		// 소문자배열[i] = i + 97;
		// } else if {
		// 대문자배열[i] = i + 65;}
		// 출력

		int[] arr6 = new int[26];  // 소문자를 위한 26칸 배열 선언
		int[] arr7 = new int[26];  // 대문자를 위한 26칸 배열 선언
		
		for(int i = 0; i<arr6.length; i++) {  // 배열의 길이만큼 반복
			if(i%2 == 0) {  // i가 짝수면 소문자 배열에 저장
				arr6[i] = i + 97;  // 소문자
			} else {  // i가 홀수면 대문자 배열에 저장
				arr7[i] = i + 65;  // 대문자
			}
		}
		
		for(int i = 0; i<arr6.length; i++) {  // 배열의 길이만큼 반복
			if(i%2 == 0) {  // 소문자 배열만 출럭하기 위함
				System.out.print((char)arr6[i]);  // 소문자 춢력 줄바꿈 없음
			} else {  // 대문자 배열만 출력하기 위함
				System.out.print((char)arr7[i]);  // 대문자 출력 줄바꿈 없음
			}
		}

		// 7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		// 일반 for문

		// 입력메소드 import
		// 배열 선언하기
		// 최소값과 최대값 저장할 변수 선언
		// 사용자에게 5개의 정수 입력 받기
		// for문을 통해 5번
		// 입력과 동시에 배열에 저장
		// 최소값과 최대값 계산
		// 출력

		
		int[] arr8 = new int[5];  // 5칸 배열 선언
		int min = 1000, max = 0;  // 최대값과 최소값을 저장할 변수 선언
		
		for(int i = 0; i<arr8.length; i++) {  // 배열의 길이 만큼 반복
			System.out.println(i + "번째 정수를 입력하세요.(엔터를 통해 5번)");  // 5번 입력 받기
			arr8[i] = sc.nextInt();  // 입력 받은 값을 배열에 순차적으로 저장
		}
		
		for(int i = 0; i < arr8.length; i++) {  // 5번 반복
			if(arr8[i] < min) {  // 최소값 찾기
				min = arr8[i];  // 최소값 저장
			}
			if(arr8[i] > max) {  // 최대값 찾기
				max = arr8[i];  // 최대값 저장
			}
		}
		
		System.out.println("최대값 : " + max + ", 최솟값 : " + min);  // 최대값과 최소값 출력
		
		sc.nextLine();  // 버퍼 비우기

		// 8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		// 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기

		// 배열 선언하기(초기비밀번호(4) + 사물함 번호(1), 입력 받을 비밀번호(4))
		// 입력메소드 import
		// 입력 받아 저장(사물함 번호와 비밀번호 설정)
		// 재입력 사물함 열기
		// 사물함 번호로 본인확인 => 안되면 out
		// 비밀번호 비교 => 하나라도 틀리면 바로 out
		// 결과 출력

		int[] arr9 = new int[5];  // 초기 설정값
		int[] arr10 = new int[4];  // 사물함을 열기 위한 비밀번호
		boolean open = true;  // 사물함의 상태


		System.out.println("사용할 사물함의 번호를 입력하세요");  // 입력값 요구
		arr9[0] = sc.nextInt();  // 사물함 번호 저장

		System.out.println("사물함 비밀번호 설정...");  // 비밀번호 설정을 위한 입력 요구
		for (int i = 1; i < arr9.length; i++) {  // 배열의 길이만큼 반복
			System.out.println(i + "번째 자리를 입력하세요");  // 비밀번호 입력 요구
			arr9[i] = sc.nextInt();  // 비밀번호 저장
		}

		System.out.println("비밀번호 설정 완료");  // 비밀번호 설정 완료

		int no;  // 사물함 번호를 비교하기 위한 변수 선언

		System.out.println("본인의 사물함 번호와 비밀번호를 입력하세요");  // 본인 확인을 위한 번호 입력
		for (int i = 0; i < arr9.length; i++) {  // 배열의 길이만큼 반복
			if (i == 0) {  // 사물함 번호 비교
				System.out.print("사물함 번호 : ");  // 사물함 번호 요구
				no = sc.nextInt();  // 입력값 저장
				if (!(no == arr9[0])) {  // 초기에 저장된 값과 입력값이 다르다면
					System.out.println("당신의 사물함이 아닙니다!");  // 이용 불가
					open = false;  // 사물함 닫힘
					break;  // 탈출
				}
			} else {  // 본인의 사물함이라면

				System.out.println(i + "번째 비번호를 입력하세요");  // 비밀번호 입력 요구
				arr10[(i-1)] = sc.nextInt();  // 입력받은 번호 저장
				if (!(arr10[(i-1)]==arr9[i])) {  // 초기 비밀번호와 비교 다르다면?
					System.out.println("틀렸습니다.");  // 땡
					System.out.println("프로그램 종료.");  // 이용 불가
					open = false;  // 사물함 닫힘
					break;  // 탈출
				}
			}

		}
		if(open) {  // 사물함이 닫히지 않았다면
			System.out.println("환영합니다.");  // 환영 메시지
		}
		
		sc.nextLine();  // 버퍼 비우기

		// 9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
		// 3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!!)

		// 배열 선언 3칸
		// 총합과 평균을 구하기 위한 변수 선언
		// 점수 입력 (하나씩)
		// 배열에 점수 저장
		// 총점과 평균 구하기
		// for-each문을 이욯해 3 과목 한 번에 보여주기
		// 총점과 평균 보여주기

		int[] arr11 = new int[3];  // 점수를 저장할 배열
		int sum3 = 0;  // 총 합 을 저장할 변수
		double evg2 = 0;  // 평균을 저장할 변수
		
		System.out.println("성적을 입력하세요.");  // 성적 입력
		System.out.println("국어 성적");  // 국어 성정
		arr11[0] = sc.nextInt();  // 국어 성적 저장
		System.out.println("영어 성적");  // 영어 성적
		arr11[1] = sc.nextInt();  // 영어 성적 저장
		System.out.println("수학 성정");  // 수학 성적
		arr11[2] = sc.nextInt();  // 수학 성적 저장
		
		sum3 = arr11[0] + arr11[1] + arr11[2];  // 점수 총합 저장
		evg2 = sum3/3d;  // 평균 저장
		
		for(int data : arr11) {  // 과목 점수 나열하기
			System.out.println(data);  // 출력
		}
		System.out.printf("총 점 : %d, 평 균 : %.3f", sum3, evg2);  // 총합과 평균 출력
		
		sc.nextLine();  // 버퍼 비우기
		sc.close();  // 자원 닫기
	}
}
