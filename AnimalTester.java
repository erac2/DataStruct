package edu.monmouth.assignment1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AnimalTester {

	public static void main(String[] args) {
		
		final String LOGFILENAME = "/Users/ibalo45/eclipse-workspace/DataStructures/src/edu/monmouth/assignment1/HW1"; 
		try {    
		        PrintStream st = new PrintStream(LOGFILENAME); 
		        System.setOut(st); 
		        System.setErr(st); 
		} catch(FileNotFoundException ioe) { 
		        System.err.println("Cannot redirect stderr and stdout " + 
		ioe.getMessage()); 
		        ioe.printStackTrace(); 
		        System.exit(-1); 
		} 

		//Declares array for class full of animals

		Animal allAnimals[] = new Animal[AnimalConstants.NUMBEROFANIMALS];

		//Characterizes each animal and adds them to the array
		//Adding 7 animals in class of 10

		allAnimals[0] = new Fish("Red");
		allAnimals[1] = new guardDog("Red", (short) 10);
		allAnimals[2] = new showDog("Red", "Pitbull");
		allAnimals[3] = new showDog("Black", "Pitbull");
		allAnimals[4] = new guardDog("Orange", (short) 5);
		allAnimals[5] = new showDog("White", "Rottweiller");
		allAnimals[6] = new Fish("Pink");
		allAnimals[7] = new Fish("Silver");

		//First for loop with takes out each animal from array
		
		for(int d = 0; d<allAnimals.length; d++) {
			if(allAnimals[d] != null) { //if the array spot is 
				System.out.println(allAnimals[d].toString());
				allAnimals[d].move();
				allAnimals[d].makeSound();
				System.out.println();
			}
		}
		
		//2nd loop taking out each animal from array

		for(Animal eachAnimal : allAnimals) {
			if(eachAnimal != null) {
				System.out.println(eachAnimal.toString());
				eachAnimal.makeSound();
				eachAnimal.move();
				System.out.println();
			}
		}
		
		//3rd loop  executing all the animals within the array

		int eachAnimal = 0;
		while(allAnimals[eachAnimal] != null) {
			System.out.println(allAnimals[eachAnimal].toString());
			allAnimals[eachAnimal].makeSound();
			allAnimals[eachAnimal].move();
			eachAnimal++;
			System.out.println();
		}

	}


}


