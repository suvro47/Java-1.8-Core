package unit1_basic_code;

public class MyArray {
	
     public static void main( String[] args ) {
    	 
    	 
    	 int[] arr = { 12 , 3 , 45 , 55 , 33 }; // int arr[] = { 12,3 , 45, 555, 33 }; not preferred way
    	 int[] arr2 = new int[10]; // Dynamic : size specification must 
    	 
    	 int i = 0;
    	 while( i < 5 ) {
    		 System.out.println(arr[i]);
    		 i++;
    	 }
     }

}
