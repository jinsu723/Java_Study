package com.app.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.app.dao.BookDAO;
import com.app.dao.DBConnector;

public class Test {
	public static void main(String[] args) {
		// 연결 테스트
		
		try {
			Connection conn = DBConnector.getConnection();
			System.out.println("연결 성공");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("연결 실패");
		}
		
		BookDAO book = new BookDAO();
		
		System.out.println(book.bookSearch("aaa"));
	}
}
