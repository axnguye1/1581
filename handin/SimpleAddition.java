//Amanda Nguyen Problem 4 SimpleAddition

import java.util.Scanner;

public class SimpleAddition{
		public static void main(String[] args){
		int result;
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter X.");
		int x = inputScanner.nextInt();
		System.out.println("Enter Y.");
		int y = inputScanner.nextInt();
		result = x + y;
		System.out.println("x+y=");
		System.out.println(result);
		}
}