package my;

public class A {

	static String x = "李";
	
	 String m1;
	
	 String m2;
	
	 String m3;
	
	public A(String m1,String m2, String m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	
	
	public static void main(String[] args) {
		
		A a = new A("小明","小刚","小红");
	
		System.out.println(A.x+a.m1);
		System.out.println(A.x+a.m2);
		System.out.println(A.x+a.m3);
		
		A.x = "张";
		System.out.println(A.x+a.m1);
		System.out.println(A.x+a.m2);
		System.out.println(A.x+a.m3);
		
	}
	
	
	
}
