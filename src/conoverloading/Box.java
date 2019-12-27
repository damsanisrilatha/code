package conoverloading;

public class Box 
{  
	int height;
    int width;
    int length;
	Box()
	{
	System.out.println("0 args constructor");	
	}
	Box(int h,int w,int l)
	{
		height=h;
		width=w;
		length=l;
	}
	Box(int n)
	{
		height=n;
		width=n;
		length=n;
	}
void display()
{
	System.out.println("["+height+","+width+","+length+"]");
}
}
class Test2
{
	public  static void main(String[] args) 
	{
		 Box b1=new Box(2,4,7);
		 Box b2=new Box();
		 Box b3=new Box(4);
		 b1.display();
		 b2.display();
		 b3.display();
	}
}


