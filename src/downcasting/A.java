package downcasting;

public class A {
	void m1()
	{
		System.out.println("m1 in a");
		
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("m1 in b");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("m1 in c");
	}
}
class Test
{
	
	public static void main(String[] args) {
		A a1=new B();
		if(a1 instanceof C)
		{
			C c1=(C)a1;
		}

	}

	
}
