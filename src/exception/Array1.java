package exception;

public class Array1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		int[] a= new int[2];
		a[0]=2;
		a[1]=5;
		a[2]=3;
		try{
			a[2]=3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{   System.out.println("main ends"); 
			e.getMessage();
			e.printStackTrace();
		}

	}

}
