package str;

import java.util.Scanner;

public class Pangram {
	static boolean isPangram(String s)
	{
		s=s.toLowerCase();
		for(char c='a';c<='z';c++)
		{ 
			if(s.indexOf(c)==-1)
		{
			return false;
		}
	
		return true;
		
		
	}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter string one: ");
		String s=scn.next();
	boolean b=isPangram(s);
	System.out.println(b);

	}

}