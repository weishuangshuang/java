package com.thza.io.thread;

public class Threads {
	
	public static void main(String[] args) {
		
		Thread t1 = new Th();
		t1.start();
		
		
	}

}

class Th extends Thread{
	
	public void run() {
		
		System.out.println("----------"+ Thread.currentThread().getName());
	}
}
