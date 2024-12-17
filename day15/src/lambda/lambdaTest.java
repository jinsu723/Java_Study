package lambda;

// 식과 문의 차이

public class lambdaTest {
	public static void main(String[] args) {
		// 식(Expression), 문(Statement)
		
		// 문(Statement) : 조건문, 반복문, 제어문
		// 문은 값이 아니기 때문에 변수에 저장할 수 없고 매개변수로 넘겨줄 수 없다
		// 문은 식을 포함할 수 있다
		// java에서 실행 가능ㅇ한 최소한의 코드 블록
		// if문, switch문, for문, ..
		// 하나 이상의식을 포함할 수가 있다
		
		// 식(Expression) : 조건식, 증감식, 초기식
		// java에서 값을 계산하고 결과를 반환하는 구문
		// 1 + 2, "Hello World"
		
		int a = 3;  // 문  3 식
		System.out.println(a);  // 문
		
		int b = a = 5;
		// 자료형 변수명 = 값;
	}
}
