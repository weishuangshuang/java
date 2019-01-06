package com.thzhima.base;

public class Zc {
	public static void main(String[] args) {
		
		for(int i=2; i<10000; i++) {
			int count =0;
			for(int j=1; j<=i; j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+",");
			}
		}
	}

}
