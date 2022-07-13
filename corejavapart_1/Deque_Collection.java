package corejavapart_1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class Deque_Collection 
{
	public static void main(String[] args) 
	{
		Deque<Integer> deque=new LinkedList<Integer>();
		deque.offer(10);
		deque.offer(20);
		deque.offer(30);
		deque.poll();
		System.out.println(deque);
	}

}
