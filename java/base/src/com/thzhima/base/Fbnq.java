package com.thzhima.base;

public class Fbnq {
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		int sum = 2;
		int temp;
		for(int i=0; i<=sum; i++) {
			temp = b;
			b = a+b;
			a = temp;
			sum+=b;
			if(sum>=5000) {
				break;
			}
		}
		System.out.println(b);
	}

}
