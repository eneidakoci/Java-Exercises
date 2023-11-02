package seminar9;
//Shkruani nj� program q� kryen detyrat e m�poshtme:
//Hap skedarin me emrin hello.txt.
//Ruaj mesazhin �Hello World!� n� skedar.
//Mbyll skedarin.
//Hap p�rs�ri skedarin.
//Lexo mesazhin n� nj� variab�l string dhe afishojeni at�.
import java.io.*;
public class Ushtrimi1 {

	public static void main(String[] args) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"));
		writer.write("Hello World!");
		writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//lexojme cfare kemi shkruar ne skedar
		//BR dhe leximet me te, duhet te afishohen brenda try
		try {
			BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));
			String a;
			while((a = reader.readLine()) != null) {
				System.out.println(a);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
