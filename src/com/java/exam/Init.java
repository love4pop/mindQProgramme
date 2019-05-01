package com.java.exam;

public class Init {
	String title;
	boolean published;
	static int total;
	static double maxPrice;
	
	public static void main(String[] args) 
	{
		Init initMe = new Init();
		double price;
		if (true)
		price = 100.00;
		System.out.println("|" + initMe.title + "|" + initMe.published + "|" +
		Init.total + "|" + Init.maxPrice + "|" + price+ "|");
	}


}
