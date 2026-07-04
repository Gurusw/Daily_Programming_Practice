package Day12;

public class Digits {

	public static void main(String[] args)
	{
		int a=1234;int sum=0;
		while(a>0)
		{
			
			sum+=a%10;
			a/=10;
		}
		System.out.println(sum);
		
	int b=123400000, count=0;
	while(b>0)
	{
		b=b/10;
		count++;
		//b=b%10;
	}
	System.out.println(count);
	}
}
