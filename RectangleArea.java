package hw1;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of side 1: ");
		int side1 = scanner.nextInt();
		System.out.print("Enter the length of side 2: ");
		int side2 = scanner.nextInt();
		System.out.println("The area of the rectangle is: " + side1 * side2);
		if (side1 == side2) {
			System.out.println("This is a square.");
		} else {
			System.out.println("This is not a square.");
		}

	}

}
