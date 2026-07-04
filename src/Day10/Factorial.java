package Day10;

//import java.util.logging.Logger;

public class Factorial {

	public static void main(String[] args)
	{
		int n=3, fact=1;
		for(int i=n; i>0; i--)
		{
			fact=fact*i;
		}

		System.out.println(fact);
	}

}
