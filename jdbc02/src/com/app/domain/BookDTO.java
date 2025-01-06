package com.app.domain;

public class BookDTO {
	private int bookNumber;
	private String bookTitle;
	private String bookAuthor;
	private String bookRent;
	
	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String booAuthor) {
		this.bookAuthor = booAuthor;
	}
	public String getBookRent() {
		return bookRent;
	}
	public void setBookRent(String bookRent) {
		this.bookRent = bookRent;
	}
	
	
	@Override
	public String toString() {
		return "BookDTO [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookRent=" + bookRent + "]";
	}
	
	
}
