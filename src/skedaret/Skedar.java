package skedaret;
import java.io.*;

public class Skedar {

	public static void main(String[] args) {
		//File file = new File("message.txt");//beji paste skedarit tek projekti
		File file = new File("C:\\Users\\User\\Desktop\\message.txt");//file-properties-location. Ndahet me // ose \
		
		if(file.exists()) {
			System.out.println("Skedari ekziston :O");//mqs file ekziston afishohet ky statement
			System.out.println(file.getPath());//do afishonte vetem message.txt nqs do e kishim copy pasted into the project
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.delete());//e fshiu
			//tani afishohet else statement, skedari nuk ekziston
			
		} else {
			System.out.println("Skedari nuk ekziston :(");
		}

	}

}
