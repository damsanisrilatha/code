package str;
import java.util.Scanner;
public class LetterOccurances {

	public static void main(String[] args) {
		System.out.print("enter a string:");
		Scanner scn =new Scanner(System.in);
		String s1=scn.next();
		while(s1.length()>0)
		{
			 char c=s1.charAt(0);
			 String s2=s1.replace(c+"","");
			 int n=s1.length()-s2.length();
			 System.out.println(c+"="+n);
			 s1=s2;
		}

}
}

