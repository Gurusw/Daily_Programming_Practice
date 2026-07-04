package Day18;

public class two 
{
	public static void main (String []a)

	{
		int n=1513, temp=n, sum=0;
		while(temp>0)
		{
			int ar=temp%10;
			sum=sum+ar*ar*ar;
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("It's an amstrong number");
		}
		else
		{
			System.out.println("It's not an amstrong number");
		}
		
	}
}
