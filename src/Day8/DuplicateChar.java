package Day8;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		// I want to write program for finding the second largest number in the given array
		// I need one array integer data type, two variables for checking values
		int []a= {1,4,2,5,6,32};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
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
			System.out.println("Largest values is: "+ largest+" Second largest value is:  "+second);
		}
	}

	

