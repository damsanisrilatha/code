package collection2;
import java.util.Collection;
public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList l=new java.util.LinkedList();
	    l.add(3);
		l.add(6);
		l.add(9);
		l.add(23);
		l.add(28);
		java.util.LinkedList l2=new java.util.LinkedList();
		l2.add(34);
		l2.add(3);
		l2.add(16);
	    l2.addAll(l);
	    System.out.println("l2 ="+l2);
		System.out.println(l);
		l.add(2,30);
		System.out.println(l);
		l.remove(5);
		System.out.println(l);
		l2.retainAll(l);
		System.out.println("l2 retainall="+l2);
		System.out.println(l);
		l.clear();
		
		
	}

	
		
	}
