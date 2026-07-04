package Day9;

public class largeandsmall {

	public static void main(String[] args) 
	{
		int []aa= {12,11,2,33,44};
		int min=aa[0];
		int max=aa[0];
		for (int num:aa)
		{
			if(num<min)min=num;
			if(num>max)max =num;
		}
		System.out.println(min);
		System.out.println(max);
		

	}

}
