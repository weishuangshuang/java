package one08;

import java.util.ArrayList;
import java.util.Collection;

public class Eq {
	
	public static void main(String[] args) {
		
		 Human a = new Human("1","1","1");
		
		Human a2 = new Human("2","2","2");
		
		Human a3 = new Human("3","3","3");
		
		Human a4 = new Human("2","2","2");
		
		Collection<Human> c = new ArrayList<Human>();
		
		c.add(a);
		c.add(a2);
		c.add(a3);
		
		
			System.out.println(c.contains(a4));
			
			
		
		
		
		
		
	}

}
