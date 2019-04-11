package com.thzhima.eye025;

public class Student extends Human{

	public Student(String name, String gender, int age) {
		super(name, gender, age);
		
	}
	String studentid;
	String achievement;
	
	@Override
	public void work() {
		System.out.println("学习");
	} 
	
	public static void main(String[] args) {
		Human StudentA = new Student("小刚","男",18);
		
		StudentA.sleep();
		StudentA.eat();
		StudentA.drink();
		StudentA.work();
	}

	

}
