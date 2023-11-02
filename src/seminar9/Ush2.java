package seminar9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ush2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner (System.in);
		System.out.println("Jep emrin e skedarit input: ");
		String file = input.next();
		
		File inputFile = new File(" "+file);
		Scanner in = new Scanner(inputFile);
		
		System.out.println("Jep emrin e skedarit input:");
		String fileOut = input.next();
		PrintWriter out = new PrintWriter(" "+file);
		String s= "";
		int i = 1;
		while(in.hasNextLine()) {
			s = in.nextLine();
			out.printf(i+ " "+s+ "%n");
			i++;
			
		}
		in.close();
		out.close();
	}

}
