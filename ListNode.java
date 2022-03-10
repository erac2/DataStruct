package edu.monmouth.hw2;
import edu.monmouth.book.*;

public class ListNode {

	private Node head;
	private Book b;
	private int countSize;

	public ListNode() {
		head = null;
	}

	public Node removeFirst() {
		/* placeholder */
		return head;
		//

	}

	public Node first() {
		/* placeholder */
		return head;
	}

	public Node last() {
		/* placeholder */
		while(head == null) {
			return null;
		}
		Node booky = head;
		while(booky.getNext()!=null) {
			booky = booky.getNext();
		}
		return booky;
	}

	public void insert(Book B) {
		Node newNode = new Node(B);
		newNode.setNext(head);
		head = newNode;
		countSize++;

	}

	public void insertEnd(Book B) {
		/* placeholder */
		if(head == null) {
			return;
		}
		Node newNode = new Node(B);
		Node booky = head;
		while(booky.getNext()!=null) {
			booky = booky.getNext();
		}
		booky.setNext(newNode);
		countSize++;

	}

	public boolean isEmpty() { 
		if(head == null) {
		return true;              
	}
		else {
			return false;
		}
		}

	public int size() {
		/* placeholder */
		return countSize;
	}

	public void clear() {
		head = null;
	}

	@Override
	public String toString() {
		StringBuilder logString = new StringBuilder();
		Node node;
		node = head;
		int count = 0;

		while (node != null) {
			count++;
			logString.append(count + " . " + node.getInfo() + "\n");
			node = node.getNext();
		}
		return logString.toString();
	}
}