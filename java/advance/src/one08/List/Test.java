package one08.List;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> s =  new ArrayList<>();
		
		List<Integer> cp = s;
		
		
		
		List<Integer> a = new ArrayList<>();
		List<Integer> a2 = new ArrayList<>();
		
		
		
		for(int j=0; j<10; j++) {
			s.add(j);
		}
		System.out.println(s);
		
		int len = s.size();
		int count = 0;
		
		do{
			
			a.clear();
			a2.clear();
			for(int i=0; i<len/2; i++) {
				a.add(s.get(i));
			}
			
			for(int i=len/2; i<len; i++) {
				a2.add(s.get(i));
			}
			System.out.println(a);
			System.out.println(a2);
			
			s.clear();
			for(int j=0; j<len/2; j++) {
				s.add(a.get(j));
				s.add(a2.get(j));
			}
			System.out.println(s);
			
			count++;
			System.out.println(cp);
			
		}while(!s.equals(cp));
		
		System.out.println(count);
		System.out.println(cp);
		
	}

}
