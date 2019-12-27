package collection2;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		System.out.println(a);
		//---------------------
		a.add(2,25);
		System.out.println(a);
		//-------------------
		int n =(Integer)a.get(2);
		System.out.println(n);
		//-----------------------
		a.set(3, 35);
		System.out.println(a);
		//----------------------------
		a.remove(0);
		System.out.println(a);
		//-----------------------------
		a.indexOf(50);
		System.out.println(a);
		//--------------------------------------
		a.lastIndexOf(70);
		System.out.println(a);
		//-----------------------------------
		a.indexOf(30);
		System.out.println(a);
		//----------------------------	
		
		System.out.println("final arraylist is="+a);
		System.out.println("again arraylist is="+a);
	}

}
