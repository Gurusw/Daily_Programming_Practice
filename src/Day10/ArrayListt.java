package Day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) 
	{
		//For homogeneous data types like "same type of data"
		ArrayList<Integer> mylist= new ArrayList<Integer>();
		mylist.add(123);
		mylist.add(12);
		mylist.add(1);
		System.out.println("1" +mylist);
		mylist.set(2, null);
		System.out.println("2" +mylist);
		mylist.remove(2);
		System.out.println("3" +mylist);
		for(int i=0; i<mylist.size(); i++)
		{
			System.out.println("4 " +mylist.get(i));
		}
		
		// Declaration this declaration is for heterogeneous values
		List mm=new ArrayList();
		mm.add(12);
		mm.add(123);
		mm.add(4);
		mm.add(4);
		System.out.println(mm);
		for(Object aa: mm)
		{
			mm.add(aa);
		}
		
		

	}

}
