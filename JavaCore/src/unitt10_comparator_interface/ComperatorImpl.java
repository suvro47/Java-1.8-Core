package unitt10_comparator_interface;

import java.util.Comparator;

public class ComperatorImpl implements Comparator< Integer > {

	@Override
	public int compare(Integer x, Integer y) {
		if( x > y ) return 1;  // sorting logic
		// if( x%10 > y%10) return 1; according to last digit 
		else return -1;
	}

}
