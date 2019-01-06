package com.thzhima.base;

public class Mp {
	public static void main(String[] args) {
		
		int str[] = {2,4,7,5,9,6};
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str.length-1-i; j++) {
				if(str[j]>str[j+1]) {
					int temp;
					temp=str[j+1];
					str[j+1]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]);
		}
		
	}
}
