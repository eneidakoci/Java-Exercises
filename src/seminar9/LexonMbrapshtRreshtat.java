package seminar9;
import java.util.*;
import java.io.*;

public class LexonMbrapshtRreshtat {

	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File("C:\\Users\\User\\eclipse-workspace\\myFirstProgram");
		Scanner in = new Scanner(inputFile);
		String s="";
		 List<String> tmp = new ArrayList<String>();
		 while(in.hasNext()) {
			 s = in.nextLine();
			 tmp.add(s);//shtojme te lista elementin s
		 }
		 
		 PrintWriter out = new PrintWriter("C:\\Users\\User\\eclipse-workspace\\UshtrimeKurs");//do afishohet te skedari2
		 for(int i = tmp.size()-1; i>=0; i++) {//e afishojme mbrapsht rreshtat te skedari tjeter, ku nje rresht do jete 1 string
			 String s2 = tmp.get(i);//me ane te metodes get() marrim vleren e indeksit ne ate pozicion
			 out.printf(s2+"%n");
		 }
		 
		 in.close();
		 out.close();
		 
		 
//		    do {
//		        ch = br.readLine();
//		        tmp.add(ch);
//		        out.print(ch+"<br/>"); 
//		    } while (ch != null);
//
//		    for(int i=tmp.size()-1;i>=0;i--) {
//		        out.print(tmp.get(i)+"<br/>");
//		    }

	}

}
