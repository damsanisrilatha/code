package collection2;

import java.util.*;

public class SortedSetDemo1 {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(45);
		s.add(3);
		s.add(23);
		s.add(11);
		s.add(27);
		s.add(19);
		System.out.println(s);
		System.out.println("first ele="+s.first());
		System.out.println("last ele="+s.last());
		SortedSet s1=s.headSet(23);
		display(s1);
		SortedSet s2=s.tailSet(23);
		display(s2);
		SortedSet s3=s.subSet(11,23);
		display(s3);
	}
	static void display(SortedSet s)
	{
		for(Object obj:s)
		{
			System.out.println(obj+"");
		}
		System.out.println();
	}

}
