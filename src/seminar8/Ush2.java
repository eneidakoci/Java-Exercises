package seminar8;
/*2. Ndërtoni një program që lexon një skedar tekst. Lexoni secilin rresht të skedarit dhe shkruajeni atë
në skedarin output të ndjekur nga numri i rreshtit. Për shembull, nëse skedari input është:
Mary had a little lamb
Whose fleece was white as snow.
And everywhere that Mary went,
The lamb was sure to go!
programi duhet të prodhojë skedarin output:
/* 1  Mary had a little lamb
/* 2  Whose fleece was white as snow.
/* 3  And everywhere that Mary went,
/* 4 The lamb was sure to go!
Kërkoni nga përdoruesi emrat e skedarëve input dhe output.*/
import java.io.*;
import java.util.*;
public class Ush2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
	
		File inputFile = new File("mary.txt");
		Scanner in = new Scanner(inputFile);
		
	
		
		PrintWriter out = new PrintWriter("mary.txt");
		String s = "";
		int i = 1;
		while(in.hasNextLine()) {
			s = in.nextLine();
			out.printf("/* "+i+" */ "+s+"%n");
			i++;
		}
input.close();
in.close();
out.close();
	}

}
