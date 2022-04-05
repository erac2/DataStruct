import java.util.Stack;
import java.io.*;
import java.util.*;
import java.io.StringReader;
import java.io.BufferedReader;

public class Stackk {
	
	Stack<Character> words = new Stack<Character>();

	while (true)
	{
		final String LOGFILENAME = StackConstants.LINK;

		try {
			BufferedReader read = new BufferedReader(new FileReader(LOGFILENAME));
			String word;
			while((word = read.readLine()) != null) {
				while((word.chars()) != null) {
					int i;
					words.add(word.charAt(i));
					i++;
				}
				//	strings.add(word);

			}
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file " + e);
			System.exit(StackConstants.CANT);
		} catch (IOException e) {
			System.err.println("Cannot open the file " + e);
			System.exit(StackConstants.CANT);
		}
	}
	System.out.println(words);

	private boolean second = true;
	while(second) {
		StringBuilder strings = new StringBuilder();

		//	strings = strings + words.pop();

	}
}
}

