package Day1;

public class Palindrom
{
	public static void main(String []args)
	{
		String name="onenou", reverse="";
		for(int i=name.length()-1; i>=0; i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
	
	if(name.equals(reverse))
	{
		System.out.println(reverse +": It is a palindrom");
	}
	else
	{
		System.out.println(reverse +": It is not a palindrom");
	}
	}
}
