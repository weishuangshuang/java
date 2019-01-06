package com.thzhima.base;

public class Actor extends Human{

	public String alias = "a1";
	
	public String role = "a2";
	
	public void drive() {
		System.out.println("drive");
	}
	
	public void sumba() {
		System.out.println("sumba");
	}
	
	
	public static void main(String[] args) {
		
		Human a = new Actor();
		
		System.out.println(a.gender);
		System.out.println(a.name);
		System.out.println(a.age);
		a.dance();
		a.sing();
		
		((Actor)a).sumba();
	
		
	}
	
}
