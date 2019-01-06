package advance;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Test> list = new ArrayList<>();
		
		Thread t = new Thread() {
			public void run() {
				try {
					for(int i=0; i<3 ; i++) {
						
						synchronized (list) {
							while(list.size()<10) {
								
								count+=1;
								System.out.println("生产："+count);
								Test c = new Test(count);
								list.add(c);
								Thread.sleep(1000);
							}
							list.notify();
							list.wait();
						}
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				try {
					for(int i=0; i<3 ; i++) {
						synchronized (list) {
							while(list.size()>0) {
								int idx = list.size()-1;
								Test t = list.get(idx);
								System.out.println("消费:" + t.id);
								list.remove(idx);
								Thread.sleep(1000);
							}
							list.notify();
							list.wait();
						}
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		
		t.start();
		t2.start();
		t.join();
		t2.join();

	}

}
