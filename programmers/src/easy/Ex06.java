package easy;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String answer = "";
		
		for(char b : a.toCharArray()) {
			if(Character.isUpperCase(b)) {
				answer += Character.toLowerCase(b);
			}
			if(Character.isLowerCase(b)) {
				answer += Character.toUpperCase(b);
			}
		}
		System.out.println(answer);
	}
}
