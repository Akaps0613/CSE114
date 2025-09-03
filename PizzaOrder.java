package hw1;

import java.util.Scanner;

public class PizzaOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of pizzas: ");
		int num = scanner.nextInt();
		if (num < 3) {
			System.out.printf("The total cost of your order is: %d (%d pizzas at $12 each + $3 delivery fee)",
					num * 12 + 3, num);
		} else {
			System.out.printf("The total cost of your order is: %d (%d pizzas at $12 each)", num * 12, num);
		}
	}

}
