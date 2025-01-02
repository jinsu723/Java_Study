package easy;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean flag = true;
        char[] aa = new char[a.length()];
        
        for(int i=0; i<aa.length; i++) {
        	aa[i] = a.charAt(i);
        }
        
        while(flag){
            if(a.length() < 1 || a.length() > 20){
            	System.out.println("입력 범위 초과");
                flag = false;
                break;
            }
            for(int i=0; i<aa.length; i++){
                if(aa[i] >= 65 && aa[i] <= 90) {
                	aa[i] += 32;
                } else if(aa[i] >= 97 && aa[i] <= 122) {
                	aa[i] -= 32;
                } else {
                	System.out.println("영문자만 입력해야 합니다");
                	flag = false;
                	break;
                }
            }
            if(!flag) {
            	break;
            }
            for(char word : aa) {
            	System.out.print(word);
            }
            flag = false;
        }
    }
}