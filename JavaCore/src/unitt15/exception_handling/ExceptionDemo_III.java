package unitt15.exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * try with resources 
 * 
 * 
 */


public class ExceptionDemo_III {
	
	public static void main( String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in) );
        try {
			String str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		
	}

}
