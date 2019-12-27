package basicprograms;
import java.util.Scanner;
public class PrimeSir {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//System.out.println("enter a number:");
		int a=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				a=0;
				System.out.println(" is not a primenumber");
				break;
				
			}
		}
		if(a==1)
		{
			System.out.println("is a primenumber");
		}
	}
}
