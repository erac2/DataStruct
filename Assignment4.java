import java.util.Stack;
import java.io.*;
import java.util.*;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Assignment4 {

	//This system checks to see if the words are palindromes
	public static boolean isPalindrome(String i) {
		Stack<Character> words = new Stack<>();

		for(int in=0; in<i.length(); in++) {
			words.push(i.charAt(in));
		}
		StringBuilder pal = new StringBuilder();
		while(!words.isEmpty()) {
			pal.append(words.pop());
		}
		if(pal.toString().equals(i)) {
			return true;
		}
		else {
			return false;
		}
	}

	//Main method
	public static void main(String[]args) throws IOException
	{
		//Sets the LOGFILENAME as the reference to the file
		final String LOGFILENAME = StackConstants.LINK;
		//The FileReader reads the file provided
		FileReader read = new FileReader(LOGFILENAME);
		//Properties is established to bring out the properties within the file
		Properties prop = new Properties();
		prop.load(read);
		try {
			prop.load((new FileInputStream(LOGFILENAME)));
		}
		catch(FileNotFoundException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(StackConstants.CANT);
		}
		String newLine = prop.getProperty("words");
		String[] split = newLine.split(",");
		String out = "";

		///Prints out the palindromes and which aren't palindromes
		for(int i=0; i<split.length; i++) {
			if(isPalindrome(split[i])) {
				out = out + split[i] + " is Palindrome \n";
			}
			else {
				out = out + split[i] + " is not Palindrome \n";
			}
		}

		//Writing to the file
		try {
			String newName = prop.getProperty("log_file_name");
			FileWriter newFile = new FileWriter(newName);
			newFile.write(out);
			newFile.close();
		}catch(IOException e){
			System.out.println("Error");
			System.exit(StackConstants.CANT);
		}

		System.out.println(out);



		/**	System.out.println(newName);
		System.out.println(newFile);
			System.out.println(out);
			newFile.write(out);
			newFile.close();*/
	}


}

