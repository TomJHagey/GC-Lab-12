import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		List<Car> CarList = new ArrayList<>();

		Scanner scnr = new Scanner(System.in);

		System.out.println("How many cars are you entering?");

		int year = 0;
		double price = 0.00;
		String make;
		String model;
		int loop = scnr.nextInt();
		scnr.nextLine(); // remember this for when a loop may print two items at once

		new Car();

		for (int i = 0; i < loop; i++) {

			make = Validator.getString(scnr, "Enter the car's make: ");

			model = Validator.getString(scnr, "Enter the car's model: ");

			year = Validator.getInt(scnr, "Enter the car's year: ", 1900, 2019);

			price = Validator.getDouble(scnr, "Enter the car's price: ");

			System.out.println("==================");

			CarList.add(new Car(make, model, year, price));

		}

		System.out.println("Current Inventory:\n");
		for (Car next : CarList) {
			System.out.println(next);
		}

	}

}
