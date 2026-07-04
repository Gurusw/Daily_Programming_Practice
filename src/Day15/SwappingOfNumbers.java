package Day15;

public class SwappingOfNumbers {

	public static void main(String[] args) 
	{
		int a=32, b=34, c;
		c=a+b;
		a=c-a;
		b=c-b;
		
		System.out.println("Value of a:" +a +" "+"value of b:"+ b);
		int d=32, v=65;
		
		d=d+v;
		v=d-v;
		d=d-v;
		System.out.println(d);
		System.out.println(v);

	}

}
