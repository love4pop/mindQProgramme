package onlyJavaWhatHasDoneInClass;

public class ForloopExample {
	
	public static void main(String[] args) {
		 String str="automation";
		for (int x = 0; x < str.length(); x++) {
		char ch = str.charAt(x);
			System.out.println(ch);
		}
	
		for (int x = str.length()-1; x >= 0; x--) {
			char ch = str.charAt(x);
				System.out.println(ch);
			}
		
		for (int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);
				System.out.print(ch);
			}
	}

}
