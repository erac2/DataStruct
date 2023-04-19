package edu.monmouth.tree;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;


public class TreeApp {
	public static void main(String[] args) throws IOException {
		// verify there is 1 and only 1 command line argument

		// InputStream file = new FileInputStream(args[0]);
		// load the properties file using command line argument
		Properties prop = new Properties();

		final String LOGFILENAME = TreeConstants.LINK;
		//The FileReader reads the file provided

		try {
			BufferedReader read = new BufferedReader(new FileReader(LOGFILENAME));
			prop.load(read);
		}
		catch(FileNotFoundException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(TreeConstants.CANT);
		}
		catch(IOException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(TreeConstants.CANT);
		}

		// list all properties to System.out
		prop.list(System.out);

		// obtain the value of log_file_name property
		String newName = prop.getProperty("log_file_name");

		// redirect stdout & stderr to the value of log_file_name
		try {
			PrintStream st = new PrintStream(newName); 
			System.setOut(st); 
			System.setErr(st); 
		} catch(FileNotFoundException ioe) {
			System.err.println("Cannot redirect stderr and stdout " + 
					ioe.getMessage()); 
			ioe.printStackTrace(); 
			System.exit(-1); 
		}

		// obtain the value of node_values property
		String newLine = prop.getProperty("node_values");

		// create an instance of the Tree class
		Tree tree = new Tree();
		tree.min();
		tree.max();
		tree.find(10);

		int key;
		double value;

		String[] split = newLine.split(TreeConstants.SEPERATE);
		String[] keySplit2 = newLine.split(";");
		for(String line : keySplit2) {
			key = Integer.parseInt(split[0]);
			value = Double.parseDouble(split[1]);
			tree.insert(key, value);
		}

		// print out the keys using inorder
		tree.traverse(2);

		// determine if the value 12 is in the tree
		System.out.println("Find 12: ");
		tree.find(12);

		// determine if the value 80 is in the tree
		System.out.println("Find 80: ");
		tree.find(80);
		// print out the minimum value in the tree 
		tree.min();
		// print out the maximum value in the tree      
		tree.max();

	} 

}