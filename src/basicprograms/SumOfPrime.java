package basicprograms;
import java.util.Scanner;
public class SumOfPrime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		if(b>a)
		{
			for(int i=a;i<=b;i++)
			{
		
				if(Prime1.isPrime(i))
					sum=sum+i;
				//System.out.println(sum);
				
			}
			System.out.println(sum);
		}
		// TODO Auto-generated method stub

	}

}
