package collection_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main( String[] args) {
		
		Map<String,String> myMap = new HashMap<String, String>();  // HashTable also implements Map
		
		myMap.put("Dhaka","16200");
		myMap.put("Sylet", "16201");
		myMap.put("Chitagonj","16202");
		
		Set<String> keys = myMap.keySet();  // all these keys are set of values
		
		for( String key : keys ) {
			System.out.println( key + " " + myMap.get(key));
		}
		
	}

}



