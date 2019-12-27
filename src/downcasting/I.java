package downcasting;

interface I {
	 final int j=10;
	 void m1();
}
class K implements I
{
	public void m1()
	{
		System.out.println(" m1()implements in A ");
	}
}
class Test5
{
	public static void main(String[] args) {
		I i1=new K();
		i1.m1();
		

	}

}
