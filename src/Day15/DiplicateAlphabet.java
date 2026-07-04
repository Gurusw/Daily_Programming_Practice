package Day15;

public class DiplicateAlphabet {

	public static void main(String[] args) 
	{
		String ar="negotiatittogn";
		char []b=ar.toCharArray();
	
		for(int i=0; i<=b.length-1; i++)
		{
			for(int j=i+1; j<=b.length-1; j++)
			{
				if(b[j]==b[i])
				{
					System.out.println(b[j]);
					break;
				}
			}
		}

	}

}
