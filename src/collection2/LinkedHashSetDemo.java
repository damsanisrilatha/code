package collection2;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add("java");
		s.add("c");
		s.add("springs");
		s.add("html");
		s.add("j2ee");
		s.add("sql");
		for(Object obj:s)
		{
			System.out.println(obj);
		}
		
		
	}

}
