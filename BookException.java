package edu.monmouth.book;

public class BookException extends Exception {

	public BookException(){
		super();
	}
	
	public BookException(BookException e) {
		super(e);
	}
}
