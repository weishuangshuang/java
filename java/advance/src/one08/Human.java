package one08;

public class Human {
	
	private String age;
	
	private String a;
	
	private String b;
	
	public Human() {
		
	}
	
	public Human (String age,String a, String b) {
		this.age = age;
		this.a = a;
		 this.b = b;
		 
	}
	
	public boolean equals(Object n) {
		
		if(this == n) {
			return true;
		}
		if(n instanceof Human) {
			Human h = (Human)n;
			if(this.age.equals(h.age)) {
				return true;
			}
			if(this.a.equals(h.a)) {
				return true;
			}
			if(this.b.equals(h.b)) {
				return true;
			}
		}
		
		
		return false;
		
	}

}
