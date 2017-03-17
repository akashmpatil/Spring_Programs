package com.mvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mvc.dao.BookDao;
import com.mvc.modal.BookMaster;

public class BookService {

	public static void main(String[] args) throws BookNtFoundException {
		// TODO Auto-generated method stub

		List<BookMaster> bookList= new ArrayList<BookMaster>();
		
		bookList.add(new BookMaster(1,"java","abc"));
		bookList.add(new BookMaster(2,"cpp","xyz"));
		bookList.add(new BookMaster(3,"c","pqr"));
		
		BookDao bookDao= new BookDao();
		bookDao.createBook(bookList);
		bookDao.displayBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id to wich Bokk Search");
		int id=sc.nextInt();
		
		bookDao.searchBookByAssessionId(id);
		
		bookDao.sortBookByName();
		
	}

}
