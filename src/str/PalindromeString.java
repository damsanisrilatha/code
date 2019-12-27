package str;

public class PalindromeString {
	public static boolean isPalindrome(String s)
	{
	
		int j=s.length()-1;
		for(int i=0;i<(s.length())/2;i++)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
		
			j--;
			
		}
		return false;
	}

}

