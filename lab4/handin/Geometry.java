//Amanda Nguyen Problem 1 Geometry
import java.util.Scanner;
public class Geometry {
	

	public static double getAreaRectangle(double width, double length) {
		return length * width;
	}
	public static double getAreaCircle(double radius) {
		return Math.PI * radius * radius;
	}
	public static double getAreaTriangle(double base, double height) {
		return ( (base * height) * 0.5);
	}
	public static double getPerimeterRectangle(double width, double length ) {
		return (2*(length+width));
	}
	public static double getPerimeterCircle(double radius) {
		return((Math.PI * 2) * radius);
	}
	public static double getPerimeterTriangle( double side1, double side2, double side3){
		return side1 + side2 +side3;
		}
	
}
