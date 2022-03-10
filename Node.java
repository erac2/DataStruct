package edu.monmouth.hw2;
import edu.monmouth.book.*;

public class Node 
{
	//HW2 book = new HW2();
	/* change this attribute to store a reference to a Book */
//	private String info;
	private Book Book; 
	private String info;
	private Node next;

	/* change this constructor so it accepts a reference to a Book */
	public Node(Book Book) {
		this.Book = Book;
		next = null;
	}

	/* change this method so it accepts a reference to  Book */
	public void setInfo(Book Book) {
		this.Book = Book;
		//   this.info = info;
	}

	/* change this method so it returns a reference to a Book */
	public String getInfo() {
		return Book;

	}

	public void setNext(Node link) {
		this.next = link;
	}

	public Node getNext() {
		return next;
	}

	@Override 
	public String toString() {
		/* change to invoke Book's toString */
		return Book.toString();
	}
}