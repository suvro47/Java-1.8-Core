package unitt14.object_copying;

class B implements Cloneable {
	
	int x;
    int y;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "B [x=" + x + ", y=" + y + "]";
	}
	
}


public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		B obj1 = new B();
		obj1.x = 10;
		obj1.y = 20;
		
		B obj2 = (B)obj1.clone();
		
		System.out.println(obj2);

	}

}
