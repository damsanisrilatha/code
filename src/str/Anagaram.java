package str;
import java.util.Scanner;
public class Anagaram {
	static boolean isAnagram(String s1,String s2)
	{
		while(s1.length()>0||s2.length()>0)
		{
			if(s1.length()!=s2.length())
			{
				return false;
			}
			char c=s1.charAt(0);
			s1=s1.replace(c+"","");
			s2=s2.replace(c+"","");
			
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter string one: ");
		String s1=scn.next();
		System.out.println("enter string two:");
		String s2=scn.next();
	boolean b=isAnagram(s1,s2);
	System.out.println(b);
	}

}
