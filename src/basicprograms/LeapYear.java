package  basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter year:");
		int y=s.nextInt();
		if(y%400==0)
		{
			System.out.println("leap year:");
			
		}
		else if(y%4==0&&y%100!=0)
		{
		
				System.out.println("leap year:");
		}
	else
	{
		System.out.println(" not a leap year:");
		
	}
	}
}


