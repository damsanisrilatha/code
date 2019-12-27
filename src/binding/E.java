package binding;
//early binding
public class E {
	static void m1()
	{
		System.out.println("m1 in E");
	}
}
 class F extends E
 {
	 static void m1()
		{
			System.out.println("m1 in F");
		}
 }
 class G extends F
 {
	 static void m1()
		{
			System.out.println("m1 in G");
		}
 }
 class Main
 {
	public static void main(String[] args) {
		E e=new E();
		e.m1();//early binding(based on reference) 
		e=new F();
		e.m1();
		e=new G();
		e.m1();
		
	}

}
