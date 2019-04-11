package sx;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Stacks{
	public static void main(String[] args) {
//		Stack<String> s = new Stack<>();
//		
//		s.push("1");
//		s.push("2");
//		s.push("3");
//		
//		while(!s.isEmpty()){
//			String a = s.pop();
//			System.out.println(a);
//			
//		}
		
		SortedSet<A> s = new TreeSet<>(new ACompartar()); //new TreeSet<>(new ACompartar());
		
		A a = new A(20);
		A aa= new A(30);
		A aaa = new A(40);
			
		
		s.add(a);
		s.add(aa);
		s.add(aaa);
		
		
		for(A d : s) {
			System.out.println(d.val);
		}
		
		
		
	}

}
