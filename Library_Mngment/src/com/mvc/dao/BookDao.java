package com.mvc.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.mvc.modal.BookMaster;
import com.mvc.service.BookNameComparator;
import com.mvc.service.BookNtFoundException;

public class BookDao {

	List<BookMaster> bookList= new ArrayList<BookMaster>();
	public void createBook(List<BookMaster> bookList1)
	{
		bookList=bookList1;
		System.out.println("Book Created Successfully");
	}
	
	public void displayBook()
	{
	
		Iterator itr=bookList.iterator();
		while(itr.hasNext())
		{
			BookMaster BookName=(BookMaster) itr.next();
			System.out.println("Book"+BookName.getBookName());
		}
		
	}
	
	public void searchBookByAssessionId(int id) throws BookNtFoundException
	{
		
		for(BookMaster searchBook:bookList)
		{
			if(searchBook.getAssessionNo()==id)
			{
				System.out.println("Book Found"+searchBook.getBookName());
				break;
			}
			else
			{
				//System.out.println("Not Found");
			throw new BookNtFoundException("Not Found Please Give Money First");
			}
			
		}
		
	}

	public void sortBookByName() {
		Collections.sort(bookList,new BookNameComparator());
		System.out.println("After sorting BookByName");
		Iterator itr=bookList.iterator();
		while(itr.hasNext())
		{
			BookMaster BookName=(BookMaster) itr.next();
			System.out.println("Book"+BookName.getBookName());
		}
	}
	
}
