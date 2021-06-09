package unit3.encapsulation;

public class A {

	public static void main(String[] args) {
		
		B obj = new B();
	    obj.setX(100);
	    obj.setV(10.0);
	    obj.setStr("suvro");
	    
	    System.out.println("name: " + obj.getStr() + " Marks: " + obj.getX() + " Point " + obj.getV());
	
	}

}
