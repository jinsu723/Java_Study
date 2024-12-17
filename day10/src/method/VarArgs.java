package method;

// 13번 : 가변길이 매개변수

public class VarArgs {
	public static void main(String[] args) {
		VarArgs number = new VarArgs();
		System.out.println(number);
		number.printNumbers(1, 2, 3);
		number.printNumbers(1, 2, 3, 4, 5);
		number.printNumbers(10);
	}
	
	void printNumbers(int ... numbers) {
		System.out.println(numbers);
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
