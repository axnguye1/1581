//Amanda Nguyen Problem 4 BouncerBot

import java.util.Scanner;

public class BouncerBot{
		public static void main(String[] args) {
			Scanner sc_object = new Scanner(System.in);

			int thisMonth = sc_object.nextInt();
			int thisDay = sc_object.nextInt();
			int thisYear = sc_object.nextInt();

			int birthMonth = sc_object.nextInt();
			int birthDay = sc_object.nextInt();
			int birthYear = sc_object.nextInt();

			boolean isBday = (thisDay == birthDay) && (thisMonth == birthMonth);
			boolean isOver21= (thisYear-birthYear) >= 21;
			boolean canEnter = isBday && isOver21;

			System.out.println(canEnter);
		}
}