package Day10;

public class Prime {

	public static void main(String[] args)
	{
		int n=101;
		boolean value=true;
		// / division operator: it removes he last value
		// % modulo division operator: It takes the last value if you do this with 10 value
		
		for( int i=2; i<n/2; i++)
		{
			if(n%i==0)
			{
				value = false;
				System.out.println(n +"is not prime number");
				break;
			}
			
		}
	 if (value==true)
		{
			System.out.println(n + " is a prime number");
		}
		
	}

}
