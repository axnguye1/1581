import java.util.Scanner;

public class Test1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int cases = input.nextInt ();
	input.nextLine();

	for (int test = 0; test<cases; test++)
	{
	String sequence = input.nextLine();
	Scanner reader = new Scanner (sequence);
	while ( reader.hasNextInt()){
		int choice = reader.nextInt();
			System.out.format("You entered %d\n", choice);
			}
		}
	}
}