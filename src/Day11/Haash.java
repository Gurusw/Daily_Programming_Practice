package Day11;

import java.util.ArrayList;
import java.util.HashSet;

public class Haash {

	public static void main(String[] args) 
	{
		HashSet nn=new HashSet();
		nn.add(11);
		nn.add(null);
		nn.add(11);
		nn.add(null);
		System.out.println(nn);
		//System.out.println(nn.get(1));
		ArrayList al=new ArrayList(nn);
		System.out.println(al.get(1));
		
		// TODO Auto-generated method stub

	}

}
