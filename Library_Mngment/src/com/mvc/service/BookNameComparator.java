package com.mvc.service;

import java.util.Comparator;

import com.mvc.modal.BookMaster;

public class BookNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		BookMaster b1=(BookMaster) o1;
		BookMaster b2=(BookMaster) o2;
		return b1.getBookName().compareTo(b2.getBookName());
	}

}
