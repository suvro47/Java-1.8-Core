package collectionImpl;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main( String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();  // implemented by double linked list
		myList.add("suvro");
		myList.add("sohel");
		myList.add("sayan");
		
		myList.addFirst("tanvir");
		myList.addLast("rana");
		
		myList.add(1,"shuvro");  // index, value 
		
		for( String name:myList ) System.out.println(name);
		
	}

}


/*
*    LinkedList:
*    1. faster than array
*    2. Binary Search can't be applied 
*
*
*    ArrayList:
*    1. data insert and remove consumes time [O(n) for each operation] 
*    2. Binary Search can be applied
*
*/


