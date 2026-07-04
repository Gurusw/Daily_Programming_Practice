package Day17;

public class secondLargestNumber {

	public static void main(String[] args)
	{
		int []a= {12,43,90, 99, 345};
		int largest= Integer.MIN_VALUE;
		int Second=Integer.MIN_VALUE;
		for(int num :a)
		{
			if(num>largest)
			{
				
				Second=largest;largest = num;
			}
			else if (num>Second && num !=largest)
			{
			 Second=num;
			}
		}
		System.out.println(Second +"THis is second largest value in the array");
		// TODO Auto-generated method stub

	}

}
