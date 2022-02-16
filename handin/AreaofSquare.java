//Amanda Nguyen Problem 1 Area of A Square

import java.util.Scanner;

class SquareArea {
	public static void main (String[] args)
	{

	System.out.println("How long is the square length?");
	Scanner scanner = new Scanner(System.in);
	double side = scanner.nextDouble();
	double area = side*side;
	System.out.println("The Area of the Square is "+area);
	}
}

