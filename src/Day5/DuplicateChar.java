package Day5;

public class DuplicateChar {

	public static void main(String[] args)
	{
		String st="Prasanthii";
		char[] a=st.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					System.out.println(a[j]);
					break;
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
