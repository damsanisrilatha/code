package basicprograms;

public class VarArg1 {

	public static void main(String[] args) {
		int i=m1( )-2;
		System.out.println(i);
		int j=m1()*3;
		System.out.println(j);
		System.out.println(m1());
		m1();
	}
	static int m1()
	{
		System.out.println("executing m1");
		return 5;
	}
}








