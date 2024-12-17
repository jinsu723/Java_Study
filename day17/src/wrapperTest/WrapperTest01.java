package wrapperTest;

public class WrapperTest01 {
	public static void main(String[] args) {
		// 기본 자료형 -> Wrapper 클래스(박싱)
		int num1 = 10;
		System.out.println(num1);
		Integer iNum1 = Integer.valueOf(num1);
		System.out.println(iNum1);
		
		// Wrapper 클래스 -> 기본 자료형(언박싱)
		int unNum1 = iNum1.intValue();
		System.out.println(unNum1);
		
		// 자동 박싱(AutoBoxing)
		double num2 = 1.1;
		Double dNum = num2;
		System.out.println(dNum);
		
		// 자동 언박싱(AutoUnBoxing)
		double unNum2 = dNum;
		System.out.println(unNum2);
		
		
		
		
		
	}
}
