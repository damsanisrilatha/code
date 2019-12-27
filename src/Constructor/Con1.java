package Constructor;

public class Con1 {
	Con1()
	{
		System.out.println("executing constructor");
	}
	Con1(int i)
	{
		System.out.println("int value 10");	
	}
}
class Test2{
	
	public static void main(String[] args) {
		new Con1();
		System.out.println("...........");
		new Con1(1);

	}

}
