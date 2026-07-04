package Day3;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		System.out.println("Enter the value here");
		Scanner ss= new Scanner(System.in); 
		int a = ss.nextInt();
		int b= ss.nextInt();
		int c=a+b;
		
		
		System.out.println("Here is the final output");
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
