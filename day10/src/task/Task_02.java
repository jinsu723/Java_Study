package task;

public class Task_02 {
//	2. BasicTv 클래스를 작성하세요
//	필드 :
//	boolean power : TV 전원 상태 (기본값: false)
//	int channel : TV 채널 (기본값: 1)
//	String color : TV의 색상
//	int size : TV의 크기
//	int price : TV의 가격
//
//	메서드:
//	void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//	      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//	void channelUp() : 채널을 1씩 증가시키는 메서드
//	      채널 최대값 999
//	void channelDown() : 채널을 1씩 감소시키는 메서드
//	      채널 최소값 1
	
	// 필드 생성
	// 논리형 power;
	// 정수형 channel  = 1;
	// 문자열 color;
	// 정수형 size;
	// 정수형 price;
	boolean power;  // 전원의 상태 기본값 : false
	int channel = 1;  // 체널 번호 1로 초기화
	String color;  // Tv의 색상 기본값 null
	String size;  // Tv의 크기 기본값 0
	int price;  // Tv의 가격 기본값 0
	
	// 메소드
	// 전원 켜기 메소드
	// 논리형으로 !연산자 사용
	// 전원버튼 누른 후 현제 전원 상태 출력
	void powerOnOff() {  // 전원버튼이 눌렸다
		power = !power;  // 꺼져있으면 켜고 켜져있으면 끄기
		System.out.println(power ? "TV 전원이 켜졌습니다." : "TV 전원이 꺼졌습니다.");
		// 현제 전원의 상태를 알려주기 true면 켜짐 false면 꺼짐
	}
	
	// 체널 올리기 메소드
	// 전원이 true인지 확인
	// false라면 전원 켜야 한다고 알려주기
	// 체널의 현제 값을 판단하고 999 미만이라면 올려주기
	// 올려진 체널 출력
	void channelUp() {  // 체널 올리기
		if(power) {  // 전원의 상태 확인 켜져있다면
			if(channel < 999) {  // 체널이 최고번호인 999 아래라면
				channel++;  // 체널 올려주기
				System.out.println("현제 체널 : [" + channel + "]");  // 현제 체널 알려주기
			} else {  // 체널이 999가 되었다
				System.out.println("더이상 체널을 올릴 수 없습니다.");  // 더이상 체널을 올릴 수 없음
			}
		} else {  // 전원이 내려가있음
			System.out.println("TV 전원을 먼저 켜주세요.");  // 전원의 상태 알려주기
		}
	}
	
	// 체널 내리기 메소드
	// false라면 전원 켜야 한다고 알려주기
	// 체널의 현제 값을 판단하고 1이상이라면 내려주기
	// 내려진 체널 출력
	void channelDown() {  // 체널 내리기
		if(power) {  // 전원의 상태 확인 켜져있다면
			if(channel > 1) {  // 체널이 1보다 내려갈 수 없음 체널이 1보다 크다면
				channel--;  // 체널 1 내려주기
				System.out.println("현제 체널 : [" + channel + "]");  // 현제 체널 알려주기
			} else {  // 체널이 최소값인 1이라면
				System.out.println("더이상 체널을 내릴 수 없습니다.");  // 더이상 내릴 수 없다고 알려주기
			}
		} else {  // 전원이 내려가 있다면
			System.out.println("TV 전원을 먼저 켜주세요.");  // 현제 전원의 상태 알려주기
		}
	}
}
