package collection2;

import java.util.LinkedList;

public class LinkedList1 {
	private Node first=null;
	private int count=0;
	public void add(Object e)
	{
		if(first==null){
			first=new Node(e,null);
			count++;
			return;
		}
		Node n=first;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new Node(e,null);
		count++;
	}
	public int size()
	{
		return count;
	}
	
	public Object get(int index){
		
		if(index>=size())throw new IndexOutOfBoundsException();
		Node n=first;
		for(int i=1;i<=index;i++)
		{
			n=n.next;
		}
		return n.data;
	}
public void add(int index, Object e)
{
	if(index>=size())throw new IndexOutOfBoundsException();
	if(index==0)
	{
		first=new Node(e,first);
		count++;
		return;
	}
	Node n= first;
	for(int i=1;i<index;i++)
	{
		n=n.next;

	}
	n.next=new Node(e,n.next);
	count++;
}
public void remove(int index)
{
	if(index>=size())throw new IndexOutOfBoundsException();
	if(index==0)
	{
		first=first.next;
		count--;
		return;
	}
	Node n=first;
	for(int i=1;i<index;i++)
	{
		n=n.next;
	}
	n.next=n.next.next;
	count--;
}

@Override
public String toString(){
	if(size()==0)
		return "[]";
	String s="[ ";
	Node temp=first;
	while(temp.next!=null){
		s=s+temp.data+" ----> ";
		temp = temp.next;
	}
	s=s+temp.data+" ]";
	return s;
}


public static void main(String[] args) {
	LinkedList1 l = new LinkedList1();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	System.out.println(l);
	l.size();
	l.add(50);
	System.out.println(l);
	l.add(2,5);
	System.out.println(l);
	l.remove(4);
	System.out.println(l);
	
	
	
}

}

/**
 * 
 * This class represents a node in linkedlist
 * 
 * @author Srilatha
 *
 */
class Node{
	Object data;
	Node next;


	Node(Object data,Node next){
		this.data = data;
		this.next = next;
	}
}
