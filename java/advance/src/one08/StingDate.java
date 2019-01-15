package one08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StingDate {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String str = "2019-01-08 10:01:58";
		
		Date d = ymd.parse(str);
		
		System.out.println(d);
		
		String s = ymd.format(d);
		
		System.out.println(s);
		
	}

}
