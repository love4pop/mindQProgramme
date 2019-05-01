package homepractice;

public class Methodex {

	public static void main(String[] args) {
		Methodex o1 = new Methodex();
		int p1 = o1.sum(5, 6);
		Methodex o2 = new Methodex();
		int p2 = o2.sub(5, 6);
		Methodex o3=new Methodex();
		o3.compare(p1, p2);
		System.out.println(p1);
		System.out.println(p2);
	}

	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}

	public int sub(int a, int b) {
		int d = a-b;
		return d;
	}
	public void compare(int c, int d) {
		if (c>d) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("d is greater");
		}
	}
}
