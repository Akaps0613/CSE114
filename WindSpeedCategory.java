package hw1;

import java.util.Scanner;

public class WindSpeedCategory {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the wind speed (mph): ");
		int speed = scanner.nextInt();
		if (speed <= 1) {
			System.out.println("Wind speed category: Calm");
		} else if (speed <= 15) {
			System.out.println("Wind speed category: Light breeze");
		} else if (speed <= 30) {
			System.out.println("Wind speed category: Moderate breeze");
		} else if (speed <= 50) {
			System.out.println("Wind speed category: Strong breeze");
		} else {
			System.out.println("Wind speed category: Gale");
		}

	}

}
