package seminar9;
//Shkruani një program që kryen detyrat e mëposhtme:
//Hap skedarin me emrin hello.txt.
//Ruaj mesazhin “Hello World!” në skedar.
//Mbyll skedarin.
//Hap përsëri skedarin.
//Lexo mesazhin në një variabël string dhe afishojeni atë.
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
