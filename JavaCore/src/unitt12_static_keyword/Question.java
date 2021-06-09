package unitt12_static_keyword;


// under a static method you cant access/define any non-static member variable

public class Question {
	
	int i = 8;

	public static void main(String[] args) {
        // i++;  this is not valid 
	}

}
