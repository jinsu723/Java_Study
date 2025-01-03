package com.app.test;

import com.app.dao.UserDAO;
import com.app.domain.UserDTO;

public class Test {
	public static void main(String[] args) {
		// 연결 테스트
		
//		try {
//			Connection conn = DBConnector.getConnection();
//			System.out.println("연결 성공");
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("연결 실패");
//		}
		
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		
		userDTO.setUserId("abc");
		userDTO.setUserPw("1234");
		userDTO.setUserName("홍길동");
		userDTO.setUserAge(5);
		userDTO.setUserGender("M");
		userDTO.setUserBirth("20000101");
		
		System.out.println(userDAO.checkId(userDTO.getUserId()));
	}
}
