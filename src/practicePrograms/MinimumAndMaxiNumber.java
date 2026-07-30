package practicePrograms;

public class MinimumAndMaxiNumber {

	public static void main(String[] args)
	{
		// prime number
		int num=123;
		boolean value=true;
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				value=false;
				System.out.println("this is not prime number");
				
				break;
			}
		
			
		}
		if(value==true)
		{
			System.out.println("This is  Prime number");
		}

	}

}
