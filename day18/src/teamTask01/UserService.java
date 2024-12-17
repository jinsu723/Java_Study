package teamTask01;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	private List<UserVO> uvo = new ArrayList<>();
	
	public boolean checkId(String id) {
		return uvo.stream().anyMatch(user -> user.getId().equals(id));
		
	}
	
	void register(UserVO user) {
		if(checkId(user.getId())) {
			System.out.println("회원가입 실패 아이디 중복");
		} else {
			uvo.add(user);
			System.out.println("회원가입 성공");
		}
	}
}
