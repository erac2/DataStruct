package edu.monmouth.book;
import edu.monmouth.book.*;

import edu.monmouth.hw2.BookTypes;

public class Book {

	int pages;
	double price;
	String title;
	BookTypes bookType;

	public Book(int pages, double price, String title, BookTypes bookType) {
		this.pages = pages;
		this.price = price;
		this.title = title;
		this.bookType = bookType;
	}
	
	public int pages(int pages) {
		return pages;
	}
	
	public void setPages(int pages){

		this.pages = pages;
		if(pages<=0) {
			System.out.println("Invalid Number of Pages");
			}
			}
		
	
	public double price() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
		if(price<0) {
			System.out.println("Invalid Price");
		}
	}
	
	public String title(String title) {
		return title;
	}
	
	public void setTitle(String title) throws BookException{
		this.title = title;
		if(title.length() == 0 || title==null) {
			System.out.println("Invalid Title Name");
		}
	}
	
	public BookTypes bookType() {
		return bookType;
	}
	
	public void setBookType(BookTypes bookType) {
		this.bookType = bookType;
	}
	
	public String toString() {
		return "Title: " + title + "\n"
				+ "Pages: " + pages + "\n"
				+ "Price: $" + price + "\n"
				+ "Book Type: " + bookType;
	}}