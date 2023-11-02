package skedaret;
import java.io.*;
public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("helloo.txt");
			fw.write("Hello people of earth!");
			fw.close();
			System.out.println("Shkruajtem ne file!!");
		}catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
