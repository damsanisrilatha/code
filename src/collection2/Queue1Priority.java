package collection2;

import java.util.Queue;

import java.util.PriorityQueue;

 class Queue1Priority {

	public static void main(String[] args) {
		Queue q =new PriorityQueue();
		q.add(14);
		q.add(5);
		q.add(20);
		q.add(8);
		q.add(2);
		q.add(1);
		q.add(17);
		q.add(28);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		//----------------------------------------
		while(q.peek()!=null)
		{
			System.out.println(q.poll());
		}
		

	}

}
