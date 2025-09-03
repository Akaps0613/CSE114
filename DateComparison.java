package hw1;

import java.util.Scanner;

public class DateComparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first date (day month year): ");
		String x = scanner.nextLine();
		System.out.print("Enter the second date (day month year): ");
		String y = scanner.nextLine();
		String[] temp1 = x.split(" ");
		String[] temp2 = y.split(" ");
		for (int i = 2; i >= 0; i--) {
			if (Integer.valueOf(temp1[i]) < Integer.valueOf(temp2[i])) {
				System.out.println("The first date is earlier than the second date.");
				return;
			} else if (Integer.valueOf(temp1[i]) < Integer.valueOf(temp2[i])) {
				System.out.println("The first date is later than the second date.");
				return;
			}
		}
		System.out.println("The first date and the second date are the same.");

	}

}
