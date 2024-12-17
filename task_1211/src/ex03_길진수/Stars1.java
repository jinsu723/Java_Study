package ex03_길진수;

public class Stars1 {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {  // 3행을 만든다
			for(int j=3; j>i; j--) {  // *의 위치를 조정하기 위해 공백을 순차적으로 줄인다
				System.out.print(" ");  // 공백 출력하고 줄은 바꾸지 않는다
			}
			for(int j=0; j<i+1; j++) {  // 해당 행의 번호만큼 *을 출력한다
				System.out.print("* ");  // * 출력하고 줄은 바꾸지 않는다
			}
			System.out.println();  // 줄 바꾸기
		}
	}
}
