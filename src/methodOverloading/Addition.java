package methodOverloading;


public class Addition {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
    public static void main(String[] args) {
	Addition addi = new Addition();
	addi.add(1,2);
	addi.add(1,2,3);
	addi.add(1,2,3,4);
	
    }

}
