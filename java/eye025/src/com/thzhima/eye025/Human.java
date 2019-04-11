package com.thzhima.eye025;


public class Human {
	String name;
	String gender;
	int age;
	
	
	
	public Human(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.print(this.name+"在");
	}
	
	public Human(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		
		System.out.print(this.name+"在");
		
	}

	public void sleep() {
		System.out.print("睡觉,");
	}
	
	public void eat() {
		System.out.print("吃,");
	}
	
	public void drink() {
		System.out.print("喝,");
	}
	
	public void work() {
		System.out.println("工作");
	}
	
	public static void main(String[] args) {
		
		Human peopleA = new Human("小明","男",18);
		
		
		peopleA.sleep();
		peopleA.eat();
		peopleA.drink();
		peopleA.work();
		
		Human peopleB = new Human("小红","女");
		peopleB.sleep();
		peopleB.eat();
		peopleB.drink();
		peopleB.work();
	}

	
	
}



