// Amanda Nguyen Problem 2: Blogging in HTML

import java.util.Scanner;

public class BlogginginHTML {
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

		System.out.print("<html><body><h1>"+header+"</h1><img scr='"+image+"'/><p>"+text+"</p><small>By"+author+","+date+"</small></body></html>");

//<html><body><h1>Header</h1><img src='image.png' /><p>text
	//description</p><small>By me, 08/01/2018</small></body></html>
	}
}
