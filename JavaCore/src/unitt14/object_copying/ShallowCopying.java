package unitt14.object_copying;

class A{
	
	int x;
	int y;

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

}

public class ShallowCopying {

	public static void main(String[] args) {
		
		A obj1 = new A();
		
		obj1.x = 10;
		obj1.y = 20;
		
		A obj2 = obj1;   // reference copying to obj2.
		// obj1 and obj2 has same reference and point the same object
		
		obj1.x = 30;  // also changed occurs in obj2
		
		System.out.println(obj2);
		System.out.println(obj1);
		
	}

}
