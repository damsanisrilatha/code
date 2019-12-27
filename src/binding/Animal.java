package binding;
//late binding
public class Animal {
	void makesound()
	{
		System.out.println("makesound() of animal");
	}
}
class Dog extends Animal
{
	void makesound()
	{
		System.out.println("bow bow");
	}
}
class Cat extends Animal
{
	void makesound()
	{
		System.out.println("meow meow");
	}
}
class Test1
{	public static void main(String[] args) {
	 zoo(new Dog());//late binding (based on instance)
	 zoo(new Cat());
	 
	}
    static void zoo(Animal a){
      a.makesound();
    	
    }
}
