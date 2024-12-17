package task;
// 12번 :

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // 입력을 받을 함수 import
		
		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		
		// 정수형 변수 선언 7개
		// 메시지 출력 '100000원 이상 금액을 입력하세요'
		// 금액 입력받아 저장
		// 각 지폐의 개수 구하기
		// 출력
		// 버퍼 비우기
		
		int money = 0, sinsa = 0, saejong = 0, saejong1 = 0, ee = 0, ee1 = 0, hwang = 0;  // 변수 선언
		System.out.println("100000원 이상 금액을 입력하세요");  // 사용자에게 입력값 요구
		money = sc.nextInt();  // 입력을 받을 메소드
		
		sinsa = money / 50000;  // 5만원 권의 개수를 구한다
		saejong = money % 50000; // 5원권을 뺀 나머지 금액을 구한다
		saejong1 = saejong / 10000;  // 만원권의 개수를 구한다
		ee = saejong % 10000;  // 만원권을 뺀 나머지 금액을 구한다
		ee1 = ee / 5000;  // 5천원의 개수를 구한다
		hwang = ee % 5000;  // 5천원권을 뺀 나머지 금액을 구한다
		hwang = hwang / 1000;  // 천원권의 개수를 구한다
		
		System.out.println("5만원권 : " + sinsa + "개, 만원권 : " + saejong1 + "개, 오천원권 : " + ee1 + "개, 천원권 : " + hwang + "개");  // 결과값 출력
		
		sc.nextLine();  // 버퍼를 비운다
		System.out.println();  // 한 줄 띄우기
		
		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)
		
		// 실수형 변수 3개 선언
		// 메시지 출력 '키와 몸무게를 순서대로 입력하세요'
		// 두 실수 저장
		// BMI 구하여 변수에 저장
		// 결과 출력
		// 버퍼 비우기
		
		double height = 0, weight = 0, bmi = 0;  // 변수 선언
		System.out.println("키와 몸무게를 순서대로 입력하세요");  // 사용자에게 입력값 요구
		height = sc.nextDouble();  // 키 입력
		weight = sc.nextDouble();  // 몸무게 입력
		
		bmi = weight / (height * height);  // bmi를 구하는 공식
		
		System.out.println("당신의 BMI는 : " + bmi);  // 결과 출력
		
		sc.nextLine();  // 버퍼를 비운다
		System.out.println();  // 한 줄 띄우기
		
		// 3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
		// 공식 : 0.5 * 밑변 * 높이
		
		// 변수 선언 3개(밑변, 높이, 넓이) 실수형
		// 메시지 출력 '밑변과 높이를 순서대로 입력하세요'
		// 두 실수 저장
		// 삼각형의 넓이를 계산해서 변수에 저장
		// 결과값 출력
		// 버퍼 비우기
		
		double lenght = 0, height2 = 0, result = 0;  // 변수 선언
		System.out.println("밑변의 길이와 높이를 순서대로 입력하세요");  // 사용자에게 입력값 요구
		lenght = sc.nextDouble();  // 밑변의 길이 입력
		height2 = sc.nextDouble();  // 높이 입력
		
		result = 0.5 * lenght * height2;  // 삼각형의 넓이 구하기
		
		System.out.println("당신이 구하려는 삼각형의 넓이 : " + result);  // 결과값 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
		
		// 변수 선언 2개
		// 출력 메시지 '두 정수를 입력하세요'
		// 두 정수 저장
		// 0과 크기 비교 및 출력
		// 버퍼 비우기
		
		int num1 = 0, num2 = 0;  // 변수 선언
		System.out.println("두 정수를 입력하세요");  // 사용자에게 입력값 요구
		num1 = sc.nextInt();  // 첫 번째 정수 입력
		num2 = sc.nextInt();  // 두 번째 정수 입력
		
		System.out.println("" + num1 + "은 0보다 클까요? " + (num1 > 0));  // 첫 번째 정수와 0 크기 비교
		System.out.println("" + num2 + "은 0보다 클까요? " + (num2 > 0));  // 두 번째 정수와 0 크기 비교
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
		
		// 변수 선언 3개(물건의 개수, 가격, 총액)
		// 출력 메시지 '물건의 개수와 가격을 입력하세요'
		// 물건의 개수와 가격을 정수형으로 저장
		// 총액 계산하여 변수에 저장
		// 결과 출력
		
		int item = 0, price = 0, total = 0;  // 변수 선언
		
		System.out.println("물건의 개수와 가격을 입력하세요");  // 사용자에게 입력값 요구
		item = sc.nextInt();  // 물건의 개수 입력
		price = sc.nextInt();  // 물건의 가격 입력
		
		total = item * price;  // 총액 계산
		
		System.out.println("총액 : " + total);  // 결과 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 6. 두 자리수 정수를 입력받아 각 자리의 숫자를 더하기 출력하기(각 자리수의 합)
		
		// 변수 선언(두 자리수 정수, 십의 자리, 일의 자리, 각 자리수의 합)
		// 출력 메시지 '두 자리수 정수 하나를 입력하세요'
		// 입력받은 정수 저장
		// 십의자리수 구하기
		// 일의자리수 구하기
		// 각 자리수의 합 구하기
		// 결과 출력
		// 버퍼 비우기
		
		int con = 0, ten = 0, one = 0, sum = 0;  // 변수 선언
		
		System.out.println("두 자리수 정수를 입력하세요 무조건");  // 사용자에게 입력값 요구
		con = sc.nextInt();  // 두 자리 정수 저장
		
		ten = con / 10;  // 십의 자리수 구하기
		one = con % 10;  // 일의 자리수 구하기
		
		sum = ten + one;  // 두 수의 합 구하기
		
		System.out.println("십의 자리 : " + ten + ", 일의 자리 : " + one + ", 두 수의 합 : " + sum);  // 결과값 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false
		
		// 변수 선언(정수, 홀짝 저장)
		// 출력메시지 '정수를 입력하세요'
		// 홀짝 구분하기
		// 논리연산 및 결과 출력
		// 버퍼 비우기
		
		int con2 = 0, result2 = 0;  // 변수 선언
		
		System.out.println("정수를 입력하세요");  // 사용자에게 입력값 요구
		con2 = sc.nextInt();  // 정수 값 저장
		
		result2 = con2 % 2;  // 홀짝 구분하기 0이면 짝수 1이면 홀수
		
		System.out.println("당신이 입력한 수는 양수이면서 짝수입니가?" + ((con2 > 0)&&(result2 == 0)));  // 논리연산 및 결과값 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 8. 두 숫자를 입력받아 첫 번째 숫자가 두 번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false
		
		// 변수 선언하기(정수 2개)
		// 출력메시지 '두 정수를 입력하세요'
		// 두 정수 입력받아 저장
		// 논리연산 및 결과 출력
		// 버퍼 비우기
		
		int num3 = 0, num4 = 0;  // 변수 선언
		
		System.out.println("두 정수를 입력하세요");  // 사용자에게 입력값 요구
		num3 = sc.nextInt();  // 첫 번째 숫자 입력받기
		num4 = sc.nextInt();  // 두 번째 숫자 입력받기
		
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 크거나 같을까?" + (num3 >= num4));  // 논리 연산 및 결과 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false
		
		// 변수 선언 (두 정수)
		// 출력 메시지 '두 정수를 입력하세요'
		// 두 정수 저장
		// 논리연산 및 결과 출력
		// 버퍼 비우기
		
		int num5 = 0, num6 = 0;  // 변수 선언하기
		
		System.out.println("두 정수를 입력하세요");  // 사용자에게 입력값 요구
		num5 = sc.nextInt();  // 첫 번째 정수 저장
		num6 = sc.nextInt();  // 두 번쨰 정수 저장
		
		System.out.println("최소 하나는 양수냐? " + ((num5 > 0)||(num6 > 0)));  // 논리연산 및 결과 출력
		
		sc.nextLine();  // 버퍼 비우기
		System.out.println();  // 한 줄 띄우기
		
		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025연도로 확인할 것)
		// true or false => true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어져야 한다
		
		// 변수 선언(입력값, 4로 나눈 결과값, 100으로 나눈 결과값, 400으로 나눈 결과값)
		// 출력 메시지 '연도를 입력해주세요'
		// 윤년 계산하기(4로 나누기, 100으로 나누기, 400으로 나누기)
		// 논리연산 및 결과 출력
		
		int year = 0, result4 = 0, result100 = 0, result400 = 0;  // 변수 선언
		
		System.out.println("연도를 입력하세요");  // 사용자에게 입력값 요구
		year = sc.nextInt();  // 연도 저장
		
		result4 = year % 4;  // 4로 나눈 나머지 저장
		result100 = year % 100;  // 100으로 나눈 나머지 저장
		result400 = year % 400;  // 400으로 나눈 나머지 저장
		
		System.out.println("올해는 윤년인가 " + ((result4 == 0)&&((result100 != 0)||(result400 == 0))));  // 논리연산 및 결과 출력
		 
		// 0000년은 윤년입니다, 0000년은 윤년이 아닙니다를 어떻게 출력시켜 할 지 모르겠습니다
		
		sc.nextLine();  // 버퍼 비우기
		sc.close();  // 자원 닫기
	}

}
