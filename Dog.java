package edu.monmouth.assignment1;

public class Dog implements Animal{

	protected String color;

	public Dog(String color) {
		this.color = color;
	}
	public void setFurColor(String color) {
		this.color = color;
	}
	public String getFurColor() {
		return color;
	}

	@Override
	public void makeSound() {
		System.out.println(AnimalConstants.DOGSOUND);
	}

	@Override
	public void move() {
		System.out.println(AnimalConstants.DOGMOVE);
	}
	
	@Override
	public String toString() {
		return "Color " + color;
	}
}
