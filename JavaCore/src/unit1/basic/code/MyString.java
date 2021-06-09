package unit1.basic.code;

public class MyString {
	
	public static void main( String[] args ) {
		
		String str = "Hello Java";
		System.out.println(str);
		
		String s1 = str.toLowerCase();
		System.out.println(s1);
		
		String s2 = str.toUpperCase();
	    System.out.println(s2);
		
	    String rep = str.replace('l', 'X');
	    System.out.println(rep);
	    
		System.out.println( rep.indexOf('X'));
	}

}
