package easy;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        System.out.println(11/100);
        
        while(number>0){
//        	System.out.println((number+"").length());
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
