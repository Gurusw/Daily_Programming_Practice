package Day14;

public class digits {

	public static void main(String[] args)
	{
		int n=12344;
		int sum=0, count=0;
		while(n>0)
		{
			sum=sum+n%10;
			count++;
		n=n/10;	
		}
		System.out.println(sum);
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
