package unitt15.exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo_II {

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
		int x = 0;
		try {
			System.out.println("Enter a number :");
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(x);
		}
		

	}

}
