//Amanda Nguyen Problem 5 Student Grader

import java.util.Scanner;

public class StudentGrader{
		public static void main(String[] args) {
			Scanner sc_object = new Scanner(System.in);

			float test = sc_object.nextFloat();

			float lab = sc_object.nextFloat();

			float homework = sc_object.nextFloat();

			System.out.println(test*0.4+lab*0.1+homework*0.5);
		}
	}