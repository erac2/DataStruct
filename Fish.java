package edu.monmouth.assignment1;

public class Fish implements Animal{

	protected String color;
	
	//Sets up Fish object so it can be initiated from tester
	public Fish(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		color = this.color;
	}
	
	@Override
	public String toString() {
		return "Color: " + color;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(AnimalConstants.FISHMOVE);
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(AnimalConstants.FISHSOUND);
	}
	
	
}
