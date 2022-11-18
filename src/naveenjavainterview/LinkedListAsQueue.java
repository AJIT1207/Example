package naveenjavainterview;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {

		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		
		queue.poll();
		
		System.out.println(queue);
		
		//we use push() and pop() method in linkedList in stack
		

	}

}
