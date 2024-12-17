package marvelTest;

// 11번 :

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		// 아이언맨(ironMan)과 헐크(hulk) 객체를 만들고 정보출력
		
		// 객체생성 초기화
		// 메소드 사용 => 출력
		MarvelHero ironMan = new MarvelHero("아이언맨", "슈트", 50);
		MarvelHero hulk = new MarvelHero("헐크", "변신", 40);
		
		ironMan.printInfo();
		hulk.printInfo();
		
		ironMan.performAction();
		hulk.performAction();
	}
}
