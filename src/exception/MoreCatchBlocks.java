package exception;
import java.util.Scanner;
public class MoreCatchBlocks {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		//int x=scn.nextInt();
		//int n;
		try{
			String s=scn.next();
			 int n=Integer.parseInt(s);
		}
		catch(ArithmeticException e)
		{
			//e.getMessage();
			System.out.println(e.getMessage());
		}
		catch(java.lang.NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
