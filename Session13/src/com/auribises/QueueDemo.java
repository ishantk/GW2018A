package com.auribises;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}

		// 10 9 8 7 6 5 4 3 2 1
		
		// Data is Sorted
		// 1 2 3 4 5 6 7 8 9 10
		//System.out.println(queue.peek()); // Give me the head of Queue
		//System.out.println(queue.peek()); // Give me the head of Queue
		
		//System.out.println(queue.poll());  // Give the head and remove it
		//System.out.println(queue.poll());  // Give the head and remove it
		
		//System.out.println(queue.size());
		
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.poll());
		}
		
	}

}
