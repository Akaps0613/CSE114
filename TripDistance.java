package hw1;

import java.util.Scanner;

public class TripDistance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of minutes traveled: ");
		double min = scanner.nextDouble();
		System.out.print("Input the speed of the vehicle in miles per hour: ");
		double speed = scanner.nextDouble();
		System.out.print("Input the fuel efficiency in miles per gallon: ");
		double effi = scanner.nextDouble();

		double x = (min / 60) * speed;
		double y = x / effi;

		System.out.printf("Miles traveled: %.1f", x);
		System.out.println();
		System.out.printf("Gallons of fuel used: %.3f", y);

	}

}
