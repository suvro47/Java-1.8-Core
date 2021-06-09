package unitt12.static_keyword;

public class A {
	
	
	static int x = 0 ;  // static member | belongs to class
	int y;  // non-static / instance member | belongs to instance 
	
	
	public static void main( String[] args ) {
		
		System.out.println(x);
		// System.out.println(y); cause error | bcz y belongs to instance
		
		A obj = new A();
		obj.y = 10;
		System.out.println(obj.y);
		
		
		B obj2 = new B();
		obj2.setId(1);
		obj2.setName("sohel");
		obj2.setBalance(200000);
		B.setROI(20);
		obj2.setBalance((obj2.getBalance()*20)/100);
		
	}
	
	

}
