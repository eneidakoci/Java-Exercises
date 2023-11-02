package skedaretBinare;
import java.io.*;
//numero bytet qe gjenden ne nje rryme

//LEXIMI BINAR
public class NumriIByteveNeRryme {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\Users\\User\\Desktop\\stuff\\friends_all_the_wedding_dresses.jpg");
		int total=0;
		while(in.read() != -1) {
			total++;
		}
		System.out.println(total);
		

	}

}
