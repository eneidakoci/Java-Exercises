package seminar9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class youtube {

	public static void main(String[] args) {
		
		double[] numrat = {0.1, 2.37, 5.45, 7.5};
		
		
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//				writer.write("Writing to a file.");
//				writer.write("\nWriting to a file."); //e nxjerr ne rresht te ri
				
				for(double num : numrat) {
					writer.write("\n" + num);
				}
								
				//kur te kemi mbaruar se shkruajturi:
				writer.close();
			} catch (IOException e) {
				//Auto-generated catch block
				e.printStackTrace();
			}
		
		//reading to a file
			
			//afishon se cfare kemi shkruar te skedari me emrin output.txt
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while((line=reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();//mbyllim dhe file input
			//System.out.println(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			
		
		

	}

}