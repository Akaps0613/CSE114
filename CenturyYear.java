package hw1;

import java.util.Scanner;

public class CenturyYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		if (year % 100 == 0 && year % 400 != 0) {
			System.out.println("1900 is a century year");
		} else
			System.out.println("1900 is not a century year");
	}

}
