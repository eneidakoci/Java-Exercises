package skedaret;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		try {
			File f = new File("krijoFile.txt");
			if(f.createNewFile()) {
				System.out.println("U krijua file");
			}else
				System.out.println("File ekziston tashme");
//			FileWriter fw = new FileWriter("krijoFile.txt");//krijon file
//			fw.write("File nuk eshte me bosh");//me kete tekst
//			fw.close();//mbyllim
		}catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
