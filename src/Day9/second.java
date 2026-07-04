package Day9;

public class second {

	public static void main(String[] args) 
	{
		
		int []ad= {23,43,44,222,43};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int min=ad[0];
		for(int num:ad)
		{
			if(num>largest) //23
			{
				second=largest;
				largest=num; //l=23
			}
			else if(num>second && num!=largest) //true
			{
				second=num;
			}
			
		}
		System.out.println(largest);
		
		for(int number: ad)
		{
			if(number<min)min=number;
		}
		System.out.println(min);
		System.out.println(second);
	}

}
