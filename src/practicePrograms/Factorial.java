package practicePrograms;

public class Factorial {

	public static void main(String[] args)
	{
		
		// 1.We need number 
		// 2. Number should be decreased and multiplied every time.
		int a=9, factorial=1;
		for(int i=1; i<=a; i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
