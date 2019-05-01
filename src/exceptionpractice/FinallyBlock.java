package exceptionpractice;

import java.io.FileNotFoundException;

public class FinallyBlock {
	public static void main(String[] args) {
	
	int j=10;
	int k=0;
	
	try {
	System.out.println(j/k);	
	} 
	catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Loveyourself");
	}
	
  }
	
}
	

