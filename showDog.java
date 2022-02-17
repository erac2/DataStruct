package edu.monmouth.assignment1;

public class showDog extends Dog{

	private String breed;
	
	//Sets up show dog so that person can initiate from AnimalTester
	public showDog(String color, String breed) {
		super(color);

		this.breed = breed;
	}

	//Gets breed of Dog
	public String getBreed() {
		return breed;
	}

	//Sets breed of Dog
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println(AnimalConstants.SHOWDOGSOUND);
	}

	@Override
	public void move() {
		System.out.println(AnimalConstants.GUARDDOGMOVE);
	}

	@Override
	public String toString() {
		return "Color: " + color + "\n" +
				"Breed: " + breed;
	}
}


