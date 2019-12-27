package abstrac;

abstract class B {
	abstract void m1();
}
 class C extends B
{
   void m1()
   {
	   System.out.println("m1 implements in c");
   }
}
 class Test
 {
	 public static void main(String[] args)
	 {
		 C c1=new C();
		 c1.m1();
		 
	 }
 }
