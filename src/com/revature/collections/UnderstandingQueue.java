package com.revature.collections;


import java.util.PriorityQueue;

public class UnderstandingQueue {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for (int i= 10; i>0; i--) {
			//debug
			System.out.println(i);
			queue.add(i);
		}
		
		// Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
		//The PriorityQueue sorts the data out for us
		// Queue: (Front) 1 2 3 4 5 6 7 8 9 10 (Rear) -> Sorted Queue the Actual
		
		//Peeking -> Obtaining the head of the Queue
		//Polling -> Removing the head of the Queue
		System.out.println("Queue is: "+ queue);
		System.out.println("Queue Size is: "+ queue.size());
		System.out.println("Head of Queue is "+ queue.peek()); //Head of Queue (1)
		queue.poll(); //Removing the head (1)
		System.out.println("Head of Queue is "+ queue.peek()); //New Head of Queue (2));
		System.out.println("Queue Size after poll is: "+ queue.size());
		
		
	}

}
