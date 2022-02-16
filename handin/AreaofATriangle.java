//Amanda Nguyen Problem 5 AreaofATriangle

import java.util.Scanner;
class AreaofATriangle {
		public static void main(String args[]) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("What is the Width of the Triangle?");
			double base = scanner.nextDouble();

			System.out.println("What is the height of the Triangle?");
			double height = scanner.nextDouble();

			double area = (base* height)/2;
			System.out.println("Area of Triangle is "+ area);
		}
}