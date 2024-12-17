package task2;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		Task01 t = new Task01();
		
		Scanner sc = new Scanner(System.in);
		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		
		// 입력 메소드 import
		// 입력 받은 값을 저장할 변수 선언
		// 각 지폐의 개수를 저장할 변수 선언
		// 값을 50000으로 나눈 값과 나머지를 저장
		// 50000으로 나눈 나머지를 5000으로 나눠서 몫과 나머지 저장
		// 5000으로 나눈 나머지를 1000으로 나눠서 몫 저장
		// 각 몫들을 출력
		
		int myMoney, man, ocheon, cheon;
		
		
//		System.out.print("금액을 입력하세요");
//		myMoney = sc.nextInt();
//		
//		System.out.println("입력한 금액 : " + myMoney);
//		
//		man = myMoney / 50000;
//		myMoney = myMoney % 50000;
//		
//		ocheon = myMoney / 5000;
//		myMoney = myMoney % 5000;
//		
//		cheon = myMoney / 1000;
//		
//		System.out.println("만원권 : " + man + "개, 오천원권 : " + ocheon  + "개, 천원권 : " + cheon + "개");
//		sc.nextLine();
		
		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)
		
		// 사용자에게 키와 몸무게 물어보기
		// 몸무게와 키를 저장할 변수 실수형으로 선언
		// 사용자에게 입력을 받아 계산하기
		
//		double height, weight;
//		
//		System.out.println("키과 몸무게를 띄어쓰기를 통해 입력하세요");
//		height = (double)sc.nextInt();
//		weight = (double)sc.nextInt();
//		
//		t.BMICalculator(height, weight);
//		sc.nextLine();
		
		// 3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
		// 공식 : 0.5 * 밑변 * 높이
		
		// 밑변과 높이를 입력받아 변수에 저장
		// 공식 사용하여 결고 출력
		
//		System.out.println("밑변과 높이를 띄어쓰기를 통해 입력하세요");
//		int tHeight = sc.nextInt();
//		int tLength = sc.nextInt();
//		
//		t.getExtent(tHeight, tLength);
//		sc.nextLine();
		
		
		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
		
		// 두 정수를 입력받아서 변수에 저장하기
		// 두 정수가 0보다 크다면 true, 0보다 작다면 false
		
//		System.out.println("두 정수를 띄어쓰기를 통해 입력하세요");
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		System.out.println(num1 + "이 0보다 큰가? " + (t.isBigThenZero(num1) ? "true" : "false"));
//		System.out.println(num2 + "이 0보다 큰가? " + (t.isBigThenZero(num2) ? "true" : "false"));
//		sc.nextLine();
		
		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
		
		// 사용자에게 물건의 개수와 가격을 정수형으로 차례대로 입력받아 저장
		// 물건의 개수 * 가격
		// 개수와 가격, 총 금액을 출력
		
//		System.out.println("당신이 고른 물건의 개수와 개당 가격을 띄어쓰기로 입력하세요");
//		int item = sc.nextInt();
//		int price = sc.nextInt();
//		
//		System.out.println("물건의 개수 : " + item);
//		System.out.println("물건의 개당 가격 : " + price);
//		System.out.println("총액 : " + t.itemSum(item, price));
//		sc.nextLine();
		
		
		// 6. 두 자리수 정수를 입력받아 각 자리의 숫자를 더하기 출력하기(각 자리수의 합)
		
		// 사용자에게 두 자리수 정수를 입력받아 저장하기
		// 각 자리의 수를 추출
		// 10으로 나눈 몫과 나머지
		// 둘을 더해 출력하기
		
//		System.out.println("두 자리수정수를 하나 입력하세요");
//		int tenOne = sc.nextInt();
//		
//		System.out.println("각 자리수의 합 : " + t.addTenOne(tenOne));
//		sc.nextLine();
		
		
		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false
		
		// 정수를 하나입력받아 저장
		// 조건 2개 입력받은 값이 0보다 큰지 확인
		// 2로 나누었을 떄 나머지가 0인지 확인
		// 결과 출력
		
//		System.out.println("정수를 하나 입력하세요");
//		int num = sc.nextInt();
//		
//		System.out.println(t.checkNumber(num));
//		sc.nextLine();
		
		
		// 8. 두 숫자를 입력받아 첫 번째 숫자가 두 번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false
		
		
		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false
		
		
		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025연도로 확인할 것)
		// true or false => true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어져야 한다
	}
	
	// BMI 계산기
	void BMICalculator(double height, double weight){
		double BMI;
		BMI = weight / (height * height);
		System.out.println("당신의 BMI : "+ BMI);
	}
	
	// 삼각형의 넓이 계산기
	void getExtent(int height, int length) {
		double extend;
		extend = (height * length) / 2;
		System.out.println("당신이 입력한 삼각형의 넓이 : " + extend);
	}
	
	// 수가 0보다 큰지 판별
	boolean isBigThenZero(int num) {
		if(num > 0) {
			return true;
		} return false;
	}
	
	// 물건의 개수와 총 합을 받아 총액 출력
	int itemSum(int item, int price) {
		return item * price;
	}
	
	// 10의 자리와 1의 자리 수 더하기
	int addTenOne(int num) {
		int ten = num / 10;
		int one = num % 10;
		return ten + one;
	}
	
	// 변수가 양수이면서 짝수인지
	boolean checkNumber(int num) {
		if(num > 0 && num % 2 == 0) {
			return true;
		} return false;
	}
}
