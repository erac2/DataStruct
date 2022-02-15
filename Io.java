package edu.monmouth.io;
import java.io.PrintStream;

public class Io {
	public static void main(String [] args) {
		final String FILENAME = "IO.txt";
		PrintStream st = new PrintStream(FILENAME);
		System.setErr(st);
		System.setErr(st);
		for(int i = 0; i<20; i++) {
			System.out.println("Hello");
			System.err.println("Hello");
		}
	}
}
