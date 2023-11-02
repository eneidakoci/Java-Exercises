package skedaret;
import java.io.*;
import java.util.*;
public class ReadFile {

	public static void main(String[] args) {
		try {
			File f = new File("hello.txt");
			Scanner in = new Scanner(f);
			while(in.hasNextLine()) {
				String data = in.nextLine();//do mbaje nje rresht
				System.out.println(data);
			}
			in.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
