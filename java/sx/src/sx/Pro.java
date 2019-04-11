package sx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;




public class Pro {
	
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		
		File f = new File(".//build//classes//sx//db.properties");
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(f);
			p.load(in);
			
			String userName = p.getProperty("user_name");
			System.out.println(userName);
			String pwd = p.getProperty("pwd");
			System.out.println(pwd);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
