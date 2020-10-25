package collectionImpl;

import java.util.HashSet;

public class HashSetDemo {
	
	
	public static void main( String[] args ) {
		
		HashSet<String> mySet = new HashSet<String>();
		
		mySet.add("suvro");
		mySet.add("sohel");
		mySet.add("sayan");
		
		mySet.add("suvro");  // duplicate entry 
		
		System.out.println(mySet.size());
	
		for( String name:mySet ) System.out.println(name);
	}

}
