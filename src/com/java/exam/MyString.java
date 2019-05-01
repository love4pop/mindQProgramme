package com.java.exam;

public class MyString {
	private String str;
	MyString(String str) { this.str = str; }
	public void finalize() throws Throwable 
	{
		System.out.print(str);
		super.finalize();
	}
	public void concat(String str2) 
	{
		this.str.concat(str2);
	}
	public static void main(String[] args) 
	{
		new MyString("A").concat("B");
		System.gc();
	}


}
