package pccp_videoPlayer;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("동영상재생기");
		
		String[] commend1 = {"next", "prev"};
		String[] commend2 = {"prev", "next", "next"};
		String[] commend3 = {"next"};
		
	}
}


class Solution {
	String video_len;
	String pos;
	String op_start;
	String op_end;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

    	// 오프닝 건너뛰기 실행
    	int mm = 0; // 분
    	int ss = 0; // 초
    	boolean run = true;
    	String answer = "";
    	
    	System.out.println("프로그램 시작");
    	
//    	while(run) {
//    		for(int i=0; i<commands.length; i++) {
//    			if(pos >= op_start || pos <= op_end)
//    		}
//    	}
        return answer;
    }
    
 // 10초 전으로 가기 문자열 매개변수
 // 10초 앞으로 이동
 // 이동한 구간이 오프닝 구간이라면 오프닝 건너뛰기 호출
 // 이동해서 동영상이 끝나는 구간을 초과하면 동영상 end포인트로 이동
 // 이동한 구간 리턴
    String commendPev(String commend) {
    	if(commend.equals("prev")) {
    		return commend;
    	}
		return commend;
    	
    }
    
 // 10초 뒤로 가기 문자열 매개변수
 // 10초 넘기기
 // 이동한 구간이 동영상이 시작하는 부분을 초과한다면 00분 00초로 이동
 // 이동한 구간 리턴
    
 // 오프닝 건너뛰기
 // 입력받은 동영상의 위치가 오프닝 구간이라면 건너뛰기 실행
 // 오프닝 건너뛰고 op_end 리턴
}

