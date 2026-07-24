package practicePrograms;

public class MinimumAndMaxiNumber {

	public static void main(String[] args)
	{
		int a[]= {1,42,65,13,2,1};
		int min=a[0];
		int max=a[0];
		for(int number: a)
		{
			if(number<min)min=number;
			if(number>max) max=number;
		}
		System.out.println(min);
		System.out.println(max);
	    

	}

}
