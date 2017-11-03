import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		char idLoop = 'y';
		while ((idLoop == 'y')) {
			System.out.println("Welcome to the Grand Circus Motors admin console!");
			System.out.println("how many cars are you entering: ");
			Scanner scan = new Scanner(System.in);
			int numCars = scan.nextInt();
			ArrayList<carDetails> cars = new ArrayList<carDetails>(numCars);
			for (int i = 0; i < numCars; i++) {
				String makeCar = Validator.getString(scan, "Enter car #" + (i + 1) + " make : ");
				String modelCar = Validator.getString(scan, "Enter car #" + (i + 1) + " model : ");
				int yearCar = Validator.getInt(scan, "Enter car #" + (i + 1) + " year : ", 1000, 3000);
				double priceCar = Validator.getDouble(scan, "Enter car #" + (i + 1) + " price : ", 0,
						Integer.MAX_VALUE);

				cars.add(new carDetails(makeCar, modelCar, yearCar, priceCar));
			}
			for (carDetails tempPrint : cars) {
				System.out.printf(tempPrint.toString());
			}
			System.out.println("Would you like find more stats?(Y/N)");
			while (!scan.hasNext("[yYnN]")) {
				System.out.println("Enter y to find more stats or n to quit");
				scan.next();
			}
			idLoop = scan.next().charAt(0);

		}
	}
}
