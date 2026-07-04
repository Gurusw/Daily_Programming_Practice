package Day1;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args)
	{
	  int []a= {12,31,432,54,987};
	  //I want to check the smallest and larger values in this given array
	  
	  int small=a[0];
	  int big=a[0];
	  
	  for(int num:a)
	  {
		  if (num<small) small=num;
		  
		  if (num>big) big=num;	  
	  }
	  System.out.println(small);
	  System.out.println(big);
	

	}

}
