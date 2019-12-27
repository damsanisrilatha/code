package coding;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("is not a prime number:"+n);
			
		}
		if(count==2)
		{
			System.out.println("is a prime number:"+n);
			
		}

	}

}
