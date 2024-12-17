package constantTest;

  // 6번 : enum

public class EnumTest {
	enum Day{
		SUNDAY(false), MONDAY(true), TUESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);
		
		// 필드
		boolean week;
		
		// 생성자
		Day(boolean week){
			this.week = week;
		}
		
		// 메소드
		boolean weekDay() {
			return this.week;
		}
	}
	
	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		
		System.out.println("오늘은 " + today + "입니다.");
		
		// switch문을 사용한 열거형 상수 처리
		String result;
		switch(today) {
		case MONDAY:
			result = "월요일";
			break;
		case TUESDAY:
			result = "화요일";
			break;
		case FRIDAY:
			result = "금요일";
			break;
		default:
			result = "다른 요일";
			break;
		}
		System.out.println("오늘은 " + result + "입니다.");
		
		Day[] days = Day.values();  // 모든 열거형 값을 배열로 가져오는 메소드
		System.out.println(days);
		for(Day day : days) {
			if(day.weekDay()) 
			System.out.println(day);
		}
		
	}
}
