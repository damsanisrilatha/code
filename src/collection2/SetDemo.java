package collection2;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		System.out.println(s.add("java"));
		System.out.println(s.add("html"));
		System.out.println(s.add("java"));
		System.out.println(s.size());
	    for(Object obj :s)
	    {
	    	System.out.println("unique obj="+obj);
	    }
		
	}

}
