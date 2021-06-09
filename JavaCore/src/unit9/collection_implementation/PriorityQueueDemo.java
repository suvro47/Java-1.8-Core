package unit9.collection_implementation;

import java.util.PriorityQueue;

// https://www.geeksforgeeks.org/implement-priorityqueue-comparator-java/

public class PriorityQueueDemo {
	
	public static void main() {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();  // create a priority queue with default initial capacity(11), 
		                                                               // default priority applied
		// Adding items to the pQueue using add() 
        pQueue.add(10); 
        pQueue.add(20); 
        pQueue.add(15);
        pQueue.add(30);
        
        pQueue.remove(15);  // element not index
        
        int head = pQueue.poll(); // pop out head 
  
        // Printing the top element of PriorityQueue 
        System.out.println(pQueue.peek()); 
  
        // Printing the top element and removing it 
        // from the PriorityQueue container 
        System.out.println(pQueue.poll()); 
  
        // Printing the top element again 
        System.out.println(pQueue.peek()); 
        
		
	}

}
