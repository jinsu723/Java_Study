package task;

import java.util.Scanner;

public class TeamTask04 {
    public static void main(String[] args) {
    	//메서드로 인해 코드분리하기
    	//1번 메서드 → main메서드
    	//회원가입 진행하는 첫부분 시작하기 → 메세지 시작
    	//각 메세지에 입력값 받기 위한 스캐너 입력
    	//2번 메서드 → 회원가입을 진행하기 위한 입력 폼 확인 진행
    	//3번 메서드 → 아이디, 닉네임 중복 검사 진행
    	//일단 id와 닉네임을 각 배열로 하여 존재값 비교대상자
    	//4번 메서드 → 비번을 아스키코드 변환 후 변수에 저장 후 리턴
    	//각 메서드에서 구현부로 통해 구현된 리턴값을 받아서 2번 몰빵 후 main쪽에서 결과 출력하기
    	
    	
    	TeamTask04 tt = new TeamTask04();
        Scanner input = new Scanner(System.in); //입력 스캐너
        String[] userIdArray = {"admin", "test", "user"}; //중복되는 아이디 배열로 지정
        String[] userNameArray = {"어드민", "테스트", "유저"}; //중복되는 닉네임 배열로 지정

        System.out.println("회원가입을 시작합니다."); //메세지
        System.out.print("아이디를 입력하세요: "); //아이디 요구 메세지
        String userId = input.nextLine(); //아이디 입력

        System.out.print("닉네임을 입력하세요: "); //닉네임 요구 메세지
        String userName = input.nextLine(); //닉네임 입력

        System.out.print("비밀번호를 입력하세요: "); //비번 요구 메세지
        String password = input.nextLine(); //비번 입력

        System.out.print("비밀번호 확인을 입력하세요: "); //비번확인 요구 메세지
        String confirmPassword = input.nextLine(); //비번확인을 위해 재입력

        //result에 signUp메서드에 값 전달
        String result = tt.signUp(userIdArray, userNameArray, userId, userName, password, confirmPassword);
        System.out.println(result); //최종 결과 표시
    }

    //회원가입을 진행하기 위한 메서드, 각 매개변수에서는 중복확인하기 위한 배열2개와 입력한 값이 저장된 변수를 지정
    //어차피 signup메서드 내부에서 사용하는것이기 때문에 매개변수와 main내부에 선언된 변수명이 똑같아도 해도 상관 없다
    String signUp(String[] userIdArray, String[] userNameArray, String userId, String userName, String password, String confirmPassword) {
        if (isDuplicate(userIdArray, userId)) {	// 아이디 중복 검사이다. 이는 isDuplicate메서드의 도움을 받는다
            return "이미 존재하는 아이디입니다.";
        }else if (isDuplicate(userNameArray, userName)) { // 닉네임 중복 검사이다. 이는 isDuplicate메서드의 도움을 받는다
            return "이미 존재하는 닉네임입니다.";
        }else if (!password.equals(confirmPassword)) { // 비밀번호 검사이다. 이는 isDuplicate메서드의 도움을 받는다, else if문으로 해야 비번 검사 조건식이 들어가진다
            return "비밀번호가 일치하지 않습니다.";
        }

        // 비밀번호를 ASCII 코드로 변환 해주기 위해 convertToAscii로 넘겨준다
        String asciiPassword = convertToAscii(password); //어차피 비번은 최종적으로 password나 confirmPassword나 동일하기 때문에 둘 중 하나만 넘겨준다
        String result = userName + "님 환영합니다, 아이디는 " + userId + ", 비밀번호는 {" + asciiPassword + "} 입니다.";
        return  result;// 회원가입 성공 메시지를 반환해준다(이 메세드가 회원가입 메서드이기 때문에 여기에 추가)
    }

    // 중복 확인을 해주는 메서드이다. 이는 각 아이디와 닉네임을 중복검사해준다
    // 위 signUp메서드에서 값을 전달 받음 즉 signUp메서드에서는 main의 충분한 값을 받았고 그 값을 처리함과 동시에 isDuplicate가 받았다
    boolean isDuplicate(String[] array, String value) {
        for (String data : array) { //빠른For문을 사용하여 간결함으로 진행
            if (data.equals(value)) {
                return true; //모든 배열을 순회 하면서 중복된 값을 체크
            }
        }
        return false; //없다면 false를 반환
    }

    // 비밀번호를 ascii 코드로 변환하는 메서드
    String convertToAscii(String input) { //input을 매개변수
        String asciiResult = ""; // 암호화될 값을 저장할 공간
        for (char ch : input.toCharArray()) { //isDuplicate에서 사용한것과 동일, 하지만 배열이 아니기 때문에 매개변수는 String으로 지정
            asciiResult += (int) ch; // 아스키 값
        }
        return asciiResult; // 최종적으로 비번을 아스키코드로 암호화한 값을 반환해주기 위해 return
    }
}