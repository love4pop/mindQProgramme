package exceptionpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class June {
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\admin\\Desktop\\Ammu");
		try {
			FileInputStream fis = new FileInputStream(f);
			} 
		catch (FileNotFoundException fne) {
			// TODO: handle exception
			System.out.println(fne.getMessage());
		    }
		
		System.out.println("work done");
	}

}
