package seminar9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ush1_filesYouTube {
//krijo nje file me emrin output1 dhe shkruaj ne te.
	public static void main(String[] args) {
		
		String[] emrat = {"ana", "beni", "mira", "ina"};
		
		
		//krijojme file me klasen BufferedWriter
		//asaj i nevojiten argumenta. Mqs duhet te shkruajme i japim si argument new FileWriter. Importojme librarite java.io.BW dhe java.io.FW
		//FW i japim si argument emrin e file qe do krijojme. Relativ(emri) ose absolut(C:\\....).
		//Na kerkon te bejme rreth saj try and catch, ku BW mbahet brenda try
		//Kur te mbarojme keto na krjohet file bosh te cilin e gjejme: right click-show in- system explorer- my First Program.
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));
			
			//pasi e krijuam file-in, me ane te objektit writer te klases BW, dhe me ane te metodes write() shkruajme aty
			writer.write("Ky rresht do afishohet ne file-in e krijuar me emer output2.");
			writer.write("\nRreshti i dyte.");
			
			for(String emri : emrat) {
				writer.write("\n"+emri);
			}
			
			//duhet mbyllur me patjeter skedari pasi te kemi mbaruar se shkruari aty.
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace(); //metode per te menaxhuar exceptions dhe errors
		}
		
		
		//"lexojme" cfare ka nje file si input
		//e bejme per ta afishuar ne console ate cka na eshte afishuar tek skedari output2 
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output2.txt"));
			String line;
			while((line=reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {      //default e nxorri Filenotfoundexception por duhet ta ndryshojme qe te jete i njejte me lart.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
