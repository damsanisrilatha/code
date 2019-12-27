package Constructor;

public class Student {
	String name;
	int phoneNum;
	static int count;
	
	Student(String n,int p)
	{
		name=n;
		phoneNum=p;
		count++;
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("phoneNum="+phoneNum);
		
	}
}
 class Test3
 {
	 
	public static void main(String[] args)
	{
		Student s1=new Student("srilu",234567);
		Student s2=new Student("minnu",156789);
		s1.display();
		s2.display();
		
	}
 }
 
