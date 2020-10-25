package collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	
	public static void main( String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(10);
		myList.add(20);
		myList.add(40);
		myList.add(50);
		
		myList.add(2,30);  // index , value 
		
		Collections.sort(myList); // list can be sorted 
		
	    myList.forEach(System.out::println);  // stream API : Lambda expression
	    
	    
		
	}

}
