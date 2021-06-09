package unit8_collection_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		/* 
		 * as Collection is an interface we can not create object of interface 
		 * ArrayList(class) implements Collection(interface)
		 *   
		 *   Collection (in)
		 *        |   extends
		 *       List (in)
		 *        |   implements 
		 *    ArrayList (c)
		 *     
		 */
		Collection values = new ArrayList<>(); // any value will be added as an object 
		
		Collection<Integer> myCollection = new ArrayList<Integer>();  // only integer allowed
		
		myCollection.add(100);
		myCollection.add(100);
		
		// myCollection.add(2,5); don't work
		// Collections.sort(myCollection); // collection can not be sorted 
		
		/* 
		 * index not allowed in collection
		 * so we will use list instead of collection 
		 *  
		 */
		
		for( int i : myCollection ) {
			System.out.println(i);
		}
		
		Iterator<Integer> i = myCollection.iterator();
		
		while( i.hasNext() ) {
			System.out.println(i.next());
		}
	}

}
