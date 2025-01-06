package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

	// 도서 검색
	public List<String> bookSearch(String bookTitle) {
		String query = "SELECT	book_number"
				+ "	  , book_title"
				+ "	  , book_author"
				+ "	  , book_rent "
				+ "FROM	tbl_book "
				+ "WHERE book_title = ?";
		
		List<String> result = new ArrayList<>();
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bookTitle);
			resultSet = preparedStatement.executeQuery();
			
			int count = 1;
			while(resultSet.next()) {
				
//				System.out.println("검색결과 " + count + " : ");
				result.add("검색결과 " + count);
				count++;
				result.add(resultSet.getString(1));
				result.add(resultSet.getString(2));
				result.add(resultSet.getString(3));
				result.add(resultSet.getString(4));
				result.add("\n");
//			if(resultSet.next()) {
//				
//				bookDTO.setBookNumber(resultSet.getInt("book_number"));
//				bookDTO.setBookTitle(resultSet.getString("book_title"));
//				bookDTO.setBookAuthor(resultSet.getString("book_author"));
//				bookDTO.setBookRent(resultSet.getString("book_rent"));
//			}
			}
				
		} catch (SQLException e) {
			System.out.println("bookSearch() sql 오류" + e.getMessage());
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	// 도서 대여
	  public void bookRent(String bookTitle, String bookAuthor) {
	      String query = "UPDATE TBL_BOOK " + "SET book_rent = ? " + "WHERE book_title = ? AND book_author = ?";
	      if (!(isBookRent(bookTitle, bookAuthor))) {
	         try {
	            connection = DBConnector.getConnection();
	            preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, "TRUE");
	            preparedStatement.setString(2, bookTitle);
	            preparedStatement.setString(3, bookAuthor);
	            preparedStatement.executeUpdate();
	            System.out.println(bookTitle + "을/를 성공적으로 대출했습니다.");
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
//	            e.printStackTrace();
	            System.out.println("bookRent() sql exception");
	         } finally {
	            try {
	               if (preparedStatement != null) {
	                  preparedStatement.close();
	               }
	               if (connection != null) {
	                  connection.close();
	               }
	            } catch (SQLException e) {
	               // TODO Auto-generated catch block
//	               e.printStackTrace();
	               System.out.println("bookRent() close exception");
	            }
	         }

	      } else {
	         System.out.println(bookTitle + "은/는 현재 다른 유저가 대출 중입니다.");
	      }

	   }

	   // isBookRent method
	   public boolean isBookRent(String bookTitle, String bookAuthor) {
	      String query = "SELECT book_rent " + "FROM tbl_book " + "WHERE book_title = ? AND book_author = ?";
	      String result = "";
	      try {
	         connection = DBConnector.getConnection();
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setString(1, bookTitle);
	         preparedStatement.setString(2, bookAuthor);
	         resultSet = preparedStatement.executeQuery();
	         if (resultSet.next()) {
	            result = resultSet.getString(1);
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
//	         e.printStackTrace();
	         System.out.println("isBookRent() sql exception");
	      } finally {
	         try {
	            if (resultSet != null) {
	               resultSet.close();
	            }
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
//	            e.printStackTrace();
	            System.out.println("isBookRen() close exception");
	         }
	      }

	      return result.equals("TRUE") ? true : false;
	   }
}
