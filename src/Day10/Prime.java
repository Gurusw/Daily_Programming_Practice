package Day10;

public class Prime {

	public static void main(String[] args)
	{
		int n=4321;
		boolean value=true;
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
