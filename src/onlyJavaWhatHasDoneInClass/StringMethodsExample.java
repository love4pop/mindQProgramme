package onlyJavaWhatHasDoneInClass;

public class StringMethodsExample {
	
	

	public static void main(String[] args) {
		String str="webdriver";
		
		int len=str.length();
		System.out.println(len);
		String upper=str.toUpperCase();
		System.out.println(upper);
		char ch=str.charAt(0);
		System.out.println(ch);
		char cha=str.charAt(5);
		System.out.println(cha);
		int word=str.indexOf("b");
		System.out.println(word);
		int charNo=str.indexOf("d");
		System.out.println(charNo);
		//int secondindex=str.indexOf("r", +1);
		//System.out.println(secondindex);
		String replacestring=str.replace("driver", "dr");
		System.out.println(replacestring);
	char ch1=str.charAt(0);
	System.out.println(ch1);
	char ch11=str.charAt(1);
	System.out.println(ch11);
}
}
