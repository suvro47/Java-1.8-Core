package unitt10.comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(20);
		myList.add(10);
		myList.add(50);
		myList.add(40);
		
		myList.add(2,30);  // index , value 
		
		// Comparator<Integer> comp = new ComperatorImpl();
		
		Comparator<Integer> comp = ( x,  y)-> {   // using lambda expression 
			if( x > y ) return 1;  // sorting logic
			// if( x%10 > y%10) return 1; according to last digit 
			return -1;
		};
		
		Collections.sort(myList,comp);  // sorting using comparator
		
	    myList.forEach(System.out::println);  // stream API : Lambda expression

	}

}


