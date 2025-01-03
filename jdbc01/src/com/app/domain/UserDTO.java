package com.app.domain;

public class UserDTO {
//	CREATE TABLE tbl_user(
//			USER_number	NUMBER
//		  , user_id		varchar2(100)
//		  , user_pw		varchar2(100)
//		  , user_name	varchar2(10)
//		  , user_age	NUMBER
//		  , user_gender char(1) DEFAULT 'M'
//		  , user_birth	DATE
//		  , CONSTRAINT pk_user PRIMARY key(user_number)
//			
//		);

	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	private String userBirth;
	
	public UserDTO() {
		
	}

	// DTO는 데이터를 전송하기 위한 목적으로 사용한다
	// 다른 기능은 넣지 않는다
	
	// 1. 모든 필드의 getter, setter를 만든다
	// 객체에 저장된 값을 유연하게 수정하고 싶은 경우
	
	// 2. setter를 만들지 않고 생성자로 필드를 초기화한다
	// 객체에 저장된 값을 수정하지 못하게 막고 싶은 경우


	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	// toString() 오버라이딩 atl+shift+s+s
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", pw=" + userPw + ", userName=" + userName
				+ ", userAge=" + userAge + ", userGender=" + userGender + ", userBirth=" + userBirth + "]";
	}

}
