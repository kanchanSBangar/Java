package com.net.liabrary;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void insertBookIntoLiabrary() {
		Liabrary liabrary = new Liabrary();
		
		Book newBook1 = new Book(1500, "Chaddi", "author 1", 150.00, "BalBharati", "English");	
		Book newBook2 = new Book(1500, "Chaddi", "author 2", 150.00, "BalBharati", "English");
		Book newBook3 = new Book(1500, "Chaddi", "author 3", 150.00, "BalBharati", "English");
		Book newBook4 = new Book(1500, "Chaddi", "author 4", 150.00, "BalBharati", "English");
		
		
		
		liabrary.addBook(newBook1);		
		liabrary.addBook(newBook2);
		liabrary.addBook(newBook3);
		liabrary.addBook(newBook4);
		
		Assert.assertEquals("Author is not matching", "author 1", liabrary.getBook().get(0).getAuthor());
		
		
	}

}
