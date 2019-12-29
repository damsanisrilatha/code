package collection2;

import java.util.Queue;

import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(3);
		q.add(9);
		q.add(4);
		q.add(5);
		q.add(7);
		q.add(2);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		while(q.peek()!=null){
			System.out.println(q.poll());
		}
		
		
	}

}
