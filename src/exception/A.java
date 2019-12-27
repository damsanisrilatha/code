package exception;

import java.io.File;
import java.io.FileInputStream;

public class A {

	public static void main(String[] args) {
		
		
	
	try{
		
		m1();
		File f= new File("D:/Srilatha/abc.txt");
		/*FileInputStream fis= new FileInputStream(f);
		fis.read();*/
		Integer.parseInt("");
		
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception handled in m1()");
	}
	
	static void m1()
	{
		System.out.println("m2 starts");
		int a=10/0;
		System.out.println("m2 ends");
		
	}

}
