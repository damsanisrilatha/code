package downcasting;

interface I1 {
	void m1();
}
class T
{
	 void m1()
	 {
		System.out.println("m1 in T "); 
	 }
}
class H extends T implements I1
{
	//*@Override
	public void m1()
	{
		super.m1();
		
	}
	
class Test4
{
	public static void main(String[] args) {
		
		
	}
}

