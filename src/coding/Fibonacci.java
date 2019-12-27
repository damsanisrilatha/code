package coding;

public class Fibonacci {
	public static void main(String args[])
	{
		int n1=0;
		int n2=1;
		int result=0;
		System.out.print("Fibonacci series: "  +n1+", "+n2);
		for(int i=3;i<=5;i++)
		{
			result=n1+n2;
		    n1=n2;
		    n2=result;
		    System.out.print(", "+result);
		}
		
	}


}
