package unit9_collection_implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	

	public static void main( String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();  // implemented by dynamic array
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		// for loop 
		for(int i=0; i<arrayList.size(); i++) 
			System.out.println(arrayList.get(i));
		
		// advance for loop 
		for( Integer val: arrayList ) System.out.println(val);
		
		Iterator it = arrayList.iterator();
	    
		while (it.hasNext()) {
	         System.out.println(it.next());
	    }
		
	}
	
	
	

}
