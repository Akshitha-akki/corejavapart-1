package corejavapart_1;

import java.util.PriorityQueue;
import java.util.*;
public class Queue_Collection {

	public static void main(String[] args) 
	{
		Queue<Integer> q = new PriorityQueue<Integer>();
		//Offer
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		System.out.println("PriorityQueue : "+q);
		//add
		q.add(5);
		System.out.println("add : "+q);
		//poll
		//q.poll();
		System.out.println("poll : "+q.poll());
		System.out.println("Elements after poll : "+q);
		//peek
		System.out.println("peek : "+q.peek());
	}

}
