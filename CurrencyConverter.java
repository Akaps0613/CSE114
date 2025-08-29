package Homework;
import java.util.Scanner;
public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of pennies: ");
		int pen = scanner.nextInt();
		System.out.printf("Dollars: %d",pen/100); 
		pen=pen%100;
		System.out.println();
		System.out.printf("Half Dollars: %d",pen/50);
		pen=pen%50;
		System.out.println();
		System.out.printf("Quarters: %d",pen/25);
		pen=pen%25;
		System.out.println();
		System.out.printf("Dimes: %d",pen/10);
		pen=pen%10;
		System.out.println();
		System.out.printf("Nickels: %d",pen/5);
		pen=pen%5;
		System.out.println();
		System.out.printf("Pennies: %d",pen);
		
		
		
		
		
		
	}

}
