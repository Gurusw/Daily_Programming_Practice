package Day14;

public class Factoo {

	public static void main(String[] args) 
	{
		int first=0, second=1, next;
		for(int i=1; i<=5; i++)
		{
			System.out.println(first+" ,");
			next=first+second;//1,1,2
			second=first;//0,1,1
			first=next;//1,1,2
		}
		// TODO Auto-generated method stub

	}

}
