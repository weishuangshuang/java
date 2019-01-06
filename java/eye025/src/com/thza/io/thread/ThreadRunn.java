package com.thza.io.thread;

public class ThreadRunn {
	
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("g1");
		
		Thread t = new Thread(g,new TH(), "小");
		t.start();
		
	}

}

class TH implements Runnable{

	
	public void run() {
		System.out.println(Thread.currentThread().getThreadGroup().getName()
				+"-----------"+Thread.currentThread().getName()
				);
		
	}
	
}
