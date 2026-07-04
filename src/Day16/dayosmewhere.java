package Day16;

public class dayosmewhere {

	public static void main(String[] args) 
	{
		int []a= {23,43,54,45,9,9};
		int min=a[0];
		int max=a[0];
		
		for(int num:a)
		{
			if(num<min) min=num;
			if(num>max) max=num;
			
		}
		System.out.println(min+" "+ max);
		
		
		// TODO Auto-generated method stub

	}

}
