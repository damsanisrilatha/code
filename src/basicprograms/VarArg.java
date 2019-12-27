package basicprograms;

public class VarArg {

	public static void main(String[] args) {
		m1();
		m1(3,4,5);
		m1(2,5,9,1);
	}
	static void m1(int... a)
	{
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}


