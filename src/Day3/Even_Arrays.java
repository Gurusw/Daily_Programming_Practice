package Day3;

public class Even_Arrays {

	public static void main(String[] args)
	{
		int a[]= {12,21,43,323,441,33};
		System.out.println("These are even numbers in given array");
		for(int x:a)
		{
			
			if(x%2==0)
			{
				System.out.println(x);
			}
			
			else
		
		{
			System.out.println(x+" THis is not even numbers");
		}
		// TODO Auto-generated method stub
		}
	}

}
