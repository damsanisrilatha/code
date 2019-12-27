  package basicprograms;
import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		int a=0, b=1,c=0;
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
		}
		

	}

}
