package coding;
import java.util.Scanner;
public class PrimeNumbersWithRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		for(int i=2;i<=n;i++)
		{ int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count>2)
			{
				System.out.println(" is not a primenumber:"+i);
				
			}
			if(count==2)
			{
				System.out.println("is a primenumber:"+i);
				
			}
			
		}
		
		

	}

}
