package collection2;

import java.util.ArrayList;

public class ArrayList1 {
	private Object[] arr=new Object[3];
    private int p=0;
    public boolean  add(Object ele)
    {
    	if(p>=arr.length)increaseCapacity();
    	arr[p++]=ele;
    	return true;
    }
    public int size()
    {
    	return p;
    }
    private void increaseCapacity()
    {
    	Object[] temp=new Object[arr.length+5];
    	for(int i=0;i<arr.length;i++)
    	{
    		temp[i]=arr[i];
    	}
    	arr=temp;
    }
    public void add(int index,Object e)
    {
    	if(p>=arr.length)increaseCapacity();
    	for(int i=size()-1;i>=index;i--)
    	{
    		arr[i+1]=arr[i];
    	}
    	arr[index]=e;
    	p++;
    	if(index>=size())throw new  IndexOutOfBoundsException();
    }
 public void remove(int index)
 {
	 if(index>=size())throw new IndexOutOfBoundsException();
	 for(int i=index+1;i<size();i++)
	 {
		 arr[i-1]=arr[i];
		 
	 }
	 arr[--p]=null;
 }
 public Object get(int index)
 {
	 if(index>=size())throw new IndexOutOfBoundsException();
		 return arr[index];
 }
 public void clear()
 {
	 arr=new Object[5];
	 p=0;
 }
 public String toString()
 { 
	 if(size()==0)
		 return"[]";
	 String s="[ ";
	 for(int i=0;i<=size()-1;i++)
	 {
		s=s+(int)arr[i]+", "; 
		
	 }
	 s = s+ " ]";
	 return s;
 }
	public static void main(String[] args) {
		ArrayList1 a= new ArrayList1();
		a.add(20);
		a.add(14);
		a.add(25);
		a.add(37);
		a.add(34);
		System.out.println(a);
		//adding element
		a.add(1,16);
		System.out.println(a);
		//get element from the list
	     int n=(Integer)a.get(0);
         System.out.println("get index-0 : "+n);
         //removing element
         a.remove(3);
         System.out.println(a);
         //clear
         a.clear();
         System.out.println(a);
	
			
	}

}
