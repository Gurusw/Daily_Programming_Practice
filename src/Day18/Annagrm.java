package Day18;

import java.util.Arrays;

public class Annagrm {

	public static void main(String[] args) 
	{
		String a="gnn";
		String b="gnn";
		
		char ab[]=a.toCharArray();
		char ac[]=b.toCharArray();
		
		Arrays.sort(ab);
		Arrays.sort(ac);
		
		System.out.println(Arrays.equals(ab, ac));
		//System.out.println("");
		// TODO Auto-generated method stub

	}

}
