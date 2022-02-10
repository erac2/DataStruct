package vehicle;

public class DriveCar {

	private static int SIZE = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car cars[] = new Car[SIZE];
		cars[0] = new Car(10);
		cars[1] = new Car(110);
		cars[2] = new Car(210);
		cars[3] = new Car(310);
		changeCars(cars);
		System.out.println(allCars(cars));

	}

	static void changeCars(Car myCars[]) {
		for(int i=0; i<myCars.length; i++) {
			myCars[i].setEngineSize(i);
		}
	}

	static String allCars(Car cars[]) {
		String returnValue = "";
		for(Car car : cars) {
			returnValue = returnValue + " " + car.toString();
		}
		return returnValue;
	}

}
