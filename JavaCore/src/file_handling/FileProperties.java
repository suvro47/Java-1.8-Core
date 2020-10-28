package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties {
	
	public static void main( String[] args) throws IOException {
		
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("newfile.properties");
		p.setProperty("url", "http://localhost:8080/employee/add");
		p.setProperty("username", "suvro");
		p.setProperty("password", "123456");
		p.store(os, null);  // properties saved
		
		
		InputStream is = new FileInputStream("newfile.properties");
		Properties p2 = new Properties();
		p2.load(is);
		System.out.println(p2.getProperty("url"));
		System.out.println(p2.getProperty("username"));
		System.out.println(p2.getProperty("password"));
		
		
	}

}
