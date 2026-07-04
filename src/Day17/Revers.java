package Day17;

public class Revers {

	public static void main(String[] args)
	{
		
		String verge="gurug", reverse="";
		for(int i=verge.length()-1; i>=0; i--)
		{
			reverse=reverse+verge.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		if(verge.equals(reverse))
		{
			System.out.println("Its a Palindrom number");
		}
		else
		{
			System.out.println("It's not a palindrom");
		}

	}

}
