package Day8;

public class SecondLargest {

	public static void main(String[] args)
	{
		int []a= {122,22,33,44};
		int largest=Integer.MIN_VALUE;
		int second =Integer.MIN_VALUE;
		for(int num:a)
		{
			if(num>largest)
			{
				second=largest;
				largest=num;
			}
			else if(num>second && num!=largest)
			{
				second=num;
			}
		}
			System.out.println("Second :"+second);
			System.out.println(largest);
		}
		
		
		
		// TODO Auto-generated method stub

	}


