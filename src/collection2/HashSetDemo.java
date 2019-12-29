package collection2;

import java.util.*;
 
public class HashSetDemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("java");
		s.add("c");
		s.add("springs");
		s.add("html");
		s.add("j2ee");
		s.add("sql");
		System.out.println(s);
		for(Object obj:s)
		{
			System.out.println(obj);
		}

	}

}
