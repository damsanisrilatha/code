/**
 * @author Srinivas
 *
 */

package basicprograms;

import java.util.Scanner;

public class AlternativePrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		int a=s.nextInt();
		int b=s.nextInt();
		int skip=0;
		if(b>a)
		{
			for(int i=a;i<=b;i++)
			{
		
				if(Prime1.isPrime(i))
				{
					if(skip%2==0)
					{
						System.out.println(i);
					}
					
				
			skip++;
	
		}
		// TODO Auto-generated method stub

	}

}
		// TODO Auto-generated method stub

	}

}
