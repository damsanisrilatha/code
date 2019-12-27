package basicprograms;

public class ReturnCall {

	public static void main(String[] args) {
		m1();
		// TODO Auto-generated method stub

	}
	public static void m1()
	{
		System.out.println("m1 starts");
		int i=2;
		switch(i)
		{
		case 1:System.out.println("executing case1");
		      return;
		case 2:System.out.println("executing case2");
		}
		System.out.println("m1 ends");
	}

}
