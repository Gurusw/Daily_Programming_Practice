package Day12;

import java.util.Arrays;

public class Annagram {

	public static void main(String[] args)
	{
		String s1="Consistancy";
		String s2="Consistanyc";
		char[]a=s1.toCharArray();
		char []b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
		
		// If both the strings are same or equal we can say its an anagram 
		// If both strings contains same latter's we can say its an annagram 
		// If we reverse the string and we same name after reverse we can say its palindrom.
		
		// TODO Auto-generated method stub

	}

}
