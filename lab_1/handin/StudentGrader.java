//Amanda Nguyen Problem 5 Student Grader

import java.util.Scanner;

public class StudentGrader{
		public static void main(String[] args) {
			Scanner sc_object = new Scanner(System.in);

			float test = sc_object.nextFloat();

			float homework = sc_object.nextFloat();

			float lab = sc_object.nextFloat();
			
			float testavg = 0.4f;

			float homeworkavg = 0.5f;

			float labavg = 0.1f;

			float average = test*testavg+homework*homeworkavg+lab*labavg;
			
			System.out.println(average);
		}
	}