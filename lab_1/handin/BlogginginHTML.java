// Amanda Nguyen Problem 2: Blogging in HTML

import java.util.Scanner;

public class BloggingInHTML {
	public static void main(String[] args){
		Scanner sc_object = new Scanner(System.in);

		// first input represents the blog's header. 
		String header = sc_object.nextLine();

		//The second input is the image's file path.
		String image = sc_object.nextLine();

		//The third input is the post's text. 
		String text = sc_object.nextLine();

		//fourth input is the blog's author. 
		String author = sc_object.nextLine();

		//The fifth input is the post's
		String date = sc_object.nextLine();

		System.out.println("<html><body><h1>"+header+"</h1><img scr='"+image+"'/><p>"+text+"</p><small>By "+author+", "+date+"</small></body></html>");

	}
}
