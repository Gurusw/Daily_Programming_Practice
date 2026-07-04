package Day14;

public class Palindrom {

	public static void main(String[] args) 
	{
		String s="Laptop", reverse="";
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);
		
		if(reverse.equals(s))
		{
			System.out.println("It's a palindrom");
		}

		else
		{
			System.out.println("It's not palindrom");
		}
	}

}
