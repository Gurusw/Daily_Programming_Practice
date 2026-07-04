package Day14;

public class prime {

	public static void main(String[] args)
	{
		int n=300, b=0;
		for(int i=2; i<n/2; i++)
		{
			if(n%i==0)
			{
				b=1;
				System.out.println(" Its not a prime number");
				break;
			}
			
		}
		if(b==0)
		{
			System.out.println("Its prime number");
		}
		// TODO Auto-generated method stub

	}

}
