package teamTask01;

public class Main {
	public static void main(String[] args) {
		UserService us = new UserService();
		
		UserVO user1 = new UserVO(1, "aaa", "111", "길진수", 20);
		UserVO user2 = new UserVO(2, "aaa", "111", "길진수", 20);
		UserVO user3 = new UserVO(3, "ccc", "111", "길진수", 20);
		UserVO user4 = new UserVO(3, "ddd", "111", "길진수", 20);
		
		us.register(user1);
		System.out.println("1");
		us.register(user2);
		System.out.println("2");
		us.register(user3);
		System.out.println("3");
		us.register(user4);
	}
}
