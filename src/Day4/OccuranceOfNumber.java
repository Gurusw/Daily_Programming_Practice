package Day4;

public class OccuranceOfNumber {

	public static void main(String[] args)
	{
		String arr="Java programming";
		char ch=' ';
		int count=0;
		for(int i=arr.length()-1; i>=0; i--)
		{
			if(arr.charAt(i)==ch)
			{
				
				count++;
			}
		}
		System.out.println(count);
		
		
		// TODO Auto-generated method stub

	}

}
