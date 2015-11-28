package java_properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class writePropertiesFile {
	
	static boolean canread = false;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		Properties pi = new Properties();
		OutputStream out = null;
		InputStream in = null;
		
		try {
			out = new FileOutputStream("test.properties");
			in = new FileInputStream("test.properties");
			
			p.setProperty("database", "localhost");
			p.setProperty("user", "kun");
			p.setProperty("password", "password");

			// save properties to project root folder
			p.store(out, null);
			canread = true;
			
			if(canread)
			{
				pi.load(in);
				
				System.out.println(pi.getProperty("database"));
				System.out.println(pi.getProperty("user"));
				System.out.println(pi.getProperty("password"));
			}
			

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
