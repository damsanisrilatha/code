package upcasting;

public class A {
	void m1()
	{
		System.out.println("m1 in A");
	}
	}
class B extends A
{
	void m1()
	{
		System.out.println("m1 in B");
	}
}
class Test
{
	public static void main(String[] args) {
		A a1=new A();
		a1.m1();
		a1=new B();
		a1.m1();
	}

}
