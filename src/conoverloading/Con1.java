package conoverloading;

public class Con1 {
	Con1()
	{
	System.out.println("default constructor");	
	}
	Con1(int i)
	{
		System.out.println("parameterized  constructor");
	}
	Con1(int i,int j)
	
	{
		System.out.println("parameterized  constructor and 2 args");
		
	}
}
class Test1
{
	public static void main(String[] args)
	{
			 new Con1();
			 new Con1(2);
			 new Con1(2,5);
			 

	}

}

