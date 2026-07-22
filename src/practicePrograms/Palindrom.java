package practicePrograms;

public class Palindrom {

	public static void main(String[] args) 
	{
		String name="MADAM", reverse="";
		for(int i=name.length()-1; i>=0; i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.println("Reversed word after code : " +reverse);
		if(name.equals(reverse))
		{
			System.out.println("It is a palindrom");
		}
		else
		{
			System.out.println(name +" Is not a palindrom");
		}

	}

}
