package com.java.exam;

public class MyClass3 {
	public static void main(String[] args) 
	{
		Integer i = new Integer(-10);
		Integer j = new Integer(-10);
		Integer k = -10;
		System.out.print(i==j);
		System.out.print(i.equals(j));
		System.out.print(i==k);
		System.out.print(i.equals(k));
	}


}
