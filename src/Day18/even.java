package Day18;

public class even {
	public void method()
	{
		System.out.println("guru");
		
	}

	public static void main(String[] args) 
	{
		even ee=new even();
		ee.method();
		String vowel="interview";
		int vowels=0, consonent=0;
		char []a=vowel.toCharArray();
		for( char aa:a) {
			if("aeiou".indexOf(aa)!=-1) vowels++;
			else
			{
				consonent++;
			}
			
			
		}
		System.out.println(vowels );
		System.out.println(consonent);

	}

}
