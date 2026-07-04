package Day1;

import java.util.Scanner;

public class swampping {

	public static void main(String[] args)
	{
		//int a=10, b=98;
		
		
		Scanner ss= new Scanner(System.in);
		int a=ss.nextInt();
		int b=ss.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Enter value bellow");
		System.out.println("Value of a is"+ a);
		System.out.println("Value of b is"+ b);
		
		// TODO 

	}

}
