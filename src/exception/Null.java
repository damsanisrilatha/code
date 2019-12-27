package exception;

public class Null {

	public static void main(String[] args) {
		System.out.println("main starts");
		String s=null;
		System.out.println(s.length());
		
		try{
			s.length();
		}
		catch(NullPointerException e)
		{   System.out.println("executing catch block"); 
			//System.out.println(e.getMessage());
		e.printStackTrace();
		}
	      }
		}
