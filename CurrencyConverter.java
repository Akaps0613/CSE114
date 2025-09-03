package hw1;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of pennies: ");
		int x = scanner.nextInt();
		System.out.println("Dollars: " + x / 100);
		x = x % 100;
		System.out.println("Half Dollars: " + x / 50);
		x = x % 50;
		System.out.println("Quarters: " + x / 25);
		x = x % 25;
		System.out.println("Dimes: " + x / 10);
		x = x % 10;
		System.out.println("Nickels: " + x / 5);
		x = x % 5;
		System.out.println("Pennies: " + x);
	}

}
