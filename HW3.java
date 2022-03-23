package edu.monmouth.hw3;

import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.FileReader;
import java.io.BufferedReader;
import edu.monmouth.book.*;


public class HW3 {

	public static void main(String[] args) throws BookException { ///
		// TODO Auto-generated method stub

		//Prints out into the HW3.txt
		try {    
			PrintStream st = new PrintStream(HW3Constants.OUT); 
			System.setOut(st); 
			System.setErr(st); 
		} catch(FileNotFoundException ioe) { 
			System.err.println("Cannot redirect stderr and stdout " + 
					ioe.getMessage()); 
			ioe.printStackTrace(); 
			System.exit(-1); 
		} 

		//Reads strings text onto the buffered reader
		ArrayList<String> strings = new ArrayList<String>();
		LinkedList<String> str = new LinkedList<String>();

		final String LOGFILENAME = HW3Constants.STRINGS;

		try {
			BufferedReader read = new BufferedReader(new FileReader(LOGFILENAME));
			String word;
			while((word = read.readLine()) != null) {
				strings.add(word);
				str.add(word);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file " + e);
			System.exit(HW3Constants.CANT);
		} catch (IOException e) {
			System.err.println("Cannot open the file " + e);
			System.exit(HW3Constants.CANT);
		}
		System.out.println(strings);
		System.out.println(str);
		System.out.println("");


		//Books Part
		//Adds books to ArrayList and LinkedList
		ArrayList<Book> books = new ArrayList<Book>();
		LinkedList<Book> books2 = new LinkedList<Book>();

		final String BOOKFILE = HW3Constants.BOOKS;

		try {
			BufferedReader read = new BufferedReader(new FileReader(BOOKFILE));
			String sent;
			while((sent = read.readLine()) != null) {

				Book book1 = new Book();

				String sep[] = sent.split(HW3Constants.SEPERATE);

				book1.setTitle(sep[0]);
				book1.setBookType(bookType.valueOf(sep[1]));;
				book1.setPages(Integer.parseInt(sep[2]));
				book1.setPrice(Double.parseDouble(sep[3]));

				//Prints out the books
				System.out.println(book1);	
				System.out.println("");
				books.add(book1);
				books2.add(book1);
			}

		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file " + e);
			System.exit(HW3Constants.CANT);
		} catch (IOException e) {
			System.err.println("Cannot open the file " + e);
			System.exit(HW3Constants.CANT);
		}


		//Checks to see if the strings ArrayList is empty
		if(strings.isEmpty() == true) {
			System.out.println("It's Empty");
		}
		else {
			System.out.println("It's not Empty");
		}

		//Removes the first index in the strings array
		strings.remove(1);

		//Returns the size of the array
		System.out.println("Size: " + strings.size());

		//Adds to the strings array
		strings.add("Monmouth Class");

		//Returns the strings array list
		Iterator<String> iterator = strings.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("");

		//Prints out the array in reverse order
		ListIterator listIterator = strings.listIterator(strings.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("");
	
		//Books2 LinkedList

		//Prints out the list in reverse order
		ListIterator bookIterator = books2.listIterator(books2.size());
		while(bookIterator.hasPrevious()) {
			System.out.println(bookIterator.previous());
			System.out.println("");
		}
		System.out.println("");

		//Prints out the list in the books class
		Iterator<Book> iterator2 = books2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			System.out.println("");
		}

		if(books2.contains("Data Structures and Algorithms,SOFTBACK,426,79.99")) {
			System.out.println("The LinkedList Contains");
		}
		else {
			System.out.println("The LinkedList does not contain");
		}
		
		if(books2.contains("Eater")) {
			System.out.println("The LinkedList Contains");
		}
		else {
			System.out.println("The LinkedList does not contain");
		}
		
		
		//Removes 2nd index of the Book.
		try {
		books2.remove(4);
		} catch(IndexOutOfBoundsException i) {
			System.out.println("Out of Range: " + i);
		}
		
		
		//Removes the 80th index. Could possibly 
		try {
		books2.remove(80);
		} catch(IndexOutOfBoundsException e) {
			System.err.println("Out of Range: " + e);
		}
	}

}