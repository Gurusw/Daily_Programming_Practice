package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) 
	{
		
		int re[]= {1,2,3,2,3,2,4,5,5,5,55,11,22,12};
		HashSet hash= new HashSet();
		for(int dupli : re)
		{
			hash.add(dupli);
		}
		System.out.println(hash);
	}

}
