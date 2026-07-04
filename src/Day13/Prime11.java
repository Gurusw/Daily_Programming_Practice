package Day13;

public class Prime11 {
	public static void main(String []ff)
	{
		int n=43, j=0;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				j=1;
				System.out.println("It's not a prime number");
				break;
				
			}
			
		}
		
		if(j==0)
		{
			System.out.println("It's prime number");
		}
	}
	
}