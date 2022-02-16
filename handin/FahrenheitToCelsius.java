// Amanda Nguyen Problem 7: FarenheitToCelsius
import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String[] args){

		Scanner sc_object = new Scanner(System.in);
		System.out.println("How many Fahrenheit would you like to convert?");
		double fahrenheit = sc_object.nextDouble();

		double celsius = ( fahrenheit - 32) * (5.0/9.0);
		System.out.println(celsius +" celsius");
	}
}