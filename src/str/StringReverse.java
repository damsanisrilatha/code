package str;

import java.lang.String;

public class StringReverse {

			public static String isReverse(String s2)
			{
				String s1="";
				for(int i=s2.length()-1;i>=0;i--)
				{
					s1+=s2.charAt(i);
				}
				return s1; 
			}
	
			public  static void main(String[] args) 
			{
				String s2= "javascript";
				String s3=isReverse(s2);
				System.out.println(s3);

			}

}
