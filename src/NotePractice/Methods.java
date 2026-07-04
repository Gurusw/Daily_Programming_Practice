package NotePractice;

public class Methods 
{
	// No Parameter and No return type of method
	// Method is an block of statement which is used execute the instructions
	void m1()
	{
		System.out.println("Guruswamy your doing good today, You must need to continue this for 3 more months");
	}
	// Parameter and No return type of method
	void method2(char e)
	{
		System.out.println(e);
	}
	static int method3(int c)
	{
		int a=c+10;
		return(a);
	}
	
	

	public static void main(String[] args) 
	{
		Methods aa=new Methods();
		aa.m1();
		aa.method2('k');
		System.out.println(aa.method3(32));
		
		// TODO Auto-generated method stub

	}

}
