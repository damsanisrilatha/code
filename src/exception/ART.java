package exception;
import java.util.Scanner;
public class ART {
	public static void main(String[] args) {
		
		try{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
		static void m1()
		{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter x values");
		int x=scn.nextInt();
		System.out.println("enter y values");
		int y=scn.nextInt();
		System.out.println("my program");
		int z=x/y;
		System.out.println(z);
		}
		}
