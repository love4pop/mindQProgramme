package overriding;

public class Child extends Parent {
	
    public void sub() {
		System.out.println(20-10);
	}
	public static void main(String[] args) {
		
	Child c = new Child();
	         c.add();
	         c.sub();
		
	}
	

}
