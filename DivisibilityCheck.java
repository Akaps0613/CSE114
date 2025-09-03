package hw1;
import java.util.Scanner;

public class DivisibilityCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = scanner.nextInt();
		boolean and = false;
		boolean or = false;
		boolean either = false;
		if (x % 2 == 0 && x % 3 == 0) {
			and = true;
		}
		if (x % 2 == 0 || x % 3 == 0) {
			or = true;
		}
		if (x % 2 == 0 && x % 3 != 0) {
			either = true;
		}
		if (x % 2 != 0 && x % 3 == 0) {
			either = true;
		}
		System.out.println("Is 18 divisible by 2 and 3? " + and);
		System.out.println("Is 18 divisible by 2 or 3? " + or);
		System.out.println("Is 18 divisible by 2 or 3, but not both? " + either);
	}

}
