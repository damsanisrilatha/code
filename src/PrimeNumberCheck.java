import java.util.Scanner;
public class PrimeNumberCheck {
	public static void main(String[] args) 
	{
		int temp;
		boolean isPrime=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
		temp=n/i;
		if(temp==0 ||temp==1)
		{
			isPrime=false;
			break;
		}
		
		}
		if(isPrime)
		System.out.print(n+  "isprime number");
		else
		System.out.print(n+  "is not a prime number");
		}
		}
		
