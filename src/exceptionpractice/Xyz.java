package exceptionpractice;

public class Xyz {
	
public static void main(String[] args) {
	
	int i=10;
	int j=0;
		
	try {
		int k=i/j;
	}

	catch (ArithmeticException obj) {
		// TODO: handle exception
		System.out.println(obj.getMessage());
		
	}
		
			
	System.out.println("I'm Ambika");
	
	
	}
}
