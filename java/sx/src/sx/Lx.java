package sx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lx {
	
	public static void main(String[] args) {
		
		List<Integer> st = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		List<Integer> z = new ArrayList<>();
		List<Integer> yb = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		
		st.add(100);
		st.add(40);
		st.add(80);
		st.add(67);
		st.add(97);
		st.add(93);
		st.add(76);
		st.add(82);
		st.add(64);
		st.add(50);
//		
//		for(Integer a : st) {
//			if(a>=90) {
//				y.add(a);
//			}else if(a>=80){
//				l.add(a);
//			}else if(a>=70){
//				z.add(a);
//			}else if(a>=60) {
//				yb.add(a);
//			}else {}
//			c.add(a);
//		}
//		
//		
//		for(Integer b : l) {
//			System.out.println(b);
//		}
		
		for(int i=0 ;i<st.size(); i++ ) {
			if(st.get(i)<60) {
				st.remove(i);
			}
		}
		
		
		for(Integer a : st) {
			System.out.println(a);
		}
		
		
		
	}

}
