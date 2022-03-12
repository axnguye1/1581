//Amanda Nguyen Problem 7 : How Odd!

import java.util.Scanner;

public class HowOdd{
		public static void main(String[] args){
			Scanner sc_object = new Scanner(System.in);
			//input an integer number
			int number = sc_object.nextInt();

			boolean result = (number%2==1);
			System.out.println(result);

		}
}