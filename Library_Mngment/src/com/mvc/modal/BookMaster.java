package com.mvc.modal;

import java.util.concurrent.atomic.AtomicInteger;

public class BookMaster {
	private String bookName;
	private String bookAuthor;
	private int assessionNo;
	private int bookId;
	 private static final AtomicInteger count = new AtomicInteger(0); 
	
	 public BookMaster()
	 {
		 
	 }
	 
	 public BookMaster(int i, String BookName, String BookAuthor) {
		// TODO Auto-generated constructor stub
		this.assessionNo=i;
		this.bookName=BookName;
		this.bookAuthor=BookAuthor;
		   this.bookId = count.incrementAndGet(); 
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getAssessionNo() {
		return assessionNo;
	}
	public void setAssessionNo(int assessionNo) {
		this.assessionNo = assessionNo;
	}

	
	
	
}
