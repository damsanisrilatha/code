package basicprograms;

import java.util.Scanner;

public class NonPrimeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		int a=s.nextInt();
		int b=s.nextInt();
		int count=0;
		{
			for(int i=a;i<=b;i++)
				
			{
		
				if(Prime1.isPrime(i))
				
					{ 
						count++;//System.out.println(count);
					}
					
		
	
		}System.out.println(count);
		// TODO Auto-generated method stub

	}

}
		// TODO Auto-generated method stub

	}


