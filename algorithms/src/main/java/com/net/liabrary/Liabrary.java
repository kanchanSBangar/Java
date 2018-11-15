package com.net.liabrary;

import java.util.LinkedList;

public class Liabrary {
	
	//LinkedList<Book> book = new LinkedList<Book>();	
	LinkedList<Book> book = new LinkedList<Book>();

	public LinkedList<Book> getBook() {
		return book;
	}

	public void addBook(Book newBook) {
		book.add(newBook);
	}	
	
}
