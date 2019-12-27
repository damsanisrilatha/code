package str;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		System.out.print("enter a string:");
		Scanner scn =new Scanner(System.in);
		String s=scn.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			 char c=s.charAt(i);
			 if(c>='A'&&c<='Z')
			 {
				 s1=s1+Character.toLowerCase(c);
			 }
			 else
			 {
				 s1=s1+Character.toUpperCase(c);
			 }
		}
		System.out.print(s1);
	}

}
