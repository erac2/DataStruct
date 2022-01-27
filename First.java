
class Car {
	private char color;
	private int size;
	int getSize() {
		return size;
	}
	char getColor()
	{
		return color;
	}
	public void setColor(char color)
	{
		this.color = color;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	
}
public class First {

	public static void main(String[] args) {
		short offset = 4;
		foo(offset);
		
		Car mycar;
		mycar = new Car();
	}
	
	static void foo(Object o)
	{
		System.out.println("Received " + o);
	}
}
