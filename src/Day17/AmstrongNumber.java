package Day17;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AmstrongNumber {

	public static void main(String[] args)
	{
		int n=153, temp=n,sum=0;
		while(temp>0)
		{
			int emp=temp%10;
			sum=sum+emp*emp*emp;
			temp=temp/10;
			
		}
		if(sum==n)
		{
		System.out.println("It's an amstrong number");
		}
		else
		{
			System.out.println("It's not an Amstrong number");
		}
		// TODO Auto-generated method stub

	}

}
