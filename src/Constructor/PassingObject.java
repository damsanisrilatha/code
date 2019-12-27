package Constructor;

public class PassingObject {

	public static void main(String[] args)
	{
	A a1=new A(10);
	B b1=new B();
	b1.m2(a1);
	b1.m2(new A(10));
	}
}
	class A
	{
		int i;
		A(int i)
		{
			this.i=i;
		}
	
	
	}
	class B
	{
		void m2(A args)
		{
			System.out.println("m2 starts");
			System.out.println("arg i");
			System.out.println("m2 ends");
			
		}
	}


