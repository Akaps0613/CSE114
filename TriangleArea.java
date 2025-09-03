package hw1;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		double base = scanner.nextDouble();
		System.out.print("Enter the heigth of the triangle: ");
		double height = scanner.nextDouble();
		System.out.println("The area of the triangle is: " + 0.5 * base * height);
	}

}
