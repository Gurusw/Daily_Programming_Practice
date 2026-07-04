package Day15;

public class minMax {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,44,33,234,-1};
		int min=ar[0];
		int max= ar[0];
		
		for(int n:ar)
		{
			if(n<min)min=n;
			if(n>max)max=n;
			
		}
		System.out.println("This is minimum value: "+min);
		System.out.println("This is maximum value:"+ max);

	}

}
