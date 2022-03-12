//Amanda Nguyen Problem 3 Papers Please

import java.util.Scanner;

public class PapersPlease{
	public static void main(String[] args) {
		Scanner sc_object = new Scanner(System.in);

		boolean passport = sc_object.nextBoolean();
		boolean driver = sc_object.nextBoolean();
		boolean birth = sc_object.nextBoolean();

		boolean hasId = driver&birth;
		boolean enter =passport || hasId;
		System.out.println(enter);

		
	}
}