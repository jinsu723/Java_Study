package staticTest;

// 4번 : 정적블록
// 대이터 베이스 연동 시 초기화 때 사용됨

public class StaticBlock {
	static {  // 정적블록 : 클래스가 로드될 때 먼저 실행된다(main메소드보다 먼저 출력)
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다2.");
	}
	
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}
	
	static {  // 정적블록
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다1.");
	}
}
