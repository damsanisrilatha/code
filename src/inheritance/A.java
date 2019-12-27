package inheritance;

public class A{
	int i;
	void m1()
	{
		System.out.println(i);
	}
}
class B extends A
{
		int j;
		void m2()
		{
			System.out.println(j);
			//System.out.println(i);
		}
}
	
class Test1
{
	
	public static void main(String[] args) {
		B b1=new B();
		b1.j=10;
		A a1=new A();
		a1.i=20;
		b1.m2();
		a1.m1();
		
	}

}
