package Day18;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="HomeMaker", reverse="";
		for(int i=a.length()-1; i>=0; i--)
		{
			reverse=reverse+a.charAt(i);
		}

		System.out.println(reverse);
		if(reverse.equals(a))
		{
			System.out.println("It is a palindrom");
		}
		else 
		{
			System.out.println("It is not a palindrom");
		}
		StringBuilder as= new StringBuilder("guru");
		System.out.println(as.reverse());
		StringBuffer bf= new StringBuffer("MadaM");
		System.out.println(bf.reverse());
		
	}

}
