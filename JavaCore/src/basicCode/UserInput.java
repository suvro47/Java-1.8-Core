package basicCode;

import java.util.Scanner;

public class UserInput {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Integer number: ");
		int number = scan.nextInt();
		System.out.println(number);
		
		System.out.println("Enter a Double value: ");
		double val = scan.nextDouble();
		System.out.println(val);
		
		System.out.println("Enter a Text: ");
		String str = scan.nextLine();
		System.out.println(str);
		
		/*  
		 * we can also take input form user using bufferReader class object. 
		 *  see Exception handling demo II
		 */
	}

}
