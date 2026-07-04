package Day1;

public class reverse {

	public static void main(String[] args)
	{
		String a="guru", reverse="";
		for(int i=a.length()-1; i>=0; i--)
		{
			reverse=reverse+a.charAt(i);
		}
		System.out.println(reverse);
		// TODO Auto-generated method stub
		StringBuilder ss= new StringBuilder("guruswamy");
		System.out.println(ss.reverse());

	}

}
