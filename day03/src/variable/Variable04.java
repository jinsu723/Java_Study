package variable;
// 5번 : 
public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 반복되는 값을 쉽게 관리하기 위해서(값을 재사용하기 위해서)
		//		같은 값을 여러 곳에서 사용하거나 변경해야 할 때 변수에 저장하면 코드 수정이 간펴진다
		// 		변수값을 변경하면 해당 변수를 참조하는 모든 코드에 변경사항이 자동으로 적용된다

		int price = 100;
		int quantity = 5;
		System.out.println(price * quantity);  // 100 * 5 => 500
		
		price = 200;  // 가격이 변경되었을 때 변수의 값만 변경
		System.out.println(price * quantity);  // 200 * 5 => 1000
		
		// 2. 값에 의미를 부여하기 위해서(값에 이름을 붙여준다)
		// 		변수에 이름을 붙이면 코드의 의미를 명확히 전달 할 수 있다
		//		문저열이나 숫자를 직접 사용하는 것보다 변수명을 통해 코드의 목적을 쉽게 이해할 수 있다
		
		int userAge = 20;  // 나이를 저장하는 변수
		double pi = 3.141592;  // 원주율 값
		boolean isLogin = true;  // 로그인 상태
		
		System.out.println("사용자 나이 : " + userAge);
		System.out.println("원주율 값 : " + pi);
		System.out.println("로그인 여부 : " + isLogin);
		// 3. 프로그램의 가독성, 유지보수성, 개사용성을 높이기 위해서
		//		코드에서 직접 값을 사용하는 매직넘버를 피하고 변수를 사용하면 수정과 유지보수가 용이하다
		
		
		// 메모리와 같이 정리
		int a;  // RAM에서 상자를 만들고 그 상자의 이름을 'a'라고 지정
		a = 100;  // a 상자에 100 정슈형 값을 저장한다
		// 이 a 상자는 RAM의 특정 주소값을 가짐
		
		System.out.println(a);
		// 컴퓨터는 a의 주소값을 보고 RAM에서 데이터를 읽어온다
		// 주소값에 있는 데이터를 출력한다
	}

}
