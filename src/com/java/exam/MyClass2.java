package com.java.exam;

public class MyClass2 {
	public static void main(String[] args) 
	{
		MyClass2 obj = new MyClass2(n);
	}
	static int i = 5;
	static int n;
	int j = 7;
	int k;
	public MyClass2(int m) 
	{
		System.out.println(i + ", " + j + ", " + k + ", " + n + ", " + m);
	}
	
	{ j = 70; n = 20; } // Instance Initializer Block
	static { i = 50; } // Static Initializer Block

	


}
