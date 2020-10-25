package object_passing;

/*
 * In java : everything is call by value
 * so when you pass an object, actually you passed the reference but it goes in a format of value/HashCode
 * 
 * in this example : you have passed Paper p in printer class and make chanaged in printer class
 * and it reflects in main class. [ call by reference ]
 */

class Printer{
	
	public void print( Paper p) {
		p.setText("Get Lost");
	}
	
}

class Paper{
	
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}

public class MyClass {

	public static void main(String[] args) {
		Paper p = new Paper();
		p.setText("Hello World");
        System.out.println(p.getText());
        
        Printer ptr = new Printer();
        ptr.print(p);
        
        System.out.println(p.getText());
        
	}

}
