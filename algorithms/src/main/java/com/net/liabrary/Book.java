package com.net.liabrary;

public class Book {
	private int pageCount;
	private String bookName;
	private String author;
	private double price;
	private String publisher;
	private String language;

	public Book(int pageCount, String bookName, String author, double price, String publisher, String language) {
		super();
		this.pageCount = pageCount;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.language = language;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Book [pageCount=" + pageCount + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + ", language=" + language + "]";
	}
	
	

}
