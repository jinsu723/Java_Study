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
		
//		userDTO.setUserId("abb");
//		userDTO.setUserPw("1234");
//		userDTO.setUserName("홍길동");
//		userDTO.setUserAge(5);
//		userDTO.setUserGender("M");
//		userDTO.setUserBirth("20000101");
		
//		// 중복검사
//		System.out.println(userDAO.checkId(userDTO.getUserId()));
//		
//		// 회원가입
//		userDAO.join(userDTO);
		
		// 로그인
		System.out.println(userDAO.login("abc","1234"));
		
		// 이름과 생일로 아이디 찾기
		System.out.println(userDAO.findId("홍길동", "20000101"));
		
		// 빠른for문
		for(String id : userDAO.findId("홍길동", "20000101")) {
			System.out.println(id);
		}
		
		// 스트림 API
		userDAO.findId("홍길동", "20000101").forEach(System.out::println);
		
		// 회원 번호로 1명의 정보 조회
		UserDTO user = userDAO.findUser(1);
		System.out.println(user);
		
		
		// 회원 정보 전체 수정
//		user.setUserId("updateTest");
//		user.setUserPw("update1");
//		user.setUserName("test");
//		user.setUserAge(10);
//		user.setUserGender("W");
//		user.setUserBirth("2025-01-06");
//		userDAO.update(user);
//		System.out.println(user);
		
		// 회원 탈퇴
		if(userDAO.delete(1)) {
			System.out.println("회원 탈퇴 성공");
		} else {
			System.out.println("회원 탈퇴 실패");
		}
	}
}
