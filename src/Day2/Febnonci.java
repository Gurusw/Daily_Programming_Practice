package Day2;

public class Febnonci {

	public static void main(String[] args) 
	{
		// Here we will print numbers in such a way like previous 2 numbers will be added to make the 3rd number
		// Initially we need 2 numbers
		int first=0, second=1, next;
		for(int i=1; i<10; i++)
		{
			System.out.print(first +",");
			next=first+second;
			second=first;
			first=next;
		}
	}

}
