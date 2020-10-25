package collectionImpl;

import java.util.Vector;

public class VectorDemo {
	
	public static void main() {
		
		Vector<Integer> v = new Vector<Integer>();  // implemented by dynamic array 
		v.add(4); 
		v.add(12);
		v.add(100);
		
		v.remove(1); // index
		
		for( int i : v ) {
			System.out.println(i);
		}
		
	}

}

/*
*    Vector:
*    1. Increase the capacity by 100%.  Waste memory 
*    2. Every Method in vector synchronized by default means ThreadSafe.
*    3. Slow 
*
*    ArrayList:
*    1. Increase the Capacity by 50%.
*    2. Get affected by threads.
*    3. Fast
*    
*    ArrayList is winner , much superior than vector 
*
*/