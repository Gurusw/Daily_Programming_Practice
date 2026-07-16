package Day10;

public class PrimeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=4321;
		boolean value=true;
		
		for(int i=2; i<n/2; i++)
		{
			if(n%i==0)
			{
				value=false;
				System.out.println(n +" It's not a prime number");
				
				break;
			}
		}
			 if (value==true)
			{
				System.out.println(n +"It is a prime Number");
			}
		}

	}


