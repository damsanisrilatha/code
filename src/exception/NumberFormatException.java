package exception;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int n=0;
		try
		{
			System.out.println("try starts");
			 n=Integer.parseInt(s);
			 System.out.println("try ends");
			 
		}
		catch(java.lang.NumberFormatException e)
		{
			System.err.println("Exception occurred: "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Main ends here");
	}

}
