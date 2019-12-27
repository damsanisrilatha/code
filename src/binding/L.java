package binding;

public class L
{
	void m1()
	{
		System.out.println("m1 in L");
		
	}
}
class M extends L {
	void m1()
	{
		System.out.println("m1 in M");
		
	}
}
class N extends L {
	void m1()
	{
		System.out.println("m1 in N");
		
	}
}
class Test
{
	

	public static void main(String[] args) {
		L l1=new L();
		l1.m1();//late binding
		 l1=new M();//based on instance
		l1.m1();//late binding
		l1=new N();
		l1.m1();//late binding
		
	}

}



	