package unit9.collection_implementation;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	
	public static void main() {
		HashMap<String, Integer> myHashMap = new HashMap<>();
		myHashMap.put("suvro", 1602047);
		myHashMap.put("sohel", 1602048);
		myHashMap.put("sayan", 1602049);
		
		Set<String> keys = myHashMap.keySet();
		
		for( String key: keys) {
			System.out.println( myHashMap.get(key));
		}
	}

}


/*
*  HashMap:   
*  1. HashMap is not ThreadSafe means unsynchronized
*  2. It is fast
*  3. Allow one null key
*  4. Works with single thread
*  
*  HashTable:
*  1. HashTable is Thread Safe means synchronized 
*  2. It is slow
*  3. Dosen't allow null key
*  4. Works with multiple thread
*
*/