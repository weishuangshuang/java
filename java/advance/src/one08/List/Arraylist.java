package one08.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Arraylist {
	
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<>();
		
		s.add("a");
		s.add(0, "b");
		s.add("b");
		
//		s.remove(1);
		
		System.out.println(s);
		
		List<String> v = new Vector<>();
		
		v.add("q");
		v.add("e");
		v.add(1, "w");
		
		System.out.println(v);
		
		List<Integer> v2 = new Vector<>();
		
		v2.add(1);
		v2.add(0, 1);
		
		System.out.println(v2);
		
	}

}
