package Day15;

public class secondLargestNumber {

	public static void main(String[] args) 
	{
		int winner[]= {2,123,123,12,332,112,123,001};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num: winner)
		{
			if(num>largest)
			{
				
				second=largest;
				largest=num;
			}
			else if(num>second && num !=largest)
			
			{
				second=num;
			}
			
		}
		System.out.println(second);

	}

}
