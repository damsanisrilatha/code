package scanner;
import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int m=s.nextInt();
		if(n>m)
		{
			System.out.println("n is greater");
			
		}
		else if(m>n)
		{
			System.out.println("m is greater");
			
		}
		else{
			System.out.println("both are equal");
			
		}
		
		// TODO Auto-generated method stub

	}

}
