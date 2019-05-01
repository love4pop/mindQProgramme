package onlyJavaWhatHasDoneInClass;

public class Inheritance extends Inheritance1 {
	public void div() {
		int i = 10;
		int j = 5;
		int k = i / j;
		System.out.println(k);
	}

	public static void main(String[] args) {

		Inheritance ob1 = new Inheritance();
		ob1.div();
		ob1.mul();

	}
}
