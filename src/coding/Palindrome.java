package coding;

public class Palindrome {

	public static void main(String[] args) {
		String str="1234321";
		char [] array=str.toCharArray();
		int mid=(array.length-1)/2;
		int i=mid-1;
		int j=mid+1;
		boolean isPalindrome=true;
		while(i>=0&&j<=array.length)
		{
			if(array[i]!=array[j])
			{
				isPalindrome=false;
				System.out.println("this is not a palindome");
				break;
			}
		
			i--;
			j++;
		}
		
		if(isPalindrome){
			System.out.println("This is a palindrome");
		}
		
		
		
		
		
		}
		// TODO Auto-generated method stub

	}