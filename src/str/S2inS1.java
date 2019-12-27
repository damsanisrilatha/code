package str;
import java.util.Scanner;
public class S2inS1 {

	public static void main(String[] args) {
		boolean result=true;
		Scanner scn =new Scanner(System.in);
		System.out.println("enter string one: ");
		String s1=scn.next();
		System.out.println("enter string two:");
		String s2=scn.next();
		for(int i=0;i<s2.length();i++)
		{
			 char c=s2.charAt(i);
			 if(s1.indexOf(c)==-1)
				 result = false;
			
		}
		System.out.println(result);

		

	}
}
