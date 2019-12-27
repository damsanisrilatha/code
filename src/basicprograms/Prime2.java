package basicprograms;
import java.util.Scanner;
public class Prime2 {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter range");
	int a=s.nextInt();
	int b=s.nextInt();
	{
		for(int i=a;i<=b;i++)
		{
			if(Prime1.isPrime(i))
				System.out.println(i);
		}
	}
	
	
	
	
		
		// TODO Auto-generated method stub

	}

}
