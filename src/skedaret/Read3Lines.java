package skedaret;
import java.io.*;

public class Read3Lines {

	public static void main(String[] args) throws FileNotFoundException {
		
		String str = "";
		try {
			LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("hello.txt")));
			while(((str = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
				System.out.println(str);
			}
			reader.close();
		}catch(IOException e) {
			System.err.println("Error "+e.getMessage());
			
		}

	}

}
