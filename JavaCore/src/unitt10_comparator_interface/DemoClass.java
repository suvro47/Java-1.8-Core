package unitt10_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoClass {

	public static void main(String[] args) {
        
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(20);
		myList.add(10);
		myList.add(50);
		myList.add(40);
		
		myList.add(2,30);  // index , value 
		
		Comparator<Integer> comp = new ComperatorImpl();
		Collections.sort(myList,comp);  // sorting using comparator
		
	    myList.forEach(System.out::println);  // stream API : Lambda expression
		

	}

}
