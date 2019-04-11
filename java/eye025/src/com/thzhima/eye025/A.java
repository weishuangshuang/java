package com.thzhima.eye025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A {
	
	String name = "a";
	
	void A() {
		
	}
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		Date sr = s.parse("2001-02-25");
		String c = s.format(sr);
		System.out.println(c);
		
		int a = (int) (1 + Math.random()*(9-1+1));
		System.out.println(a);
		
		int t = 0;
		int[] ar = new int[] {1,8,3,4,2,9,5};
//		
//		for(int i=0; i<ar.length-1;i++) {
//			for(int j=i+1; j<ar.length; j++) {
//				if(ar[i]>ar[j]) {
//					t = ar[i];
//					ar[i] = ar[j];
//					ar[j] = t;
//				}
//			}
//		}
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i;j++) {
				if(ar[j]>ar[j+1])
				t = ar[j];
				ar[j] = ar[j+1];
				ar[j+1] = t;
			}
		}
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
		}
		
		
	}
	
	
}
