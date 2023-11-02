package seminar4;
import java.util.Scanner;
public class Ush_8 {
/*Afisho fjalen e marre nga perdoruesi mbrapsht*/
			
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Jepni nje fjale: ");
		String fjale = scan.next();
		String fjale_rev = ""; 
		int size = fjale.length(); 
		for(int i=size-1; i>=0; i--) { 
			char ch = fjale.charAt(i); 
			fjale_rev += Character.toString(ch); 
		}
		
		System.out.println("Fjala "+fjale+" mbrapsht eshte "+fjale_rev+".");
		scan.close();
	}

}